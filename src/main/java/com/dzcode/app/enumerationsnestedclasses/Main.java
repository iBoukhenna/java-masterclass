package com.dzcode.app.enumerationsnestedclasses;

import com.dzcode.app.enumerationsnestedclasses.aircraft.Aircraft;
import static com.dzcode.app.enumerationsnestedclasses.aircraft.WakeTurbulence.*;
import java.time.LocalDateTime;
import java.util.List;
import static java.util.List.of;
import static java.time.LocalDateTime.now;

public class Main {

    public static void main(String[] args) {
        List<Aircraft> aircraft = of(
            new Aircraft(1000, "B737", LIGHT),
            new Aircraft(1001, "A320", LIGHT),
            new Aircraft(1002, "A330", MEDIUM),
            new Aircraft(1003, "ATR90", LIGHT),
            new Aircraft(1004, "A380", SUPER)
        );

        int offset = 0;
        for (Aircraft a : aircraft) {
            offset += a.getWakeTurbulence().getTimeOffset();
            LocalDateTime depTime = now().plusSeconds(offset);
            System.out.println("Aircraft " + a.getModeADecimal() + " takes off at " + depTime.toLocalTime());
        }
    }
}
