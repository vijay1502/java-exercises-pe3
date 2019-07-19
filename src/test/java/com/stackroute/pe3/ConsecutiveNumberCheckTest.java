package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberCheckTest {
    ConsecutiveNumberCheck consecutiveNumberCheck;
    @Before
    public void setUp() throws Exception {
        consecutiveNumberCheck=new ConsecutiveNumberCheck();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumberCheck=null;
    }
    @Test
    public void givenAStringArrayOfDigitsShouldReturnAStringMessageIfConsecutive(){
       String[] numbersArray={"12","13","14","15"};
       String actualResult=consecutiveNumberCheck.consecutiveChecker(numbersArray);
       assertEquals("The given numbers are consecutive",actualResult);
    }

    @Test
    public void givenAStringArrayOfDigitsShouldReturnErrorStringIfNotConsecutive(){
        String[] numbersArray={"12","16","18","15"};
        String actualResult=consecutiveNumberCheck.consecutiveChecker(numbersArray);
        assertEquals("The given numbers are not consecutive",actualResult);
    }

    @Test
    public void givenAStringArrayOfDigitsShouldReturnErrorStringIfArrayHasCharacters(){
        String[] numbersArray={"hello","16","18","15"};
        String actualResult=consecutiveNumberCheck.consecutiveChecker(numbersArray);
        assertEquals("The given array should not contain Characters",actualResult);
    }
}