package kture.parser;

import kture.constants.Path;
import kture.entity.MobilePhone;
import kture.parser.JAXB.Unmarshalling;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Владислав on 22.10.2015.
 */
public class Demo {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, JAXBException {


        System.out.println("================DOM_PARSER================");
        DOMController domParser = new DOMController(Path.PHONE);
        MobilePhone mobilePhone2 = domParser.parse();
        System.out.println(mobilePhone2);


        System.out.println("================SAX_PARSER================");
        SAXController saxController = new SAXController(Path.PHONE);
        MobilePhone mobilePhone1 = saxController.parse();
        System.out.println(mobilePhone1);

        System.out.println("================JAXB_UNMARSHAL================");
        Unmarshalling.main(new String[] {});

    }
}
