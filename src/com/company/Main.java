package com.company;

public class Main {

    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a; // returns array with numbers 1 to 5.
    }
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2; // Double the values of array == 1=2 - 2=4 - 3=6 - 4=8 - 5=10
        }
    }
    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i]; // Store the sum of array in an int and return it. == 30.
        }
        return fus;
    }
    public static void main(String[] args) {
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob)); // Print 30.
    }
}
