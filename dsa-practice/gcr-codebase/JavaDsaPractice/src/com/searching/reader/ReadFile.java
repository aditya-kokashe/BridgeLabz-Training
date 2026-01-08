package com.searching.reader;

import java.io.*;
public class ReadFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/com/searching/reader/data.txt"));
        String line;

        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
