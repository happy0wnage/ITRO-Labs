package kture.parser;

import kture.constants.Path;
import kture.constants.Tags;
import kture.entity.Manufacturer;
import kture.entity.MobilePhone;
import kture.entity.Phone;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by Владислав on 01.10.2015.
 */
public class SAXController extends DefaultHandler {

    private String xmlFileName;

    private Manufacturer manufacturer;

    private MobilePhone mobilePhone;

    private Phone phone;

    private String currentElement;

    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    public SAXController(String xmlFileName) {
        this.xmlFileName = xmlFileName;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        currentElement = localName;

        switch (localName) {
            case Tags.MOBILE_PHONE:
                mobilePhone = new MobilePhone();
                break;
            case Tags.PHONE:
                phone = new Phone();
                phone.setIdPhone(Integer.parseInt(attributes.getValue(0)));
                break;
            case Tags.MANUFACTURER:
                manufacturer = new Manufacturer();
                manufacturer.setIdManufacturer(Integer.parseInt(attributes.getValue(0)));
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {

        String elementText = new String(ch, start, length).trim();

        if (elementText.isEmpty()) {
            return;
        }

        switch (currentElement) {
            case Tags.MODEL:
                phone.setModel(elementText);
                break;
            case Tags.PRICE:
                phone.setPrice(Double.parseDouble(elementText));
                break;
            case Tags.NAME:
                manufacturer.setName(elementText);
                break;
            case Tags.FOUNDED:
                manufacturer.setFounded(Integer.parseInt(elementText));
                break;
            case Tags.INDUSTRY:
                manufacturer.setIndustry(elementText);
                break;
            case Tags.COUNTRY:
                manufacturer.setCountry(elementText);
                break;
            case Tags.SIM_CARD_NUMBER:
                phone.setSimCardNumber(Integer.parseInt(elementText));
                break;
            case Tags.SCREEN_SIZE:
                phone.setScreenSize(elementText);
                break;
            case Tags.RESOLUTION:
                phone.setResolution(elementText);
                break;
            case Tags.OS:
                phone.setOperationSystem(elementText);
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        switch (localName) {
            case Tags.PHONE:
                mobilePhone.getPhoneList().add(phone);
            case Tags.MANUFACTURER:
                phone.setManufacturer(manufacturer);
                break;
        }

    }

    @Override
    public void error(org.xml.sax.SAXParseException e) throws SAXException {
        throw e;
    }

    public MobilePhone parse() throws SAXException, IOException,
            ParserConfigurationException {

        SAXParserFactory factory = SAXParserFactory.newInstance();

        factory.setNamespaceAware(true);

        factory.setFeature(Path.FEATURE_TURN_VALIDATION_ON, true);
        factory.setFeature(Path.FEATURE_TURN_SCHEMA_VALIDATION_ON,
                true);

        SAXParser parser = factory.newSAXParser();
        parser.parse(xmlFileName, this);
        return mobilePhone;
    }

}
