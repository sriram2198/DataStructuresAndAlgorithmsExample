package com.learn.code;

public class IterativeFactorial {

    public static void main(String[] args) {
        System.out.println(iterativeFact(3));
        System.out.println(recursiveFact(3));

    }
    public static int iterativeFact(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i ++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int recursiveFact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFact(num - 1);
    }
}
