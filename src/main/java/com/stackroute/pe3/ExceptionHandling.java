package com.stackroute.pe3;

public class ExceptionHandling {

        public String exceptionHandling(int a,int b)
        {
            try {
               /* int a = 30, b = 0;*/
                int c = a/b;  // cannot divide by zero
                return ("Result = " + c);
            }
            catch(ArithmeticException e) {
                return  ("Can't divide a number by 0");
            }

        }
    }

