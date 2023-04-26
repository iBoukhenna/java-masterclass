package com.dzcode.app;

public class SwitchStatement {
 
    public static void main(String[] args) {

        System.out.println("/** Switch Statement **/");
        // 1- test value against multiple matches
        // 2- transfer control based on match
        char sign = '-';
        switch (sign) {
            case '+':
                System.out.println("Positive");
                break;
            case '-':
                System.out.println("Negative");
                break;
            default:
                System.out.println("Sign not recognized");
                break;
        }

        // 3- Starts running code in that branch
        // 4- Continues executing following code until exited
        String valueName = "one";
        int total = 10;
        switch(valueName) {
            case "one":
                total += 1;
            case "two":
                total += 2;
        }
        System.out.println(total); // 13

        total = 10;
        switch(valueName) {
            case "one":
                total += 1;
                break;
            case "two":
                total += 2;
                break;
        }
        System.out.println(total); // 11

        // 5- break immediately exists switch
        // 6- break often used at the end of each branch
        // 7- branch order does not effect branch selection
        // 8- order may be important if execution allowed to flow acros branches
        char operation = '+';
        int sum = 0;
        switch(operation) {
            case '+':
                sum++;
            default:
                System.out.println("Current sum: " + sum); // Current sum: 1
                break;
            case '-':
                System.out.println("Substraction not allowed");
                break;
        }

        operation = ' ';
        sum = 0;
        switch(operation) {
            case '+':
                sum++;
            default:
                System.out.println("Current sum: " + sum); // Current sum: 0
                break;
            case '-':
                System.out.println("Substraction not allowed");
                break;
        }

        operation = '-';
        sum = 0;
        switch(operation) {
            case '+':
                sum++;
            default:
                System.out.println("Current sum: " + sum);
                break;
            case '-':
                System.out.println("Substraction not allowed"); // Substraction not allowed
                break;
        }

        // 9- Supported data types
        // All integral types except long
        // char, byte, short, int
        // Supported integral type wrappers
        // Character, Byte, Short, Integer
        // String: enum values

        Day today = Day.SUN;
        switch (today) {
            case SAT:
            case SUN:
                System.out.println("Weekend");
            break;
            default:
                System.out.println("Weekday");
            break;

        }


        // 10- switch test value
        // any expression that returns a value
        // 11- branch case value
        // any contant expression
        // must be resolvable at compile time

        int iVal = 10;
        byte evenValue = 0;
        final int evenFValue = 0;

        switch (iVal % 2) {
            // case evenValue: // won't compile must be final
            case evenFValue:
                System.out.println("even");
                break;
            case evenFValue + 1:
                System.out.println("odd");
                break;
        }

        // if-else
        // Extremely flexible
        // Can handle most-any condition

        // switch
        // Test must bu based on exact value match (value !==<> value)
        // Type and value requirements (final int maxItems = readMaxItems())
        // Often allows intent to be more clearly expressed than if-else

        System.out.println("Keep working ...");
    } 

    enum Day {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }
}
