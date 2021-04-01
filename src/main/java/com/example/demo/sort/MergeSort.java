package com.example.demo.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {23, 4, 54, 56, 8, 9};
        mergeSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }
    private static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int middle = (left + right)/2;
            mergeSort(a, left, middle);
            mergeSort(a, middle + 1, right);
            merge(a, left ,right ,middle);
        }
    }

    private static void merge (int[] a, int left, int right, int middle) {
        int[] tmpArray = new int[a.length];
        int rightMid = middle + 1;
        int tmp = left;
        int copy = left;
        while (left <= middle && rightMid <= right) {
            if (a[left] <= a[rightMid]) {
                tmpArray[tmp++] = a[left++];
            } else {
                tmpArray[tmp++] = a[rightMid++];
            }
        }
        while (left <= middle) {
            tmpArray[tmp++] = a[left++];
        }
        while (rightMid <= right) {
            tmpArray[tmp++] = a[rightMid++];

        }

        while (copy <= right) {
            a[copy] = tmpArray[copy++];
        }
    }
}
