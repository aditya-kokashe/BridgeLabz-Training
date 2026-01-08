package com.searching.searching.BinarySearch;

public class MatrixSearch {
    public static void main(String[] args) {

        int[][] mat={{1,3,5},{7,9,11}};
        int target=9;

        int r=2,c=3;
        int l=0,h=r*c-1;
        boolean found=false;

        while(l<=h){
            int m=l+(h-l)/2;
            int val=mat[m/c][m%c];
            if(val==target){found=true;break;}
            else if(val<target) l=m+1;
            else h=m-1;
        }
        System.out.println(found);
    }
}
