package com.stackroute.pe3;

import java.util.Arrays;
import java.util.Scanner;

public class VowelRemover {
    public String[] alphabetRemoveMethod(String[] countryList){
        System.out.println("Enter Number of countries");
        Scanner scanner=new Scanner(System.in);
        int numberOfElements=scanner.nextInt();
        countryList =new String[numberOfElements];
        System.out.println("Enter Country names: ");
        for(int i=0;i<numberOfElements;i++){
            String temporary=scanner.next();
            countryList[i]=temporary;
        }
        Arrays.toString(countryList);

   return null; }
}
