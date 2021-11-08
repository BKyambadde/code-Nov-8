package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num;
        System.out.println("WE ARE GONNA FIND FACTORS OF A NUMBER OF YOUR CHOICE");
        System.out.println("ENTER THE INTEGER");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();


        System.out.printf("THE FACTORS OF %d ARE:\t",num);
        System.out.printf("%d\t",1);
        for(int i=2; i<=num; i++){
            if(num%i == 0)
                System.out.printf("%d\t",i);
        }
    }
}
