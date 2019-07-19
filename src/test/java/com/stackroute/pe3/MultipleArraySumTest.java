package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleArraySumTest {
MultipleArraySum multipleArraySum;
    @Before
    public void setUp() throws Exception {
        multipleArraySum=new MultipleArraySum();
    }

    @After
    public void tearDown() throws Exception {
        multipleArraySum=null;
    }

    @Test
    public void givenAnIntegerArrayShouldReturnIntegerArray(){
        int[][] firstInput={{2,2},{3,3}};
        int[][] secondInput={{2,2},{3,3}};
        int[][] result={{4,4},{6,6}};
        int[][] actualOutput=multipleArraySum.arraySumMethod(firstInput,secondInput);
        assertArrayEquals(result,actualOutput);

    }
}