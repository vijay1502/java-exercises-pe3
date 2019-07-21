package com.stackroute.pe3;
import java.io.*;
public class FileUpperCaseConverter {
    public String upperCaseConverter(File file)throws Exception
    {

        BufferedReader readFile = new BufferedReader(new FileReader(file));

        String string;
        if((string = readFile.readLine()) != null){
            String upperCase=string.toUpperCase();
            return upperCase;
            }

  else return "null is not allowed";}
}
