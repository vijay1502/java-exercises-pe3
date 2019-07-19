package com.stackroute.pe3;

import java.io.*;
import java.util.*;

public class RepetitionOfWords {
    public static void main(String[] args) throws Exception {
        File path = new File("/home/cgi/Desktop/Content");
        Scanner scanner=new Scanner(path);
        String string;
        while ((string = scanner.nextLine()) != null){
            String[] wordsArray=string.split(" ");
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
                if(wordsArray[i]!="")
                    System.out.println(wordsArray[i]+" - "+count);
                count=1;

            }
        }
    }
}
