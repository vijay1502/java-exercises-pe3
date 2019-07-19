package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class VowelRemoverTest {
    VowelRemover vowelRemover;
    @Before
    public void setup(){
        vowelRemover =new VowelRemover();
    }
    @After
    public void tearDown(){
        vowelRemover =null;
    }

@Test
    public void givenAStringArrayShouldReturnStringArray(){
        //act
        String[] arrayList={"India","Australia","NewZeeland"};
        String[] expectedArray={"Place name without vowels:0 Ind","Place name without vowels:1 Astrl","Place name without vowels:2 NwZlnd"};
        String[] actualResult= vowelRemover.alphabetRemoveMethod(arrayList);
        assertArrayEquals(expectedArray,actualResult);
}

}