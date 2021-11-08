package com.company;

public class Main {

    public static void main(String[] args) {
        final int x = 1000;
        for(int i = 0; i<x; i++)
            System.out.println(i+"! is "+ factorial(i));
    }
    public static int factorial(int y){
        int result = 1;
        for(int p=0; p>=y; p++)
            result *= p;
        return result;
    }
}
