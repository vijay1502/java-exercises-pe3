package com.stackroute.pe3;
import java.util.*;
import java.time.*;
import java.text.*;


public class WeekFirstAndLastDate {
    public String calender(String string)
    {

        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);


        String s1 = "First day of week : ";

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        s1 =s1+ (df.format(c.getTime()));
        s1 =s1+ " Last day of week : ";
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
        }

        s1 += (df.format(c.getTime()));

        return s1;
    }

}
