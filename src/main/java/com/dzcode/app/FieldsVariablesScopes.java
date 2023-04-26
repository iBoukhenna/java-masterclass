package com.dzcode.app;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Random;

public class FieldsVariablesScopes {
    /* STATIC (CLASS) VARIABLES */
    static int field_a = 1000;
    static String field_b = "static a class string";

    /* INSTANCE VARIABLES */
    float field_c = 3.14f;
    String field_d = "a instance string";

    public void method_1() {
        /* LOCAL VARIABLES */
        short variable_a = 122;
        String variable_b = "a string";
    }

    public static void main(String[] args) {
        out.println("/** Fields Local Variable Primitives and Reference Types **/");
        /* LOCAL VARIABLES */
        long variable_c = 122L;
        String variable_d = "another string";

        out.println("/** Members and Member Scope **/");

        boolean flag = (new Random()).nextBoolean();
        long variable_x;
        if (flag) {
            variable_x = 100L;
        }
        // out.println(variable_x); // won't compile

        Random random = new Random();
        int testValue = random.nextInt(5 - 1) + 1;
        long variable_y;
        switch (testValue) {
            case 1:
            variable_y = 100L;
            case 2:
            variable_y = 200L;
            case 3:
            variable_y = 300L;
        }
        // out.println(variable_y); // won't compile

        long variable_z;
        while (flag) {
            variable_z = 100L;
            flag = (new Random()).nextBoolean();
        }

        // out.println(variable_z); // won't compile

        do {
            flag = (new Random()).nextBoolean();
        } while (flag);


        out.println("/** Method Variable Scope **/");
        // private // only in the same class
        // no modifiers // in the same class and same package
        // protected // in the same class and same package and subclass
        // public // in the same class and same package and subclass and same module

        // Only code in the same scope can access a local variable
        // Only code that follows the declaration of a local variable has access to that local variable

        out.println(field_a); // 1000

        int field_a = 2000;
        out.println(field_a); // 2000

        out.println(FieldsVariablesScopes.field_a); // 1000

        out.println("/** Variable Naming Scope **/");

        // 1- variable name can be any length up to 65k
        // 2- use alphanumeric characters, dollar signs or underscores
        // AZaz09_$

        int thisI$variaBLEname_thatIS5verylong = 0;
        int ___$__$___ = 0;
        // int thisIsAlso-AVaraibleName = 0; // won't compile
        // int valid Variable = 0; // won't compile

        // 3- variable names are case sensitive
        int someVArIBle = 0;
        if( someVArIBle == 0){
            // someVarIble = 2; // won't compile
        }

        // 4- the first character must not be a number
        int someMoney = 0;
        int $omeMoney = 0;
        int _moreMoney = 0;
        // int 1stMoney = 0; // won't compile

        // 5- no reserved words
        // unless at least one character is not lower case

        /*
        abstract, assert***, boolean, break, byte, case, catch, char, class, 
        const*, continue, default, do, double, else, enum****, extends, final,
        finally, float, for, goto*, if, implements, import, instanceof, int,
        interface, long, native, new, package, private, protected, public, return,
        short, static, staticfp**, super, switch, synchronised, this, throw, throws,
        transient, try, void, volatile, while
        */

        int abstracT = 0;
        // int abstract = 0; // won't compile
        
        out.println("/** Variable Naming Conventions **/");

        // Naming Rules : Must be followed or code will not compile
        // Naming Conventions : Are not required but are best practices

        // 1- avoid using $ and _
        // int total_due = 0;
        // int total$due = 0;
        int totalDue = 0;

        // 2- use whole words descriptive words
        // int ttl = 0;
        int total = 0;

        // 3- start with a lower-case letter
        // int Amount = 0;
        int amount = 0;

        // 4- for names with multiple words use camel case
        // int totalamountdue = 0;
        int totalAmountDue = 0;

        out.println("/** Local Variable Type Inference **/");

        // 1- type is inferred
        int x = 1;
        var y = 1;
        var z = 3.14f;

        // 2- type cannot change
        //z = "Hello"; // won't compile
        z = y;

        // 3- initialized when declared
        var intX = 5;

        int intZ; // won't compile
        // var intY; // won't compile

        var name = (String)null;

        // 4- single variable declarations
        int nInt = 1, mInt = 2, oInt = 3;
        // var pInt = 1, qInt = 2, rInt = 3; // won't compile

        System.out.println("/** The Varargs Parameter **/");

        someMethod(null);
        someMethod();
        someMethod(5);
        someMethod(3,4,5,8);
        int[] values = {2, 4, 6, 8};
        someMethod(values);
        someMethod("Hello", 3.14, 1, 3, 5);        
    }

    {
        var varValue = 1;
    }

    public static String staticMethod() {
        var h = "hi there";
        return h;
    }

    public int instanceMethod() {
        var q = 1;
        return q += 1;
    }

    // 5- local variables only
    // public LocalVariableTypeInference(var a) {} // won't compile
    // public void whatever(var a, var b) {} // won't compile
    // public static void something(var x, var y) {} // won't compile

    public static void someMethod(int... nums) {
        out.println(Arrays.toString(nums));
    }

    public static void someMethod(String a, double b, int... nums) {
        out.println(a + ", ");
        out.println(b + ", ");
        out.println(Arrays.toString(nums));
    }
}
