package com.searching.searching.LineraSearch;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr={5,8,-2,10};

        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                index=i; break;
            }
        }
        System.out.println(index);
    }
}
