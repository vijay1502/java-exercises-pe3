package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {
MatrixSum matrixSum;
    @Before
    public void setUp() throws Exception {
        matrixSum =new MatrixSum();
    }

    @After
    public void tearDown() throws Exception {
        matrixSum =null;
    }

    @Test
    public void givenAnIntegerArrayShouldReturnIntegerArray(){
        int[][] firstInput={{2,2},{3,3}};
        int[][] secondInput={{2,2},{3,3}};
        int[][] result={{4,4},{6,6}};
        int[][] actualOutput= matrixSum.arraySumMethod(firstInput,secondInput);
        assertArrayEquals(result,actualOutput);

    }
}