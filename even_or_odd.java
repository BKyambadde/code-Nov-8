package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num, remainder;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WE ARE GOING TO CHECK FOR ODD OR EVEN NUMBERS.");
        System.out.println("ENTER THE INTEGER");
        num = scanner.nextInt();
        remainder = num%2;
        if(remainder==0)
            System.out.printf("%d IS AN EVEN NUMBER.",num);
        else
            System.out.printf("%d IS AN ODD NUMBER.",num);
    }
}
