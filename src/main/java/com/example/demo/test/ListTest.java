package com.example.demo.test;

import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    public static void main(String[] args) {
        List<String> listTest = List.of("1", "2", "3");
        List<String> list = listTest.stream().collect(Collectors.toList());
        System.out.print(listTest);
        System.out.print(list);
    }
}
