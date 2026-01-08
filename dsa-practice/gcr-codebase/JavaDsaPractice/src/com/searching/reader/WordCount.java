package com.searching.reader;

import java.io.*;
public class WordCount {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("src/com/searching/reader/data.txt"));
        String line, word="hello";
        int count=0;

        while((line=br.readLine())!=null){
            String[] arr = line.split(" ");
            for(String s:arr){
                if(s.equalsIgnoreCase(word)) count++;
            }
        }
        br.close();
        System.out.println("Count: "+count);
    }
}
