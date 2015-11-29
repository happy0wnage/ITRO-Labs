package kture.parser.JAXB;

import kture.entity.Manufacturer;
import kture.entity.MobilePhone;
import kture.entity.Phone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 19.10.2015.
 */
public class Marshalling {

    public static void main(String[] args) throws JAXBException {

        MobilePhone mobilePhone = new MobilePhone();
        Phone phone = new Phone();
        phone.setIdPhone(1);
        phone.setModel("MX 5");
        phone.setPrice(8600);
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setIdManufacturer(1);
        manufacturer.setName("Meizu");
        manufacturer.setFounded(2005);
        manufacturer.setIndustry("IT");
        manufacturer.setCountry("China");
        phone.setManufacturer(manufacturer);
        phone.setSimCardNumber(2);
        phone.setScreenSize("5.5'");
        phone.setResolution("1920x1080");
        phone.setOperationSystem("Android");
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(phone);
        mobilePhone.setPhoneList(phoneList);

        try {
            File file = new File("web/xml/phone_generated.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(MobilePhone.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(mobilePhone, file);
            jaxbMarshaller.marshal(mobilePhone, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
