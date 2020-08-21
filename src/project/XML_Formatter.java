/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.xml.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBException;

/**
 *
 * @author 
 */
public class XML_Formatter implements FileFormatter{

private Car car;

    public XML_Formatter(Car car) {
        this.car = car;
    }
 
    @Override
    public String ConvertWrite() {
        JAXBContext jAXBContext = null ;
         String xmlcontent = "";
    try {
        jAXBContext = JAXBContext.newInstance(Car.class);
           Marshaller jMarshaller = jAXBContext.createMarshaller();
           
           jMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
           StringWriter sw = new StringWriter();
           
           //File file = new File("Car.xml");
           jMarshaller.marshal(this.car, sw);
           
          xmlcontent = sw.toString();
          System.out.println(xmlcontent);
    } catch (JAXBException ex) {
        Logger.getLogger(XML_Formatter.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch(Exception e){}
     
    return xmlcontent ;
   
    }


}
