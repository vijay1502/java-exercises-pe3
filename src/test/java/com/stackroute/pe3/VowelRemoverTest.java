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
    public void givenAStringArrayShouldReturnArrayStringRemovingVowels(){
        String[] a={"India","Australia"};
        String[] b={"Ind","Astrl"};
String[] actual=vowelRemover.alphabetRemoveMethod(a);
assertArrayEquals(b,actual);
}

    @Test
    public void givenAStringStringArrayShouldReturnNullIfInputIsNull(){
        String[] a=null;

        String[] actual=vowelRemover.alphabetRemoveMethod(a);
        assertNull(actual);
    }

}