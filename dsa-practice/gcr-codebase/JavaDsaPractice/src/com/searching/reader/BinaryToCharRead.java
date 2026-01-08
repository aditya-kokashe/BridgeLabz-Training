package com.searching.reader;

import java.io.*;
public class BinaryToCharRead {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("src/com/searching/reader/data.txt"), "UTF-8"));

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
