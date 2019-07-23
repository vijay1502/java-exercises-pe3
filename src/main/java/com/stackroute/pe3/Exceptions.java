package com.stackroute.pe3;

public class Exceptions {
    public static String negativeArrayException()
    {
        try
        {
            int array[]=new int[-5];
        }
        catch (NegativeArraySizeException nae)
        {
            System.out.println(nae.getMessage());
        }

        finally
        {
            return "class java.lang.NegativeArraySizeException";
        }

    }

    //method for IndexOutOfBoundException
    public static String indexOutOfBoundException()
    {
        try
        {
            int ar[]=new int[10];
            ar[12]=120;
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(ae.getMessage());
        }
        finally
        {
            return "class java.lang.ArrayIndexOutOfBoundsException";
        }
    }

    //method for NullPointerException
    public static String nullPointerException()
    {
        try
        {
            String str=null;
            System.out.println(str.charAt(0));
        }
        catch (NullPointerException npe)
        {
            System.out.println(npe.getMessage());
        }
        finally
        {
            return "class java.lang.NullPointerException";
        }
    }

}
