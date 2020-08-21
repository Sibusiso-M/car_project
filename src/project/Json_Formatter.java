/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

/**
 *
 * @author 
 */

public class Json_Formatter implements FileFormatter{
private Car carInUse;

    public Json_Formatter(Car carInUse) {
        this.carInUse = carInUse;
    }

    @Override
    public String ConvertWrite() {

         Gson gson = new Gson();  
    
        // convert java object to JSON format,  
        // and returned as JSON formatted string  
       String json = gson.toJson(this.carInUse);  
    
  try {  
   //write converted json data to a file named "CarGSON.json"  
      FileWriter writer = new FileWriter("CarGSON.json");  
    writer.write(json); 
      System.out.println(json);
    writer.close();  
    
  } catch (IOException e) {  
   e.printStackTrace();  
  }  
    
  System.out.println(json);  
    return json;
    }
}