package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionHandlingTest {
ExceptionHandling exceptionHandling;
    @Before
    public void setUp() throws Exception {
        exceptionHandling =new ExceptionHandling();
    }

    @After
    public void tearDown() throws Exception {
        exceptionHandling=null;
    }
    @Test
    public void givenAnIntegerShouldReturnStringStatingException(){
        String actualResult=exceptionHandling.exceptionHandling(30,0);
        assertEquals("Can't divide a number by 0",actualResult);
    }
    @Test
    public void givenAnIntegerShouldReturnString(){
        String actualResult=exceptionHandling.exceptionHandling(30,5);
        assertEquals("Result = 6",actualResult);
    }
}