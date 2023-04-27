package com.dzcode.app.encapsulationinheritance.geography;


import java.util.List;
import static java.util.List.of;

public final class Route extends Shape {

    private final String name;
    private final List<LatLon> coordinates;

    public Route(String name, LatLon... coordinates) {
        this.name = name;
        this.coordinates = of(coordinates);
    }

    @Override
    protected String convertToWkt() {
        StringBuilder sb = new StringBuilder();
        sb.append("LINESTRING (");
        for (int i = 0; i < coordinates.size(); i++) {
            LatLon latLon = coordinates.get(i);
            sb.append(latLon.getLon() + " " + latLon.getLat());
            if (i < coordinates.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
