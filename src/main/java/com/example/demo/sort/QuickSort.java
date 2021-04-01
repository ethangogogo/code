package com.example.demo.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {9, 6, 32, 7, 4, 9};
        for (int i : quickSort(a)) {
            System.out.println(i);
        }

    }
    private static int[] quickSort(int[] a) {
        if (a == null || a.length == 1) {
            return a;
        }

        quickSort(a, 0, a.length - 1);
        return a;
    }

    private static void quickSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = getMiddle(a, left, right);
        quickSort(a, left, middle - 1);
        quickSort(a, middle + 1, right);
    }
    private static int getMiddle(int[] a, int left, int right) {
        int index = a[left];
        while (left < right) {
            while (left < right && index <= a[right]) {
                right--;
            }
            a[left] = a[right];

            while (left < right && index >= a[left]) {
                left++;
            }
            a[right] = a[left];
        }

        a[left] = index;
        return left;
    }
}
