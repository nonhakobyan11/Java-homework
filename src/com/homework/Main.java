package com.homework;

public class Main {

    //Problem 1
    public static void declareArrayAndPrintElements(){
        String[] str = {"yellow", "green", "blue", "red", "purple"};
	    for(int i = 0; i < str.length; i++){
	        System.out.print(str[i] + " ");
        }
        System.out.println();
    }

    // Problem 2
    public static void declareIntArrayWithZeroes(){
        int[] arr = new int[15] ;
        for (int i = 0; i < 15; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Problem 1 output: "); declareArrayAndPrintElements();
        System.out.print("Problem 2 output: "); declareIntArrayWithZeroes();
    }
}
