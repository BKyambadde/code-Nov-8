package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
//WORD COUNT
    public static void main(String[] args) {
        try {
            File f = newFile("memoryJogger.txt");
            sc = new Scanner(f);
            Map<String, Integer> wordCount = new TreeMap<String, Integer>();
            while(sc.hasNext()){
                String word = sc.Next();
                if(!wordCount.containsKey(word))
                    wordCount.put(word,1);
                else
                    wordCount.put(word, wordCount.get(word) + 1);
            }
            for(String word : wordCount.get(word))
                System.out.println(word + " " + wordCount.get(word));
            System.out.println(wordCount.size());
        }
       catch(IOException e){
            System.out.println("UNABLE TO READ FROM FILE.");
       }


    }
}
