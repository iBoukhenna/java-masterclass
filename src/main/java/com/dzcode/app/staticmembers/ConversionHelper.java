package com.dzcode.app.staticmembers;

public final class ConversionHelper {

    // private static final int METERS_IN_ONE_NM = 1852;
    private static int metersInOneNm;

    static {
        metersInOneNm = 1852;
    }

    public static int fromFeeToFL(int feet) {
        return feet / 100;
    }

    public static double fromNmToMeters(double nm) {
        return nm * metersInOneNm;
    }
}
