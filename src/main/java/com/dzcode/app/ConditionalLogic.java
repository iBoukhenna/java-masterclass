package com.dzcode.app;

public class ConditionalLogic {

    public static void main(String[] args) {
        System.out.println("/** Using if-else **/");

        int value1 = 10;
        int value2 = 4;

        // 1- Evaluates multiple conditions
        // Excuting Statement within if
        if (value1 > value2)
            System.out.println("value 1 is bigger");

        // Excuting Statement within if-else
        if (value1 > value2)
            System.out.println("value 1 is bigger");
        else 
            System.out.println("value 1 is not bigger");


        System.out.println("/** Block Statements **/");
        // Excuting Multiple Statements within if-else
        int diff = 0;
        if (value1 > value2){
            diff = value1 - value2;
            System.out.println("value 1 is bigger than value 2, diff = " + diff);
        } else {
            diff = value2 - value1;
            System.out.println("value 1 is not bigger than value 2, diff = " + diff);
        }

        System.out.println("/** Chaining if-else **/");
        // 2- Evaluates top-to-bottom
        // 3- First to test true is executed
        if (value1 > value2){
            diff = value1 - value2;
            System.out.println("value 1 is bigger than value 2, diff = " + diff);
        } else if (value1 < value2){
            diff = value2 - value1;
            System.out.println("value 1 is not bigger than value 2, diff = " + diff);
        } else {
            diff = 0;
            System.out.println("value 1 is equal to value 2, diff = " + diff);
        }

        System.out.println("/** Nested id **/");
        // 4- One if within another
        // 5- Be sure else matches with correct if
        int students = 0;
        int rooms = 4;
        if (students > 0) {
            if (rooms > 0)
                System.out.println("Students per room : " + students / rooms);
        } else 
            System.out.println("NO students");

        // 6- Combine to values variables or expressions
        // Must Always be boolean
        int iVal = 1;
        // if (iVal) System.out.println("Won't compile, only boolean variable or boolean value"); // Won't compile
        // if (iVal = 1) System.out.println("Still won't compile, only expression that resolves to true or false"); // Won't compile
        if (iVal == 1) System.out.println("this will work");

        System.out.println("Keep working ...");
    }
}
