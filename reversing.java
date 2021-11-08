package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        int reversex = 0;
        System.out.println("PLEASE ENTER YOUR NUMBER AND YOU ARE GOOD TO GO: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        while( x != 0){
            reversex = reversex*10;
            reversex = reversex + x%10;
            x = x/10;
        }
        System.out.println("REVERSE IS "+reversex);
    }
}
