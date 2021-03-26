package com.example.demo.test;

public interface InterfaceTest {
    public static final int a = 1;
    public abstract void test();

    private void test1() {}

    default void test2() {}

    static void test3() {}
}
