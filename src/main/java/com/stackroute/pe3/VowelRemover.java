package com.stackroute.pe3;

import java.util.Arrays;
import java.util.Scanner;

  public class VowelRemover {
      /*public String[] alphabetRemoveMethod(String[] countryList){
        System.out.println("Enter Number of countries");
          Scanner scanner=new Scanner(System.in);
          int numberOfElements=scanner.nextInt();
          countryList =new String[numberOfElements];
          System.out.println("Enter Country names: ");
          for(int i=0;i<numberOfElements;i++){
              String temporary=scanner.next();
              countryList[i]=temporary;
          }
          for (int i=0;i<countryList.length;i++){
              for(int j=1;j<countryList[i].length();j++){
                  if(countryList[i].charAt(j)==('a')||
                          countryList[i].charAt(j)==('e')||
                          countryList[i].charAt(j)==('i')||
                          countryList[i].charAt(j)==('o')||
                          countryList[i].charAt(j)==('u')){
                      countryList[i].replace(countryList[i].charAt(j),' ');
                  }
              }
          }
          return countryList; }
  }*/
        public String [] alphabetRemoveMethod(String[] input){

            if(input == null)
                return null;

            String[] output = new String[input.length];

            for (int i=0; i < input.length; i++){
                output[i] = input[i].replaceAll("[aeiou]","");
            }

            return output;
        }}
