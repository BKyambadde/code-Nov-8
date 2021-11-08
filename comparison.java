package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR FIRST NUMBER");
        a = scanner.nextInt();
        System.out.println("ENTER YOUR FIRST NUMBER");
        b = scanner.nextInt();
        System.out.println("ENTER YOUR FIRST NUMBER");
        c = scanner.nextInt();
        scanner.close();

        if(a>b && a>c)
            d = a;
        else if(b>a && b>c)
            d = b;
        else
            d = c;
        System.out.printf("THE LARGEST NUMBER AMONG %d, %d and %d IS %d",a,b,c,d);

    }
}
