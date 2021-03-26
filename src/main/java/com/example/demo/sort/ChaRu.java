package com.example.demo.sort;

public class ChaRu {
    public static void main(String[] args) {
        int a[] = {11, 1};
        for (int i : chaRu(a)) {
            System.out.println(i);
        }
    }
    private static int[] chaRu(int[] a) {
        if (a == null || a.length <= 1) {
            return a;
        }

        for(int i = 1; i < a.length; i++) {
            int index = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > index) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = index;
        }

        return a;
    }
}
