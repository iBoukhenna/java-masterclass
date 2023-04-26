package com.dzcode.app;

import static java.lang.System.out;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class StringsDatesTimes {

    public static void main(String[] args) {
        System.out.println("/** The Immutable String **/");

        String str = "Hello!";
        String str2 = "Hello!";
        out.println(str == str2); // true

        String str3 = new String("Hello!");
        out.println(str == str3); // false

        String str4 = str.substring(5);
        String str5 = str.substring(5);
        out.println(str4 == str5); // false

        System.out.println("/** String Concatenation **/");

        String cstr = "Hi, ";
        String cstr2 = cstr + "Bob!";
        out.println(cstr2); // "Hi, Bob!"

        String pi = "3.14" + 15926;
        out.println(pi); // "3.1415926"

        String cstr3 = 5 + 3 + "xyz" + 3 + 5;
        out.println(cstr3); // "8xyz35"

        String cstr4 = "Pi is ";
        cstr4 += "3.14";
        out.println(cstr4); // "Pi is 3.14"

        cstr4 += "__" + 5 * 4; // "Pi is 3.14__20"

        out.println("/** String Methods **/");

        String mstr = new String("Hello World!");
        String mstr2 = new String("Hello World!");
        out.println(mstr == mstr2); // false
        out.println(mstr.equals(mstr2)); // true

        String mstr3 = "hello World!";
        out.println(mstr.equals(mstr3)); // false
        out.println(mstr.equalsIgnoreCase(mstr3)); // true

        String lstr = "Hello World!";
        out.println(lstr.length()); // 12

        lstr = "\tHello \"cruel\" World!\n";
        out.println(lstr.length()); // 22

        out.println(lstr.toLowerCase()); // "hello world!"
        out.println(lstr.toUpperCase()); // "HELLO WORLD!"

        out.println(mstr == mstr2 || mstr == mstr3 || mstr2 == mstr3); // false

        str = "Love For All, Hatred For None";

        out.println(str.startsWith("Lov")); // true
        out.println(str.startsWith("Luv")); // false

        out.println(str.endsWith("one")); // true
        out.println(str.endsWith("Non")); // true

        str = "Hello, my name is Richard";
        out.println(str.contains("Rich")); // true
        out.println(str.contains("Rick")); // false

        str = " Hi there! ";
        str2 = str.trim();
        out.println(str2.length()); // 9, "Hi there!"

        str = "\t\b   \"Hi there!\"  \\\r\n\f";
        out.println(str.length()); // 22
        str2 = str.strip();
        out.println(str2.length()); // 18, (   "Hi there!"  \)

        str = " Hi there! ";
        out.println(str.length()); // 11, ( Hi there! )
        str2 = str.stripLeading();
        out.println(str2.length()); // 10, (Hi there! )
        str3 = str.stripTrailing();
        out.println(str3.length()); // 10, ( Hi there!)

        out.println("/** String Methods Chaining **/");

        str = "Hello World!";
        Character chr = str.charAt(1);
        out.println(chr); // 'e'

        str = "Mississippi";
        int index = str.indexOf('s');
        out.println(index); // 2

        index = str.indexOf("is");
        out.println(index); // 1

        index = str.indexOf("i", 5);
        out.println(index); // 7

        index = str.indexOf("ss", 4);
        out.println(index); // 5

        str = "Mississippi";
        String subStr = str.substring(8);
        out.println(subStr); // ppi
        subStr = str.substring(5, 8);
        out.println(subStr); // ssi

        //subStr = str.substring(-5); // throw exception
        //subStr = str.substring(100); // throw exception

        str = "MISSISSIPPI";
        str2 = str.replace('I', 'x');
        out.println(str2); // MxSSxSSxPPx

        str2 = str.replace("SS", "xx");
        out.println(str2); // MIxxIxxIPPI

        str = new String("  Hi there!  ");
        str2 = str.strip();
        out.println(str2); // Hi there!
        str3 = str2.replace("Hi", "Hello");
        out.println(str3); // Hello there!
        str4 = str3.toUpperCase(); 
        out.println(str4); // HELLO THERE!

        str = "  Hi there!  ";
        str2 = str.strip().replace("Hi", "Hello").toUpperCase();
        out.println(str2); // HELLO THERE!


        out.println("/** Dates and Times **/");

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        localDate = LocalDate.of(2022, 10, 31);
        out.println(localDate); // 2022-10-31

        localTime = LocalTime.of(9, 45, 00 , 00);
        out.println(localTime); // 09:45

        localDateTime = LocalDateTime.of(2022, 10, 31, 9, 45);
        out.println(localDateTime); // 2022-10-31T09:45

        zonedDateTime = ZonedDateTime.of(2022, 10, 31, 9, 45, 00, 00, ZoneId.of("America/Chicago"));
        out.println(zonedDateTime); //2022-10-31T09:45-05:00[America/Chicago]

        String dateTimeString = "" + localDateTime.getDayOfWeek() + " " + localDateTime.getMonth() + " " + localDateTime.getDayOfMonth() + " " + localDateTime.getYear() + " at " + localDateTime.getHour() + ":" + localDateTime.getMinute();
        out.println(dateTimeString); // MONDAY OCTOBER 31 2022 at 9:45

        dateTimeString = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        out.println(dateTimeString); // 2022-10-31T9:45

        // String timeString = localTime.format(DateTimeFormatter.ISO_LOCAL_DATE); // throw exception

        localDateTime = LocalDateTime.of(2022, 10, 31, 9, 45);

        var pattern = DateTimeFormatter.ofPattern("EEEE, LLLL dd, yyyy 'at' hh:mm");
        dateTimeString = localDateTime.format(pattern);

        localTime = LocalTime.of(9, 45, 00 , 00);
        // String timeString = localTime.format(pattern); // throw exception
    }
}
