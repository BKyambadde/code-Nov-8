package com.company;

public class Main {

    public static void main(String[] args) {
        double[] x={12.4, 10, 100, 3.14, 56, 4.0867 };
        double total =0;
        for(int i=0; i<x.length; i++){
            total = total + x[i];
        }
        double average = total/x.length;
        System.out.format("THE AVERAGE VALUE IS: %.4f "+average);
    }
}
