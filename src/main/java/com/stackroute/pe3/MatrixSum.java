package com.stackroute.pe3;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {
    public int[][] arraySumMethod(int[][] firstMatrix,int[][] secondMatrix){
        System.out.println("Enter rows and columns");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();
        firstMatrix=new int[rows][columns];
        secondMatrix=new int[rows][columns];
        int[][] result=new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                result[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }
        Arrays.deepToString(result);
   return result; }
}
