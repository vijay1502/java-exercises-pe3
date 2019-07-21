package com.stackroute.pe3;
import java.util.*;
public class StudentMarks {
    public String studentTestGrade(int[] stuGrades){
       /*  System.out.println("Enter number of Students");
       Scanner scanner=new Scanner(System.in);
       int numOfStudents=scanner.nextInt();
       stuGrades=new int[numOfStudents];
       System.out.println("Enter Grades of "+numOfStudents+"Students");
       for(int i=0;i<numOfStudents;i++){
            int temporary=scanner.nextInt();
            stuGrades[i]=temporary;
       }
       Arrays.toString(stuGrades);*/
       for (int j=0;j<stuGrades.length;j++){
           if(stuGrades[j]<=0||stuGrades[j]>=100) {
            return "The grades are out of given limit";
           }
       }
        return "The grades are in given limit";
    }
}
