package org.example;

public class PrintStarAlgo {
    public static void main(String[] args) {
//        printPattern(5);
//        pyramid(4);
//        verticalPyramid(3);
//        pattern(10);
        System.out.println(findGCD(10,20));
    }

    public static int findGCD(int a,int b) {
        if(a == 0) {
            return b;
        }
        if (b == 0){
            return a;
        }
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        return findGCD(max-min, min);
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void verticalPyramid(int n) {
        for (int i = 2*n-1; i > 0 ; i--) {
            for (int j = 0; j < 4; j++) {
                
            }
        }
    }
}
