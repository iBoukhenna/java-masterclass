package com.dzcode.app;

import static java.lang.System.out;

public class PrimitiveTypesVariables {

    public static void main(String[] args) {
        out.println("\n** Primitive Integrals ** \n");

        // byte range
        byte maxByte = 127;
        byte minByte = -128;

        // short range
        short maxShort = 32767;
        short minShort = -32768;

        // int range
        int maxInt = 2147483647;
        int minInt = -2147483648;

        // long range
        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775808L;

        out.println("\n** Primitive Float and Double ** \n");

        // hold decimal point numbers
        float piFloat = 3.14f;
        double piDouble = 3.14;

        piFloat = 2.141592653f;
        piDouble = 2.14159265358979323;

        out.println("piFloat = " + piFloat);
        out.println("piDouble = " + piDouble);

        float pFloat = .98768f;

        float longToFloat = 1111111112222222223L;
        double longToDouble = 1111111112222222223L;

        out.println("longToFloat = " + longToFloat);
        out.println("longToDouble = " + longToFloat);

        out.println("\n** Primitive Chars ** \n");

        // chart
        char aLetter = 'A';
        char aUnicode = '\u0041';
        char aNumber = 65;

        out.println(aLetter + " - " + aUnicode + " - " + aNumber);

        if (aLetter == aUnicode && aUnicode == aNumber) {
            out.println("\\u0041, \'A\', and 65 are equal");
        } else {
            out.println("They are not equal");
        }

        char newLine = '\n';
        out.println(newLine);

        char sheenCharacter = '\u0634';
        out.println("Arabic 'sheen' = " + sheenCharacter);

        char minChar = 0;
        char maxChar = 65535;

        // aNumber = 3.14

        minChar = '\uffff';
        maxChar = '\u0000';

        out.println("\n** Narrowing, Widening, and Casting **\n");

        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;

        float floatValue = 3.141592f;
        double doubleValue = floatValue;

        floatValue = intValue;
        doubleValue = longValue;

        floatValue = longValue;

        out.println("floatValue = "+ floatValue);
        out.println("doubleValue = "+ doubleValue);

        out.println('\n');

        floatValue = 2147483647;
        doubleValue = 9223372036854775807L;

        out.println("floatValue = "+ floatValue);
        out.println("doubleValue = "+ doubleValue);

        out.println('\n');

        longValue = 100L;
        intValue = (int) longValue;
        shortValue = (short) intValue;
        byteValue = (byte) shortValue;

        doubleValue = byteValue;
        floatValue = (float) doubleValue;

        out.println("longValue = " + longValue);
        out.println("intValue = " + intValue);
        out.println("shortValue = " + shortValue);
        out.println("byteValue = " + byteValue);
        out.println("doubleValue = " + doubleValue);
        out.println("floatValue = " + floatValue);

        out.println('\n');

        longValue = 9223372036854775807L;
        intValue = (int) longValue;
        shortValue = (short) intValue;
        byteValue = (byte) shortValue;

        doubleValue = byteValue;
        floatValue = (float) doubleValue;

        out.println("longValue = " + longValue);
        out.println("intValue = " + intValue);
        out.println("shortValue = " + shortValue);
        out.println("byteValue = " + byteValue);
        out.println("doubleValue = " + doubleValue);
        out.println("floatValue = " + floatValue);

        out.println('\n');

        shortValue = 100;
        char charValue = (char) shortValue;

        out.println("shortValue = " + shortValue);
        out.println("charValue = " + (int) charValue);

        shortValue = 30000;
        charValue = (char) shortValue;

        out.println("shortValue = " + shortValue);
        out.println("charValue = " + (int) charValue);

        out.println("\n** Underscores in Numbers **\n");

        long worldPopulation = 7_674_000_000L;

        long phoneNumber = 1_617_385_1234L;

        double Pi = 3.141_592_653_793_238d;

//        short maxShort = _32767;
//        short minShort = 32767_;
//        double latitude = 328_200_000_L;
//        double longitude = 2.2945_;
//        long usPopulation = 328_200_000_L;
//        float specificationGravity = 1.050f_;
//        float kgInPounds = 2_.20462f;
//        double poundInKg = 0._453591830542594d;
//        short fahrenheit = _-10;
//        float celsius = -_23.3333f;

        out.println("\n** Alternative Number Systems **\n");

        int w = 100; // base 10 literal
        int x = 0144; // octal literal
        int y = 0x0064; // hexadecimal literal
        int z = 0b1100100; // binary literal

        if (w == x && x == y && y == z) {
            out.println("w == x == y == z");
        } else {
            out.println("w, x, y, z are not equal");
        }

        int a = 1_00; // base 10 literal
        int b = 017_50; // octal literal
        int c = 0x0_3E8; // hexadecimal literal
        int d = 0b11_11101000; // binary literal

        if (a == b && b == c && c == d) {
            out.println("a == b == c == d");
        } else {
            out.println("a, b, c, d are not equal");
        }

        out.println("\n** Scientific Notation **\n");

        double lightSpeed = 5.88e12; // 5.88 * 10 (12) // 5,880,000,000,000
        float diameterHydr = 5.0e-8f; // 5.0 * 10 (-8) // 0.00000005

        out.println("lightSpeed = " + lightSpeed);
        out.println("diameterHydr = " + diameterHydr);
    }
}
