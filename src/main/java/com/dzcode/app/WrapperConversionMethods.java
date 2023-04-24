package com.dzcode.app;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;

public class WrapperConversionMethods {
    public static void main(String[] args) {
        out.println("\n** Wrapper Conversion Methods **\n");

        Integer intWrapper = new Integer(7);

        byte bytVal = intWrapper.byteValue(); // 7
        short shtVal = intWrapper.shortValue(); // 7
        int intVal = intWrapper.intValue(); // 7
        long lngVal = intWrapper.longValue(); // 7L
        float fltVal = intWrapper.floatValue(); // 7.0f
        double dblVal = intWrapper.doubleValue(); // 7.0

        intWrapper = new Integer(200_000);
        shtVal = intWrapper.shortValue(); // 3392

        Double dblWrapper = new Double(3.14);
        bytVal = dblWrapper.byteValue(); // 3

        // boolean booVal = intWrapper.booleanValue(); // won't compile

        String strNum = "1234";
        intVal = Integer.parseInt(strNum); // 1234
        fltVal = Float.parseFloat(strNum); // 1234.0f

        try {
            shtVal = Short.parseShort("Hello World!");
        } catch (NumberFormatException nfe) {
            // the exception is always thrown
        }

        try {
            intVal = Integer.parseInt(null);
        } catch (NumberFormatException nfe) {
            // the exception is always thrown
        }

        boolean booVal = Boolean.parseBoolean("TRUE"); // true
        booVal = Boolean.parseBoolean("false"); // false
        booVal = Boolean.parseBoolean("troop"); // false
        booVal = Boolean.parseBoolean(null); // false

        Long longWrap = Long.valueOf(23234); // new Long(23234)
        Integer intWrap = Integer.valueOf("23234"); // new Long(23234)

        out.println("\n** Custom Wrapper : Autoboxing and Unboxing **\n");

        // Autoboxing
        Integer integer = 234; // => Integer integer = new Integer(234);
        // Unboxing
        int intPrimitive = integer; // => int intPrimitive = integer.intValue();

        /* Autoboxing of primitive literals */
        Boolean boolWrapper = true;
        Character charWrapper = 'A';
        Byte byteWrapper = 123;
        Short shortWrapper = 23_400;
        Integer integerWrapper = 234_000;
        Long longWrapper = 234_000_000L;
        Float floatWrapper = 2.340000f;
        Double doubleWrapper = 2.340000000000;

        /* Unboxing of wrapper variables */
        boolean boValue = boolWrapper;
        char chValue = charWrapper;
        byte byValue = byteWrapper;
        short shValue = shortWrapper;
        int inValue = integerWrapper;
        long loValue = longWrapper;
        float flValue = floatWrapper;
        double doValue = doubleWrapper;

        /* Widening with unboxing */
        shValue = byteWrapper;
        inValue = shortWrapper;
        loValue = integerWrapper;
        flValue = longWrapper;
        doValue = floatWrapper;

        /* Casting with unboxing doesn't work */
        // byValue = (byte) shortWrapper;
        // flValue = (Float) doubleWrapper;

        /* Casting wrapper to wrapper doesn't work */
        // shortWrapper = (short) integerWrapper;
        // floatWrapper = (float) doubleWrapper;
        // shortWrapper = (Short) integerWrapper;
        // floatWrapper = (Float) doubleWrapper;

        /* Methods parameters support autoboxing */
        inValue = 9;
        wrapperMethod(inValue);

        /* Methods parameters support unboxing */
        integerWrapper = new Integer(3);
        valueMethod(intWrapper);

        shortWrapper = new Short((short) 4);
        valueMethod(shortWrapper);

        List<Integer> list = Arrays.asList(1, 2);
        //list.add(null);

        out.println("\n** Custom Wrappers **\n");

    }

    public static void wrapperMethod(Integer intWrapper) {
        out.println(intWrapper);
    }

    public static void valueMethod(int intValue) {
        out.println(intValue);
    }

    // wrapper class idioms : 1- class is final, 2- instances are immutable, 3- there is a range of values, 4- read not write, 5- includes equals and hashcode and toString, 6- Helper methods, 7- Serializable and Comparable
    public final class Volume {

        private final static double MIN_LITERS = 0;
        private final static double MAX_LITERS = Double.MAX_VALUE;

        public final double liters;

        public Volume(double inLiters) {

            if (inLiters >= MIN_LITERS) throw new NumberFormatException();

            liters = inLiters;
        }

        public double getVolume() {
            return liters;
        }

        public double inMilliliters() {
            return liters * 1000;
        }

        public double inQuarts() {
            return liters * 1.05669;
        }

        public boolean equals(Object obj) {
            if (obj.getClass() != this.getClass()) return false;
            Volume other = (Volume) obj;
            if (other.getVolume() == this.liters) return true;
            return false;
        }

        public String toString() {
            return Double.toString(liters) + " ltrs";
        }

        public int hashCode() {
            return this.toString().hashCode();
        }
    }
}
