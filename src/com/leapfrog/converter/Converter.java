/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.converter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 *
 * @author bijay
 */
public class Converter {
    public static void main(String[] args) throws ClassNotFoundException
    {
    Class c=Class.forName("com.leapfrog.converter.Entity");
    Field[] fetch=c.getFields();
    String[] str=new String[fetch.length];
    for(int i=0;i<str.length;i++)
    {
   str[i]=fetch[i].getName().toString();
   System.out.println(str[i]);
    }

    String strv;
 StringBuilder sb=new StringBuilder();
 sb.append("<html><table>");
    
    
    try
{
    String filename= "bj.html";
    FileWriter fw = new FileWriter(filename,true); 
    BufferedWriter bufferwriter = new BufferedWriter(fw);
                 int i =0;//the true will append the new data
  
                 while(i<str.length){
                     strv= str[i];
                     sb.append("<td>");
                     sb.append(strv);
                     sb.append("</td><td><input type=text name="+strv+"name");
                     sb.append("</td></tr>");
                     i++;
                }
                 sb.append("</table></body>");
                 sb.append("<input type=submit value=submit>");
                 sb.append("</html>");
//                 System.out.println("output is:"+htmlform);
                
                bufferwriter.write(sb.toString());
                bufferwriter.close();
                 fw.write("add a line\n");
   //appends the string to the file
   
                 
                 fw.close();
}
catch(IOException ioe)
{
    System.err.println("IOException: " + ioe.getMessage());
}
   // StringBuffer sb = new StringBuffer(fetch.length());

    
    
    }
    
}
