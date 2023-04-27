package com.dzcode.app.interfacespolymorphism.airspace;

import com.dzcode.app.interfacespolymorphism.geography.Circle;
import com.dzcode.app.interfacespolymorphism.geography.Coordinate;
import static com.dzcode.app.interfacespolymorphism.geography.DistanceCalculator.*;

/*
Terminal Maneuvering Area
An elliptical/circular sector used near airports for landing / departures
We are using circle for simplicity
 */
public class TMASector implements AirSector {

    private Circle shape;
    private int upperAltitudeFl;

    public TMASector(Circle shape, int upperAltitudeFl) {
        this.shape = shape;
        this.upperAltitudeFl = upperAltitudeFl;
    }

    @Override
    public boolean isInSector(Coordinate x, int altitude) {
        if (altitude > this.upperAltitudeFl) {
            return false;
        }
        double distanceToRadius = calculate(x, this.shape.getOrigin());
        return distanceToRadius < this.shape.getRadiusNm();
    }

}