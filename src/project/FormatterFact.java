/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author 
 */
public  class FormatterFact {
    public FileFormatter getFormatter(String Type, Car car)
    {
        if(Type == null)
        {
            return null;
        }
        if(Type.equalsIgnoreCase("JSON"))
                {
                    return  new Json_Formatter(car);
                }
        if(Type.equalsIgnoreCase("XML"))
        {
            return new XML_Formatter(car);
        }
       return  null; 
    }
}
