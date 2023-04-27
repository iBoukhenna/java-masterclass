package com.dzcode.app.enumerationsnestedclasses.aircraft;

public class Aircraft {
    private final String model;
    private final WakeTurbulence wakeTurbulence;
    private final int modelADecimal;

    public Aircraft(int modeADecimal, String model, WakeTurbulence wakeTurbulence) {
        this.model = model;
        this.wakeTurbulence = wakeTurbulence;
        this.modelADecimal = modeADecimal;
    }

    public int getModeADecimal() {
        return modelADecimal;
    }

    public String getModel() {
        return model;
    }

    public WakeTurbulence getWakeTurbulence() {
        return wakeTurbulence;
    }
}
