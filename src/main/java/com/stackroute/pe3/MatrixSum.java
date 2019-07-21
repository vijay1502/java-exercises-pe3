package com.stackroute.pe3;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {
    public String arraySumMethod(int[][] firstMatrix,int[][] secondMatrix,int rows,int columns){
       /* System.out.println("Enter rows and columns");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();*/
       if(rows==columns){
        firstMatrix=new int[rows][columns];
        secondMatrix=new int[rows][columns];
        int[][] result=new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                result[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }
        String output=Arrays.deepToString(result);
   return output; }
    else return "Matrix Addition is not possible";}
}
