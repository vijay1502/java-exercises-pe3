package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekFirstAndLastDateTest {
WeekFirstAndLastDate firstAndLastDate;
    @Before
    public void setUp() throws Exception {
        firstAndLastDate=new WeekFirstAndLastDate();
    }

    @After
    public void tearDown() throws Exception {
        firstAndLastDate=null;
    }
    @Test
    public void givenAStringShouldReturnStringWithFirstDayOfWeek() {
        String actualResult=firstAndLastDate.calender("dd/MM/YYYY");
        assertEquals("First day of week : 22/07/2019 Last day of week : 28/07/2019", actualResult);
    }


}