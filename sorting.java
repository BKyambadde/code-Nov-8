package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count;
        String x;
        Scanner scan = new Scanner(System.in);
        System.out.println("WE ARE GOING TO SORT THE WORDS IN ALPHABETICAL ORDER.");
        System.out.println("Please enter the number of words to be sorted: ");
        count = scan.nextInt();

        String  word[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE WORDS ONE AFTER ANOTHER ");
        for(int i = 0; i<count; i++){
            word[i] = scan2.nextLine();

        }
        scan.close();
        scan2.close();
        for(int i = 0; i<count; i++){
            for(int p = i + 1; p<count; p++){
                if( word[i].compareTo(word[p])>0){
                    x = word[i];
                    word[i] = word[p];
                    word[p] = word[i];
                }
            }
        }
        System.out.print("WORDS IN ALPHABETICAL ORDER: ");
        for(int i = 0; i<=count - 1; i++){
            System.out.print(word[i] + ",");
        }
    }
}
