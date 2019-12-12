package com.homework;

public class Main {

    // Problem 1
    public static void declareArrayAndPrintElements(){
        String[] str = {"yellow", "green", "blue", "red", "purple"};
	    for(int i = 0; i < str.length; i++){
	        System.out.print(str[i] + ", ");
        }
        System.out.println();
    }

    // Problem 2
    public static void declareIntArrayWithZeroes(){
        int[] arr = new int[15] ;
        for (int i = 0; i < 15; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    // Problem 3
    public static void declareIntArrayWithThousandElements() {
        int[] arr = new int[1001];
        //lcnel 1-1000 tverov
        for (int i = 1; i <= 1000; i++) {
            arr[i] = i;
        }
        // tpel ayn
        for (int j = 1; j <= 1000; j++) {
            System.out.print(arr[j] + ", ");
        }
        System.out.println();
    }

    // Problem 4
    public static void printEvenElOfByteArray() {
        int j = 0;
        byte[] bArr = new byte[30] ;
	    for(int i = -30; i <= 30; i+=2){
	        if(i == 0)
	            continue;
	        bArr[j++] = (byte)i;
        }
	    for (int i = 0; i < 30; i++){
            System.out.print(bArr[i] + ", ");
        }
        System.out.println();
    }

    // Problem 5
    public static void printOddElOfShortArray() {
        short[] arr= new short[150];
        int j = 0;
        for (short i = 1; i < 300; i += 2) {
            arr[j++] = i;
        }
        for (int i = 0; i < 150; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    // Problem 6
    public static void printElDividedByFiveInIntArray(){
        int[] arr = {1, 5, 4, -47, 64, 25, 78, 625};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    // Problem 7
    public static void printElGreaterThenInDoubleArray (){
        double[] arr = {18.37, 68.7, 71.4, 24.68, 44.8, 271.1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 24.56) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    // Problem 8
    public static void printElGreatOrSmallInDoubleArray(){
        float[] arr = {48.49F, 24.78F, 65.74F, -21.174F, -45.47F};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 35.56F || arr[i] < -34.655F) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    // Problem 9.1
    public static void bubbleSortAscending(){
        double t;
        double[] numbers = {4.52, 6.7, -5.3, 2.8, -6, -2.1, 0.5};
        for(int i = numbers.length - 1; i > 0; i--)
	        for (int j = 0; j < i; j++ ){
	            if(numbers[j] > numbers[j + 1]){
	                t = numbers[j];
	                numbers[j] = numbers[j+1];
	                numbers[j + 1] = t;
                }
            }
        for (int i = 0; i < numbers.length ; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    // Problem 9.2
    public static void bubbleSortDescending(){
        double t;
        double[] numbers = {4.52, 6.7, -5.3, 2.8, -6, -2.1, 0.5};
        for(int i = numbers.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++ ){
                if(numbers[j] < numbers[j + 1]){
                    t = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j + 1] = t;
                }
            }
        for (int i = 0; i < numbers.length ; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    // Problem 10
    public static void printQuantityOfLetter_a(){
        String str = "The way to get started is to quit talking and begin doing.";
        int count = 0;
        char l;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.print(count);
        System.out.println();
    }

    // Problem 11
    public static void printYesOrNo(){
        String str = "The way to get started is to quit talking and start doing.";
        if (str.indexOf("b") != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }




    public static void main(String[] args) {
        System.out.print("Problem 1 output: "); declareArrayAndPrintElements();
        System.out.print("Problem 2 output: "); declareIntArrayWithZeroes();
        System.out.print("Problem 3 output: "); declareIntArrayWithThousandElements();
        System.out.print("Problem 4 output: "); printEvenElOfByteArray();
        System.out.print("Problem 5 output: "); printOddElOfShortArray();
        System.out.print("Problem 6 output: "); printElDividedByFiveInIntArray();
        System.out.print("Problem 7 output: "); printElGreaterThenInDoubleArray ();
        System.out.print("Problem 8 output: "); printElGreatOrSmallInDoubleArray();
        System.out.print("Problem 9.1 output: "); bubbleSortAscending();
        System.out.print("Problem 9.2 output: "); bubbleSortDescending();
        System.out.print("Problem 10 output: "); printQuantityOfLetter_a();
        System.out.print("Problem 11 output: "); printYesOrNo();
    }
}
