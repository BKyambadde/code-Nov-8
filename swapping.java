package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER TOUR FIRST NUMBER");
        a = scanner.nextInt();

        System.out.println("ENTER TOUR SECOND NUMBER");
        b = scanner.nextInt();

        System.out.printf("BEFORE SWAPPING\nFIRST_NUMBER: %d\nSECOND_NUMBER: %d\n\n",a,b);

        c=a;
        a=b;
        b=c;
        System.out.printf("AFTER SWAPPING\nFIRST_NUMBER: %d\nSECOND_NUMBER: %d",a,b);
    }
}
