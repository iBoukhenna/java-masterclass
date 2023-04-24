package com.dzcode.app;

import static java.lang.System.out;

import java.util.Date;

public class OperatorsMathAPIs {

    public static void main(String[] args) {
        out.println("\n** Arithmetic Operators **\n");

        byte byteResult = 5 + 3; // 8

        byte xByte = 5;
        byte yByte = 3;

        //byteResult = xByte + yByte;
        //byteResult = (int) xByte + (int) yByte;
        int intResult = xByte + yByte;

        short xShort = 5;
        yByte = 3;

        //short shortResult = xShort + yByte;
        //shortResult = (int) xShort + (int) yByte;
        intResult = xShort + yByte;

        xShort = 5;
        int yInt = 3;
        long zLong = 10;

        //intResult = xShort + yInt + zLong;
        long longResult = xShort + yInt + zLong;

        xByte = 5;
        float yFloat = 3.0f;
        double zDouble = 10.0;

        //float floatResult = xByte + yFloat * zDouble;
        double doubleResult = xByte + yFloat * zDouble;

        out.println("\n** Pre-/Post-Unary Operators **\n");

        int xInt = 1;

        ++xInt; // 2

        --xInt; // 1

        double xDouble = 3.14;

        ++xDouble; // 4.14

        --xDouble; // 3.14

        xInt = 4;

        yInt = 7;

        int zInt = 3;

        int result = ++xInt + yInt + --zInt; // 5 + 7 + 2 = 14

        xInt = 5;

        result = ++xInt + xInt + ++xInt; // 6 + 6 + 7 = 19

        xInt = 1;

        result = xInt++ + xInt + xInt++; // 1 + 2 + 2 = 5

        out.println("\n** Assignment Operators **\n");

        int x = 5;
        int y = 3;
        int z = x + y;

        x = 5;
        y = 3;
        z = 5 + (y = x + y);

        xInt = 5;
        yInt = 3;
        yInt *= xInt; // 15

        yInt = 3;
        yInt = yInt * xInt; // 15

        xByte = 5;
        double yDouble = 3.0;
        //xByte = xByte + yDouble; // won't compile
        xByte += yDouble;
        xByte = (byte)(xByte + yDouble);

        xByte = 5;
        yDouble = 3.0;
        float afloat = 5.0f;
        long aLong = 10;
        short aShort = 3;

        xByte += yDouble + afloat * aLong % aShort; // 5 + 3.0 + ((5.0 * 10) % 3) = 10

        out.println("\n** The Comparison Operators **\n");

        xInt = 3;
        long yLong = 3L;
        float zFloat = 3.1f;

        /* The following are 'true' */
        boolean bool = yLong != zFloat;
        bool = xInt == yLong;
        bool = yLong < zFloat;
        bool = xInt <= zFloat;
        bool = zFloat > yLong;
        bool = zFloat >= yLong;

        /* The following are 'false' */
        bool = yLong != zFloat;
        bool = xInt == zFloat;
        bool = xInt != yLong;
        bool = xInt < yLong;
        bool = zFloat <= xInt;
        bool = yLong > zFloat;
        bool = xInt >= zFloat;

        xInt = 3;
        boolean flag = false;
        String obj = "This is an Object";

        //xInt < flag; // won't compile
        //xInt < obj; // won't compile

        xInt = 3;
        zFloat = 3.1f;
        bool = xInt == zFloat; // false
        bool = xInt != zFloat; // true

        boolean isFalse = false;
        boolean isTrue = true;

        bool = isTrue == isFalse; // false
        bool = isTrue != isFalse; // true

        Date dateA = new Date(0L);
        Date dateB = dateA;
        Date dateC = new Date(0L);

        bool = dateA == dateB; // true
        bool = dateA != dateC; // true

        class ClassA {};
        class ClassB extends ClassA {};

        ClassA instanceA = new ClassA();
        ClassA instanceAB = new ClassB();
        ClassB instanceB = new ClassB();

        bool = (instanceA instanceof ClassA); // true
        bool = (instanceAB instanceof ClassA); // true
        bool = (instanceB instanceof ClassA); // true
        bool = (instanceA instanceof ClassB); // false
        bool = (instanceAB instanceof ClassB); // true
        bool = (instanceB instanceof ClassB); // true

        xInt = 3;
        yLong = 3L;
        zFloat = 3.1f;

        bool = ((zFloat >= yLong) == (xInt <= zFloat)); // true

        out.println("\n** The Logical Operators **\n");

        boolean tru_1 = true;
        boolean tru_2 = true;
        boolean flse_1 = false;
        boolean flse_2 = false;

        // & -> both sides are tested
        bool = tru_1 & tru_2; // true
        bool = tru_1 & flse_2; // false
        bool = flse_1 & tru_2; // false

        // & -> if left side is false then false, and second side isn't tested
        bool = tru_1 && tru_2; // true
        bool = tru_1 && flse_2; // false
        bool = flse_1 && tru_2; // false, the second side isn't tested

        // | -> both sides are tested
        bool = flse_1 | flse_2; // false
        bool = flse_1 | tru_2; // true
        bool = tru_1 | flse_2; // true

        // || -> if left side is false then false, and second side isn't tested
        bool = flse_1 || flse_2; // false
        bool = flse_1 || tru_2; // true
        bool = tru_1 || flse_2; // true, the second side isn't tested

        xInt = 7;
        boolean yBool = false;

        bool = (xInt++ <= 7) || (yBool = true); // bool = true - second side isn't tested - yBool = false - xInt = 8

        // ^
        bool = tru_1 ^ tru_2; // false
        bool = tru_1 ^ flse_2; // true
        bool = flse_1 ^ tru_2; // true
        bool = flse_1 ^ flse_2; // false

        // !
        bool = !tru_1; // false
        bool = !flse_1; // true

        out.println("\n** The Ternary Operator **\n");


        zFloat = (float) Math.random() * 6;

        if (x <= 3) {
            bool = true;
        } else {
            bool = false;
        }

        bool = (zFloat <= 3) ? true : false;

        bool = (zFloat <= 3);

        if ((zFloat <= 3) ? true : false) {
            // do somethings
        }

        double dValue = ((zFloat <= 3) ? 0.0 : 3.3141) * 13;

        String strValue = (zFloat <= 3) ? "" + x : "no value";

        out.println("\n** The Other Operators **\n");

        x = +5 * -3; // -15
        yDouble = -6 + 9.13; // 3.13000

        x = 5;
        y = -x * -3 + +x; // 20

        x = 5;
        y = --x * -3 + ++x; // -7

        x = 5;
        y = --x * -3 + -x; // -16

        x = 3;
        y = 4;

        z = --x * x + y + 8; // 16
        z = --x * (x + y + 8); // 28

        z = (--x * x + (y + x) - y--); 
        z = --x * ((x + y) + x) - y--;
        z = (--x * x + y + (x - y--));


        //z = --x * x + (y + x) - y--); // won't compile
        //z = (--x * (x + (y + x - y--; // won't compile
        //z = (--x * x + (y + x)) - y--); // won't compile

        //z (= --x * x + (y + x) - y--); // won't compile
        //z = --x (* (x + y) + x - y--); // won't compile
        //z = (--x * x + (y + x)) - y--);) // won't compile

        out.println("\n** Math APIs **\n");

        for (int i = 0; i < 4; i++) {
            zDouble = Math.random();
            out.format("Math.random() = %.20f%n", zDouble);            
        }

        double pI = 3.14;
        long longX = Math.round(pI); // 3

        float eN = 2.71f;
        int intX = Math.round(eN); // 3

        double num = 2;
        double exp = 3;
        zDouble = Math.pow(num, exp); // 8

        int intA = 3;
        int intB = 4;
        int intMin = Math.min(intA, intB); // 3
        int intMax = Math.max(intA, intB); // 4

    }
}