/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculate;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 *
 * @author bijay
 * @version beta
 * @
 */
public class TaxCalculator {
    /**
     * @param mincome,mallowance,cit, 
       */
        Scanner input = new Scanner(System.in);
        int mincome;
        float mallowance;
        float cit;
        float insurance;
        float pf;
        float totalincome;
        float totalallowance;
        String mstatus;
        String gender;
        String Name;
        float totaltax;
        public void input(){
        
            System.out.println("Enter your Name");
        Name=input.nextLine();
        
        System.out.println("Enter your marital Status (Married/Single)");
        mstatus=input.nextLine();
        
        System.out.println("Enter your gender (M/F)");
        gender=input.nextLine();
        
        System.out.println("Enter Monthly income");
        mincome=input.nextInt();
        totalincome=mincome*12;
      
        System.out.println("Enter Monthly Allowance");
        mallowance=input.nextFloat();
        totalallowance=mallowance*12;
      
        System.out.println("Enter Insurance Premium");
       insurance=input.nextFloat();
        while(insurance>20000)
      {
      System.out.println("Insurance premium Should be less than 20000");
      insurance=input.nextFloat();      
      }
      System.out.println("Enter Provident Fund");
      pf=input.nextFloat();
      while(pf>10)
      {
      System.out.println("Enter Provident Fund should be less than 10%");
      pf=input.nextFloat();      
      }
        }
        public void calculate(){
       
            float pfamt;
            pfamt = (pf*totalincome)/100;
            cit=(33-2*pf);
            System.out.println("cit="+cit);
            System.out.println("pfamt="+pfamt);
            cit=(cit*(totalincome+pfamt+totalallowance))/100;
            System.out.println("tot="+totalincome);
            System.out.println("cit="+cit);
            float taxdcit=0;
            if(cit>300000)
        {
        
            taxdcit = cit-300000;
            cit=300000;
                }
       totalincome=totalincome-cit-pf-insurance+taxdcit+totalallowance;
       System.out.println("tot="+totalincome);
       if(totalincome<0) totalincome=0;
		if(mstatus.equalsIgnoreCase("married")){
			if(totalincome<=200000) totaltax=totalincome*0.01f;
			else if(totalincome<=300000) totaltax=200000*0.01f+(totalincome-200000)*0.15f;
			else totaltax=200000*0.01f+100000*0.15f+(totalincome-300000)*0.25f;
		}
		else{
			if(totalincome<=160000) totaltax=totalincome*0.01f;
			else if(totalincome<=260000) totaltax=160000*0.01f+(totalincome-160000)*0.15f;
			else totaltax=160000*0.01f+100000*0.15f+(totalincome-260000)*0.25f;
		}
                
                if(gender.equalsIgnoreCase("f"))
                {
                totaltax=9*totaltax/100;
                System.out.println("TAX="+totaltax);
                }
                else{
                System.out.println("TAX="+totaltax);
                }
       
        System.out.println("Total income="+totalincome/12);
        System.out.println("PF ="+pfamt*2/12);
        System.out.println("CIT="+cit/12);
        
    
        }}
