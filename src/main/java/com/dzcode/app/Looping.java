package com.dzcode.app;

public class Looping {

    public static void main(String[] args) {

        // 1- while loop is the basic loop
        // 2- condition checked at loop start
        // 3- loop body may never run
        int someValue = 4;
        int factorial = 1;
        while (someValue > 1) {
            factorial *= someValue;
            someValue--;
        }
        System.out.println(factorial); // 24

        someValue = 1;
        factorial = 1;
        while (someValue > 1) {
            factorial *= someValue;
            someValue--;
        }
        System.out.println(factorial); // 1

        // 4- do-while loop
        // 5- condition checked at loop end
        // 6- loop body always runs at least once
        int iVal = 5;
        do {
            System.out.print(iVal + " * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 25);
        System.out.println(iVal); // 40

        iVal = 80;
        do {
            System.out.print(iVal + " * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 25);
        System.out.println(iVal); // 160

        for (int i = 1; i < 100; i *= 2) {
            System.out.println(i);
        }

        // for loop
        // 7- condition checked at loop start
        // 8- loop body may never run
        // 9- simplified notation for loop control values
        factorial = 1;
        for (int num = 3; num > 1; num--) {
            factorial *= num;
            System.out.println(num + " | " + factorial);
        }
        System.out.println("Result:" + factorial); // 6

        // for loop control value
        // 10- scope limited to within the loop
        // 11- can be modified within the loop body
        factorial = 1;
        for (int num = 3; num > 1; num--) {
            factorial *= num;
            System.out.println(num + " | " + factorial);
            // num = num + 5; // infini loop
        }
        // System.out.println(num); // won't compile
        System.out.println("Result:" + factorial); // 6


        // for each loop 
        // 12- simplifies iterating over a collection of items
        // types supported
        // 13- Arrays
        // 14- any type that implements iterable
        float[] vals = {10.0f, 20.0f, 15.0f};
        float sum = 0.0f;
        for (float currentVal : vals) {
            sum += currentVal;
        }
        System.out.println(sum); // 45

        sum = 0.0f;
        for (int i = 0; i < vals.length; i++) {
            sum += vals[i];
        }
        System.out.println(sum); // 45


        // foreach loop limitations
        // 15- designed for iterating sequentially through a single collection of items
        int[] left = {5, 3, 7};
        int[] right = {12, 9, 8};

        for (int i = 0; i < left.length; i++) {
            int result = left[i] + right[i];
            System.out.println("result = " + result); // 17, 12, 15
        }

        for (int i = 0, j = right.length - 1; i < left.length; i++, j--) {
            int result = left[i] + right[j];
            System.out.println("result = " + result); // 13, 12, 19
        }
    }
}
