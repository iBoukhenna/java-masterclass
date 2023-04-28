package com.dzcode.app.enumerationsnestedclasses;

import com.dzcode.app.enumerationsnestedclasses.aircraft.Aircraft;
import static com.dzcode.app.enumerationsnestedclasses.aircraft.WakeTurbulence.*;
import java.time.LocalDateTime;
import java.util.List;
import static java.util.List.of;
import static java.time.LocalDateTime.now;

public class Main {

    public static void main(String[] args) {
        List<Aircraft> aircraft = of(
            new Aircraft(1000, "B737", LIGHT),
            new Aircraft(1001, "A320", LIGHT),
            new Aircraft(1002, "A330", MEDIUM),
            new Aircraft(1003, "ATR90", LIGHT),
            new Aircraft(1004, "A380", SUPER)
        );

        int offset = 0;
        for (Aircraft a : aircraft) {
            offset += a.getWakeTurbulence().getTimeOffset();
            LocalDateTime depTime = now().plusSeconds(offset);
            System.out.println("Aircraft " + a.getModeAOctal() + " takes off at " + depTime.toLocalTime());
        }

        // inner class is just class defined in another class
        // it has direct access to the outer class object's fields and methods
        // because it is associated with an instance of the enclosing class it can not contain any static members
        // to instantiate an inner class you must first instantiate the outer class then you can create an inner class object using the outer class object

        // local class can be defined in a method or a for loop or if clause
        // local class can access all the members of its enclosing class
        // local class can access the local variables defined in the same scope; but these variables need to be final or effectively final
        // local class can access the method parameters if they are defined within a method
        // local class : they can not contain any static members except contancts (final static fields of primitive types or string)
        // local class : you can not declare interfaces in a block just classes
        // local class : they can not be instantiated from outside the block they were defined in
        // local class : they do not have access modifiers since they are defined within a block and used within the same block

        // anonymous classes : simplified local class, a great way to declare and instantiate a class at the same time
        // anonymous class can access all the instance members of its enclosing class
        // anonymous class can access the local variables defined in the same scope but these variable need to be final or effectively final
        // anonymous class can access the method parameters if they are defined within a method
        // anonymous class can contain any static members except constants (final static fields of primitive types or String)
        // anonymous class you can not declare contructors in them
        // anonymous class you can add extras method , fields , inner class, 
        
    }
}
