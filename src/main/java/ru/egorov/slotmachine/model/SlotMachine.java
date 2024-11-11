package ru.egorov.slotmachine.model;

import ru.egorov.slotmachine.enums.Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlotMachine {

    private final List<Reel> reels;

    public SlotMachine() {
        List<Codes> firstReel = Arrays.asList(
                Codes.P1, Codes.P11, Codes.P2, Codes.P10, Codes.P3,
                Codes.P11, Codes.P4, Codes.P10, Codes.P5, Codes.P6,
                Codes.P10, Codes.P7, Codes.P8, Codes.P10, Codes.P9,
                Codes.P10, Codes.P11, Codes.P5, Codes.P8, Codes.P9,
                Codes.P6, Codes.P7, Codes.P8, Codes.P10, Codes.P11
        );
        List<Codes> secondReel = Arrays.asList(
                Codes.P1, Codes.P2, Codes.P3, Codes.P4, Codes.P5,
                Codes.P6, Codes.P7, Codes.P8, Codes.P9, Codes.P10,
                Codes.P11, Codes.P4, Codes.P11, Codes.P9, Codes.P11,
                Codes.P7, Codes.P9, Codes.P11, Codes.P7, Codes.P11,
                Codes.P9, Codes.P6, Codes.P8, Codes.P9, Codes.P7
        );
        List<Codes> thirdReel = Arrays.asList(
                Codes.P1, Codes.P2, Codes.P3, Codes.P4, Codes.P5,
                Codes.P6, Codes.P7, Codes.P8, Codes.P9, Codes.P10,
                Codes.P11, Codes.P9, Codes.P6, Codes.P10, Codes.P11,
                Codes.P9, Codes.P10, Codes.P11, Codes.P8, Codes.P11,
                Codes.P10, Codes.P11, Codes.P10, Codes.P8, Codes.P10
        );
        this.reels = Arrays.asList(new Reel(firstReel), new Reel(secondReel), new Reel(thirdReel));
    }

    public List<Codes> playRound() {
        List<Codes> result = new ArrayList<>();
        for (Reel reel : reels) {
            result.add(reel.spin());
        }
        return result;
    }

}
