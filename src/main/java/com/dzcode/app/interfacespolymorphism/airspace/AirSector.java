package com.dzcode.app.interfacespolymorphism.airspace;

import com.dzcode.app.interfacespolymorphism.geography.Coordinate;

public interface AirSector {

    boolean isInSector(Coordinate x, int altitude);
}