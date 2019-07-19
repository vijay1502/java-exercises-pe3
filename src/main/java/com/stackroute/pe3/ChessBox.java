package com.stackroute.pe3;

import java.util.Scanner;

public class ChessBox {

    public String chessPattern(int row,int column){
       
        String y="";
       Scanner scanner=new Scanner(System.in);
       row=scanner.nextInt();
       column=scanner.nextInt();
       if(row!=0&&column!=0){
       for(int i=0;i<row;i++){
           for (int j=0;j<column;j++){
               if((i+j)%2==0){
                   y=("WW|");
               }

               else {
                   y=("BB|");
               }
               }
          System.out.print("\n");
           }

       return "done";}
       else {return "error:Rows and Columns are not Mentioned";}

  }}


