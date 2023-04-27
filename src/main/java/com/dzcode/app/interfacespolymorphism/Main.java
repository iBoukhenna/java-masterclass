package com.dzcode.app.interfacespolymorphism;

import com.dzcode.app.interfacespolymorphism.airspace.AirSector;
import com.dzcode.app.interfacespolymorphism.airspace.EnRouteSector;
import com.dzcode.app.interfacespolymorphism.airspace.TMASector;
import com.dzcode.app.interfacespolymorphism.geography.Circle;
import com.dzcode.app.interfacespolymorphism.geography.Coordinate;
import com.dzcode.app.interfacespolymorphism.geography.Rectangle;
import com.dzcode.app.interfacespolymorphism.radar.Aircraft;

import java.util.List;
import static java.util.List.of;
import static java.lang.System.out;

public class Main {

    // interface methods are by default abstract and public
    // when a class implements them they must be public
    // fields defined in interfaces are public static and final by default

    // default must provide an implementation
    // default is implicitly public
    // can be overridden by classes that implement the interface
    // static method can be called only with the interface

    // functional Interface is an interface that contains a single abstract method
    // it is an interface that expose one single responsibility
    // can have multiple default or static methods
    // can use @FunctionalInterface to make sure the interface does not have more than one abstract method
    // we can implement functional interfaces with lambdas no need for creating concrete classes

    // Polymorphism
    // the ability of an abstraction to take many forms at runtime
    // using a common refrence variable type
    // change behavior of an application at runtime even without recompiling your code
    // reduces coupling because we can depend on abstractions, not concrete types
    // we can use a single variable type to store many types

    public static void main(String[] args) {
        List<AirSector> sectorsWithBadWeather = of(
            new TMASector(new Circle(new Coordinate(20, 20), 10), 100),
            new EnRouteSector(new Rectangle(new Coordinate(0, 0), new Coordinate(10, 20), new Coordinate(0, 20), new Coordinate(10, 0)), 200, 400)
        );

        List<Aircraft> flyingAircraft = of(
            new Aircraft("OS876", new Coordinate(20, 20), 50),
            new Aircraft("RO345", new Coordinate(5, 15), 200),
            new Aircraft("TA234", new Coordinate(30, 10), 230)
        );

        sectorsWithBadWeather.forEach(s -> {
            flyingAircraft.forEach(a -> {
                if (s.isInSector(a.getCoordinate(), a.getAltitudeFl())) {
                    out.println("WARNING -> " + a.getCallSign() + " in bad weather secotr");
                }
            });
        });
    }
}