package com.stackroute.pe3;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumberCheck {
    public String consecutiveChecker(int[] consecutiveNumbers){
        if(consecutiveNumbers.length>1){
        for (int i=0;i<consecutiveNumbers.length-1;i++){

            if(consecutiveNumbers[i+1]-consecutiveNumbers[i]==1){
                return "They are consecutive numbers";
            }
            else {return "They are not consecutive";}
        }}
return "cannot find if the input is single value";
}}
