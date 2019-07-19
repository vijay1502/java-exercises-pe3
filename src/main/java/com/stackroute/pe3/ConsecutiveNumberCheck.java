package com.stackroute.pe3;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumberCheck {
    public String consecutiveChecker(String[] consecutiveNumbers){
        Scanner scanner=new Scanner(System.in);
        int numberOfIntegers=scanner.nextInt();
        consecutiveNumbers=new String[numberOfIntegers];
        for(int i=0;i<numberOfIntegers;i++){
            String temporary=scanner.next();
            consecutiveNumbers[i]=temporary;
        }
       String consecutive=Arrays.toString(consecutiveNumbers);
        String[] consecutiveArray=consecutive.split(",");
return null;
    }
}
