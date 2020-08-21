/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author 
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
         Car car = null;
        try
        {
        car = new Car("BMW","044444", "Pretoria");
          FileOutputStream fos = new FileOutputStream("CarTxtFile.txt");
        
        ObjectOutputStream os = new ObjectOutputStream(fos);
                os.writeObject(car);
        }
        catch(Exception e){System.out.println("Errror");}
FormatterFact ff = new  FormatterFact();

FileFormatter fileFormatter = ff.getFormatter("JSON", car);

fileFormatter.ConvertWrite();

   
        
        FileFormatter fileXMLFormatter = ff.getFormatter("XML", car);

        
    }
    
}
