package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoxTest {
ChessBox chessBox;
    @Before
    public void setUp() throws Exception {
        chessBox=new ChessBox();
    }

    @After
    public void tearDown() throws Exception {
        chessBox=null;
    }
    @Test
public void givenIntegersShouldReturnString(){
        String actualOutput=chessBox.chessPattern(3,3);
        assertEquals("done",actualOutput);
}

    @Test
    public void givenIntegersShouldReturnErrorString(){
        String actualOutput=chessBox.chessPattern(0,0);
        assertEquals("error:Rows and Columns are not Mentioned",actualOutput);
    }
}