package com.stackroute.pe3;
import java.util.*;
public class StudentMarks {
    public String studentTestGrade(int[] stuGrades){
        String outputString="";
        System.out.println("Enter number of Students");
       Scanner scanner=new Scanner(System.in);
       int numOfStudents=scanner.nextInt();
       stuGrades=new int[numOfStudents];
       System.out.println("Enter Grades of "+numOfStudents+"Students");
       for(int i=0;i<numOfStudents;i++){
            int temporary=scanner.nextInt();
            stuGrades[i]=temporary;
       }
       Arrays.toString(stuGrades);
       for (int j=0;j<numOfStudents;j++){
           if(stuGrades[j]>=0&&stuGrades[j]<=100) {
              outputString="The grades are in given limit";
           }
           else{
              outputString= "error:The grade is out of limit";
           }
       }

    return outputString;}
}
