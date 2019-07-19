package com.stackroute.pe3;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StudentMarksTest {
    StudentMarks studentMarks;
    @Before
    public void setup(){
        studentMarks=new StudentMarks();
    }
    @After
    public void tearDown(){
        studentMarks=null;
    }

    @Test
    public void givenIntegerArrayShouldReturnStringBasedOnGrade(){
        int[] array={50,60,40};

        String actualResult=studentMarks.studentTestGrade(array);
        assertEquals("The grades are in given limit",actualResult);
    }

    @Test
    public void givenIntegerArrayShouldReturnErrorStringIfInputIsOutOfBounds(){
        int[] array={30,160,40};

        String actualResult=studentMarks.studentTestGrade(array);
        assertEquals("error:The grade is out of limit",actualResult);
    }

    @Test
    public void givenIntegerArrayShouldReturnErrorStringIfValuesAreNegative(){
        int[] array={-20,-60,40};

        String actualResult=studentMarks.studentTestGrade(array);
        assertEquals("error:The grade is out of limit",actualResult);
    }




}