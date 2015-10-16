package kture.parser;

import kture.constants.Path;
import kture.constants.Tags;
import kture.entity.Manufacturer;
import kture.entity.MobilePhone;
import kture.entity.Phone;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Владислав on 01.10.2015.
 */
public class DOMParser {

    private String xmlFileName;

    private MobilePhone mobilePhone;

    public DOMParser(String xmlFileName) {
        this.xmlFileName = xmlFileName;
    }

    private MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    private Phone getPhone(Node phoneNode) {
        Phone phone = new Phone();
        Element phoneElement = (Element) phoneNode;

        Node currentNode;
        currentNode = phoneElement.getElementsByTagName(Tags.MODEL).item(0);
        phone.setModel(currentNode.getTextContent());

        currentNode = phoneElement.getElementsByTagName(Tags.PRICE).item(0);
        phone.setPrice(Double.parseDouble(currentNode.getTextContent()));

        currentNode = phoneElement.getElementsByTagName(Tags.MANUFACTURER).item(0);
        Manufacturer manufacturer = getManufacturer(currentNode);
        phone.setManufacturer(manufacturer);

        currentNode = phoneElement.getElementsByTagName(Tags.SIM_CARD_NUMBER).item(0);
        phone.setSimCardNumber(Integer.parseInt(currentNode.getTextContent()));

        currentNode = phoneElement.getElementsByTagName(Tags.SCREEN_SIZE).item(0);
        phone.setScreenSize(currentNode.getTextContent());

        currentNode = phoneElement.getElementsByTagName(Tags.RESOLUTION).item(0);
        phone.setResolution(currentNode.getTextContent());

        currentNode = phoneElement.getElementsByTagName(Tags.OS).item(0);
        phone.setOperationSystem(currentNode.getTextContent());

        return phone;
    }

    private Manufacturer getManufacturer(Node manufacturerNode) {
        Manufacturer manufacturer = new Manufacturer();
        Element manufacturerElement = (Element) manufacturerNode;

        Node currentNode;

        currentNode = manufacturerElement.getElementsByTagName(Tags.NAME).item(0);
        manufacturer.setName(currentNode.getTextContent());

        currentNode = manufacturerElement.getElementsByTagName(Tags.FOUNDED).item(0);
        manufacturer.setFounded(Integer.parseInt(currentNode.getTextContent()));

        currentNode = manufacturerElement.getElementsByTagName(Tags.INDUSTRY).item(0);
        manufacturer.setIndustry(currentNode.getTextContent());

        currentNode = manufacturerElement.getElementsByTagName(Tags.COUNTRY).item(0);
        manufacturer.setCountry(currentNode.getTextContent());

        Node attributeId = manufacturerElement.getAttributes().item(0);
        manufacturer.setIdManufacturer(Integer.parseInt(attributeId.getNodeValue()));

        return manufacturer;
    }


    public MobilePhone parse() throws ParserConfigurationException,
            SAXException, IOException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);

        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.parse(xmlFileName);
        Element root = doc.getDocumentElement();

        MobilePhone mobilePhone = new MobilePhone();

        NodeList drugNode = root.getElementsByTagName(Tags.PHONE);

        for (int i = 0; i < drugNode.getLength(); i++) {
            Phone phone = getPhone(drugNode.item(i));
            mobilePhone.getPhoneList().add(phone);
        }

        return mobilePhone;
    }

    public static void main(String[] args) {
        DOMParser domParser = new DOMParser(Path.PHONE);
        try {
            MobilePhone mobilePhone = domParser.parse();
            System.out.println(mobilePhone);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
