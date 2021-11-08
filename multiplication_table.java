package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WE ARE GOING TO CREATE A MULTIPLICATION TABLE FOR A NUMBER YOU WANT.");
        System.out.println("ENTER THE NUMBER");
        num = scanner.nextInt();
        scanner.close();

        for (int i=1; i<=24; i++){
            System.out.printf("%d * %d = %d\n",i,num,(i*num));
        }
    }
}
