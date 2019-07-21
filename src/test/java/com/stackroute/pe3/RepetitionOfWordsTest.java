package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class RepetitionOfWordsTest {
RepetitionOfWords repetitionOfWords;
    @Before
    public void setUp() throws Exception {
        repetitionOfWords=new RepetitionOfWords();
    }

    @After
    public void tearDown() throws Exception {
        repetitionOfWords=null;
    }

    @Test
    public void givenAStringFileShouldReturnCountOfRepeatedWords() throws Exception {
        File file=new File("/home/cgi/Desktop/helloworld");
        String actualResult=repetitionOfWords.wordRepetition(file);
        assertEquals("[Hello - 1, World, - 1, this - 1, is - 1, vijay!!! - 1]",actualResult);
    }
    }