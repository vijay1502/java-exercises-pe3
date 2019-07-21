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
    public void givenAnIntegerArrayShouldReturnStringIfConsecutive(){
      int[] numbersArray={12,13,14,15};
       String actualResult=consecutiveNumberCheck.consecutiveChecker(numbersArray);
       assertEquals("They are consecutive numbers",actualResult);
    }

    @Test
    public void givenAnIntegerArrayShouldReturnStringAsNotConsecutive(){
        int[] numbersArray={5,16,6};
        String actualResult=consecutiveNumberCheck.consecutiveChecker(numbersArray);
        assertEquals("They are not consecutive",actualResult);
    }

    @Test
    public void givenAnIntegerArrayShouldReturnErrorIfInputIsSignleValue(){
        int[] numbersArray={5};
        String actualResult=consecutiveNumberCheck.consecutiveChecker(numbersArray);
        assertEquals("cannot find if the input is single value",actualResult);
    }

}