package com.stackroute.pe3;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {
    public int[][] arraySumMethod(int row, int column, int[][] matrix1, int[][] matrix2){
       int result[][] = new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
