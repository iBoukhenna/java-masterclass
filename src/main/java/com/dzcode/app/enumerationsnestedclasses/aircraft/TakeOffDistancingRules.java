package com.dzcode.app.enumerationsnestedclasses.aircraft;

import java.util.Map;
import static com.dzcode.app.enumerationsnestedclasses.aircraft.WakeTurbulence.*;
import static java.util.Map.of;

public class TakeOffDistancingRules {
    private Map<WakeTurbulence, Integer> rules;

    public TakeOffDistancingRules() {
        rules = of(
            LIGHT, 60,
            MEDIUM, 90,
            HEAVY, 110,
            SUPER, 180
        );
    }

    public int calculateWaitTime(Aircraft a) {
        return rules.get(a.getWakeTurbulence());
    }
}
