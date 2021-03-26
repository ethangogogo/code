package com.example.demo.leetcode;

public class ParkingSystem_1603 {
    static int [] a = new int[3];
    public ParkingSystem_1603(int big, int medium, int small) {
        a[0] = big;
        a[1] = medium;
        a[2] = small;
    }

    public static boolean addCar(int carType) {
        if (a[carType - 1] > 0) {
            a[carType - 1] --;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem_1603 parkingSystem_1603 = new ParkingSystem_1603(1, 1, 0);
        System.out.println(a[1]);
        System.out.println(addCar(2));
        System.out.println(a[1]);
        System.out.println(addCar(2));
        System.out.println(a[1]);

    }
}
