package com.stackroute.pe3;

import java.io.*;
import java.util.*;

public class RepetitionOfWords {
    public String wordRepetition(File file) throws Exception {

        /*File file = new File("/home/cgi/Desktop/Content");*/
        Scanner scanner=new Scanner(file);
        String string;
       if((string = scanner.nextLine()) != null){
            String[] wordsArray=string.split(" ");
           String[] output=new String[wordsArray.length];
           int count=1;

            for(int i=0;i<wordsArray.length;i++)
            {
                for(int j=i+1;j<wordsArray.length;j++)
                {

                    if(wordsArray[i].equals(wordsArray[j]))
                    {
                        count=count+1;
                        wordsArray[j]="";

                    }
                }
                if(wordsArray[i]!=""){
                    output[i] = (wordsArray[i]+" - "+count);
                }

            }
                String result=Arrays.toString(output);
           return result;


    }
return "null is not allowed";}}
