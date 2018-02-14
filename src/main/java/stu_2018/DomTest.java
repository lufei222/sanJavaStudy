package stu_2018;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomTest {
    //xml常见四种解析方式，1、dom，2、sax，3、jdom，4、dom4j

    public DomTest() throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();

        DocumentBuilder db=dbf.newDocumentBuilder();

        Document dm=db.parse("rec\\books.xml");
        int a[]=new int[3];

    }
}
