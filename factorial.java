package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        BigInteger factorial = BigInteger.ONE;
        System.out.println("WE ARE GONNA FIND THE FACTORIAL OF A NUMBER YOU WANT.");
        System.out.println("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        scanner.close();

        if(x<0)
            System.out.println("THE FACTORIAL OF THAT NUMBER IS IMPOSSIBLE.");
        else if(x<=0 && x<=1)
                System.out.printf("%d! = %d",x,factorial);
        else{
            for(int i = x; i>=2; i--){
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.printf("%d! = %d",x,factorial);
        }

    }
}
