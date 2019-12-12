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

    public static void main(String[] args) {
        declareArrayAndPrintElements();
    }
}
