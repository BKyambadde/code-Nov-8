package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double x, y;
        char op;
        System.out.println("WE ARE GOING TO BE MAKING SIMPLE MATHEMATICAL CALCULATIONS FOR TWO NUMBERS.");
        System.out.println("ENTER THE FIRST NUMBER");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        System.out.println("ENTER THE MATHEMATICAL OPERATION");
        Scanner scanner2 = new Scanner(System.in);
        op = scanner2.nextLine();

        System.out.println("ENTER THE SECOND NUMBER");
        Scanner scanner3 = new Scanner(System.in);
        y = scanner3.nextInt();

        if( op == 0 ){
            System.out.println("THE SUM IS "+ (x+y));
        }
        else if( op == 4 ){
            System.out.println("THE DIFFERENCE IS "+ (x-y));
        }
        else if( op == 3 ){
            System.out.println("THE PRDUCT IS "+ (x*y));
        }
        else if( op == 2 ){
            System.out.println("THE QUOTIENT IS "+ (x/y));
        }
        }
    }

