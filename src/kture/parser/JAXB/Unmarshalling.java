package kture.parser.JAXB;

import kture.constants.Path;
import kture.entity.MobilePhone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Владислав on 19.10.2015.
 */
public class Unmarshalling {

    public static void main(String[] args) throws JAXBException {

        JAXBContext jc = JAXBContext.newInstance(MobilePhone.class);
        Unmarshaller u = jc.createUnmarshaller();
        MobilePhone mobilePhone = (MobilePhone) u.unmarshal(new File(Path.PHONE));
        System.out.println(mobilePhone);


    }
}
