package com.learn.code;

public class Main {

    public static void main(String[] args) {
        /* Array Initialization */
        int arr[] = new int[5];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 7;

        int index = -1;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == 2) {
                index = i;
                break;
            }
        }
        System.out.println("index = "+index);
    }
}
