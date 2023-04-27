package com.dzcode.app.interfacespolymorphism.geography;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public interface DistanceCalculator {

    static double calculate(Coordinate c1, Coordinate c2) {
        return sqrt(
            pow((c1.getX() - c2.getX()), 2) + 
            pow((c1.getY() - c2.getY()), 2)
        );
    }

}
