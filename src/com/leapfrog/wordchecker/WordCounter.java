/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.wordchecker;

/**
 *
 * @author bijay
 */


import java.util.*;  
import java.io.*;    

public class WordCounter
{
   public static void main(String[ ] args)  
   {   
      TreeMap<String, Integer> frequencyData = new TreeMap<String, Integer>( );

      readWordFile(frequencyData); 
      printAllCounts(frequencyData);
   }

   public static int getCount
   (String word, TreeMap<String, Integer> frequencyData)
   {
      if (frequencyData.containsKey(word))
      { 
	   return frequencyData.get(word); 
      }
      else
      {  
         return 0;
      }
   }

   public static void printAllCounts(TreeMap<String, Integer> frequencyData)
   {
      System.out.println("-----------------------------------------------");
      System.out.println("    Occurrences    Word");

      for(String word : frequencyData.keySet( ))
      {
        // System.out.printf("%15d    %s\n", frequencyData.get(word), word);
      
      
      
      }
     
      System.out.println("-----------------------------------------------");
   }  

   public static void readWordFile(TreeMap<String, Integer> frequencyData)
   {
      Scanner wordFile;
      String word;     
      Integer count;   

      try
      {
         wordFile = new Scanner(new FileReader("/home/bijay/Desktop/words.txt"));
      }
      catch (FileNotFoundException e)
      {
	 System.err.println(e);
	 return;
      }
      
      while (wordFile.hasNext( ))
      {
          
	  word = wordFile.next( );

          
          count = getCount(word, frequencyData) + 1;
          frequencyData.put(word, count);
      }
   } 

}
