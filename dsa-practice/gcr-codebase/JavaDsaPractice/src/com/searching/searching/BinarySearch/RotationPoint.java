package com.searching.searching.BinarySearch;

public class RotationPoint {
    public static void main(String[] args) {
        int[] arr={6,7,8,1,2,3,4,5};

        int l=0,r=arr.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]>arr[r]) l=m+1;
            else r=m;
        }
        System.out.println("Rotation Index: "+l);
    }
}
