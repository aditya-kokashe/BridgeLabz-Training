package com.searching.searching.LineraSearch;

public class SentenceSearch {
    public static void main(String[] args) {

        String[] arr={"Hello everybody","Today im really","Happy"};

        String key="Happy";
        String result="Not Found";

        for(String s:arr){
            if(s.contains(key)){
                result=s; break;
            }
        }
        System.out.println(result);
    }
}
