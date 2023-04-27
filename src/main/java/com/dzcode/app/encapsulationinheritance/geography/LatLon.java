package com.dzcode.app.encapsulationinheritance.geography;

public class LatLon {
    private double lat;
    private double lon;

    public LatLon(double lat, double lon) {
        this.setLat(lat);
        this.setLon(lon);
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    private void setLat(double lat) {
        if (lat < -90 || lat > 90) {
            throw new IllegalArgumentException("Value not valid");
        }
    }

    private void setLon(double lon) {
        if (lon < -180 || lon > 180) {
            throw new IllegalArgumentException("Value not valid");
        }
        this.lon = lon;
    }
}
