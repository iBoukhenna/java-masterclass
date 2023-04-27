package com.dzcode.app.classesobjects;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Objects
        // Partial flight plan
        FlightPlan berlinToBucharest = new FlightPlan(
                "BER",
                "OTP"
        );
        berlinToBucharest.print();

        System.out.println();

        // Complete flight plan
        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2020, 01, 10, 23, 15),
                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
        );
        parisToLondon.print();

        // Basic Garbage Collection Process
        // Mark - identify which objects are in use and whichare not
        // Delete - relive unreferenced objects to free memory
        // Compact - optional step compact remaining referenced objects

    }
}
