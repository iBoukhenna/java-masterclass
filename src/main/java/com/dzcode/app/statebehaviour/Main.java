package com.dzcode.app.statebehaviour;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        Create a radar target
        Print the label
        Send a change altitude command
        Watch the behaviour
         */

        // Create radar target
        RadarTarget os791 = new RadarTarget("OS791", 280, "B737-800");

        // Print current label
        System.out.println(os791.getLabel());
        System.out.println();

        // Change altitude command
        os791.changeAltitude(200);

        // Keep detecting target to see command executed
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println(os791.getLabel());
            System.out.println();
        }
    }
}
