package com.example.demo.test;

public class Test {
    private static volatile int A = 1;
    int a[] = new int[1];
    int[] b = new int[2];

    public static void main(String[] args) {
        System.out.println("A".toLowerCase() == "a");
    }
}
