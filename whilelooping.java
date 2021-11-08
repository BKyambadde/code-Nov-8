package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x=0;
        int count = 1;
        int total = 0;

        System.out.println("WE ARE GOING TO FIND THE SUM OF THE NATURAL NUMBERS UPTO YOUR LAST.");
        System.out.println("ENTER YOUR LAST NATURAL NUMBER:");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        while(count<=x){
            total +=count;
            count++;
        }
        System.out.println("THE SUM OF THE FIRST "+x+" NATURAL NUMBERS IS "+total+".");
    }
}
