package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double metres, cm;
        System.out.println("ENTER THE QUANTITY OF METRES");
        Scanner scan = new Scanner(System.in);
        metres = scan.nextDouble();
        scan.close();

        cm = metres*100;

        System.out.printf(metres+" metres is equivalent to %.2f centimetres",cm);
    }
}
