package com.dzcode.app.statebehaviour;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RadarTarget {

    // Arbitrary number of Arguments
    // Construct called varargs
    // Use it when you don't know how many arguments of a particular type will be used

    // Pass Parameter by value for Primitive types
    // Pass Parameter by Reference types

    // Fields, Class variables, Instance variables, Local variables, Parameters, 

    private String callSign;
    private int flightLevel;
    private int requiredFlightLevel;
    private String model;

    // Field Shadowing : A parameter can have the same name as the field of a class
    // in this case the parameter is said to shadow the field
    // remove ambiguity by using the this keyword
    public RadarTarget(String callSign, int flightLevel, String model) {
        this.callSign = callSign;
        this.flightLevel = flightLevel;
        this.requiredFlightLevel = flightLevel;
        this.model = model;
    }

    public String getLabel() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.callSign);
        sb.append(System.lineSeparator());

        sb.append(this.flightLevel)
            .append(this.getClimbDescendIndicator())
            .append(this.requiredFlightLevel);
        sb.append(System.lineSeparator());

        sb.append(model);

        return sb.toString();
    }

    private String getClimbDescendIndicator() {
        if (this.requiredFlightLevel > this.flightLevel) {
            return "▲";
        }
        if (this.requiredFlightLevel < this.flightLevel) {
            return "▼";
        }
        return "=";
    }

    public void changeAltitude(int newFl) {
        System.out.println(this.callSign + " change altitude " + newFl);
        System.out.println();

        this.requiredFlightLevel = newFl;

        // Simulate long running operation
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(() -> {
            try {
                Thread.sleep((long) (Math.random() * 5 * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.flightLevel = requiredFlightLevel;
        });
    }

}