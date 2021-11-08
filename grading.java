package com.company;

import java.util.Scanner;

public class GradingSystem{
    public static void main(String args[]){
        int marks[] = new int[10];
        String subject;
        int x;
        float totalMarks = 0;
        float average;
        Scanner scanner = new Scanner(System.in);
        for(x=0; x<10; x++){
            System.out.println("ENTER THE SUBJECT: ");
            subject = scanner.nextLine();
            System.out.println("ENTER THE MARKS OBTAINED: ");
            marks[x] = scanner.nextInt();
            totalMarks = totalMarks + marks[x];
        }
        scanner.close();
        average = totalMarks/10;
        System.out.println("THE STUDENT'S TOTAL MARKS: "+totalMarks);
        System.out.println("THE STUDENT'S AVERAGE MARK:"+average);
        if(average>=80){
            System.out.println("ITS THE 'A' STUDENT");
        }
        else if(average>=70 && average<80){
            System.out.println("ITS THE 'B' STUDENT");
        }
        else if(average>=65 && average<70){
            System.out.println("ITS THE 'C' STUDENT");

        }
        else if(average>=60 && average<65){
            System.out.println("ITS THE 'D' STUDENT");
        }
        else if(average>=50 && average<60){
            System.out.println("ITS THE 'E' STUDENT");
        }
        else if(average<50){
            System.out.println("SORRY YOU HAVE FAILED!");
        }
    }
}