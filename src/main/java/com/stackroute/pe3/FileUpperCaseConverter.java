package com.stackroute.pe3;
import java.io.*;
public class FileUpperCaseConverter {
    public static void main(String[] args)throws Exception
    {

        File file = new File("/home/cgi/.profile");

        BufferedReader readFile = new BufferedReader(new FileReader(file));

        String string;
        while ((string = readFile.readLine()) != null){
            String upperCase=string.toUpperCase();
            System.out.println(upperCase);}

    }
}
