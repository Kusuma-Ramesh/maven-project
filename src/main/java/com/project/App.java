package com.project;

public class App {

    // Method to find the greatest number among three
    public static int findGreatest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 25, num3 = 9;
        int greatest = findGreatest(num1, num2, num3);
        System.out.println("Greatest number is: " + greatest);
    }
}
