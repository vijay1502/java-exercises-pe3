package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
import java.io.*;
public class FileUpperCaseConverterTest {
FileUpperCaseConverter fileUpperCaseConverter;
    @Before
    public void setUp() throws Exception {
       fileUpperCaseConverter=new FileUpperCaseConverter();
    }

    @After
    public void tearDown() throws Exception {
        fileUpperCaseConverter=null;
    }
    @Test
    public void givenAStringShouldReturnRepeatedWords() throws Exception{
        File path= new File("/home/cgi/Desktop/helloworld");
        String actualResult=fileUpperCaseConverter.upperCaseConverter(path);
        assertEquals("HELLO WORLD, THIS IS VIJAY!!!",actualResult);
    }}