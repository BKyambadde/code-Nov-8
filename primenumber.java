package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// checking for a prime number
        int x;
        boolean Prime=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER ANY NUMBER: ");
        int y = scanner.nextInt();

        for(int i=2; i<=y/2; i++){
            x = y%i;
            if(x==0){
                Prime = false;
                break;
            }
        }
        if(Prime){
            System.out.println(y+" IS A PRIME NUMBER");
        }
        else{
            System.out.println(y+" IS NOT A PRIME NUMBER");
        }
    }
}
