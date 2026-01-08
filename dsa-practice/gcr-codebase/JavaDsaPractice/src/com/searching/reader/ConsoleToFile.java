package com.searching.reader;

import java.io.*;
public class ConsoleToFile {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("src/com/searching/reader/output.txt");

        String s;
        while(!(s = br.readLine()).equals("exit")){
            fw.write(s + "\n");
        }
        fw.close();
    }
}
