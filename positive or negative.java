package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WE ARE GOING TO CHECK WHETHER NUMBER IS POSITIVE OR NEGATIVE.");
        System.out.println("ENTER THE INTEGER");
        num = scanner.nextInt();

        if(num>=0)
            System.out.printf("%d IS A POSITIVE NUMBER.",num);
        else
            System.out.printf("%d IS A NEGATIVE NUMBER.",num);
    }
}
