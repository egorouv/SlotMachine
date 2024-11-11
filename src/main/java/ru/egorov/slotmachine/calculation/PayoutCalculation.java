package ru.egorov.slotmachine.calculation;

import ru.egorov.slotmachine.enums.Codes;
import ru.egorov.slotmachine.model.SlotMachine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayoutCalculation {

    private final SlotMachine slotMachine;

    private static final Map<Codes, Integer> matchThree = new HashMap<>();
    private static final Map<Codes, Integer> matchTwo = new HashMap<>();

    static {
        matchThree.put(Codes.P1, 100);
        matchThree.put(Codes.P2, 80);
        matchThree.put(Codes.P3, 80);
        matchThree.put(Codes.P4, 50);
        matchThree.put(Codes.P5, 50);
        matchThree.put(Codes.P6, 25);
        matchThree.put(Codes.P7, 20);
        matchThree.put(Codes.P8, 20);
        matchThree.put(Codes.P9, 10);
        matchThree.put(Codes.P10, 10);
        matchThree.put(Codes.P11, 10);

        matchTwo.put(Codes.P1, 30);
        matchTwo.put(Codes.P2, 20);
        matchTwo.put(Codes.P3, 20);
        matchTwo.put(Codes.P4, 10);
        matchTwo.put(Codes.P5, 10);
        matchTwo.put(Codes.P6, 5);
        matchTwo.put(Codes.P7, 5);
        matchTwo.put(Codes.P8, 5);
        matchTwo.put(Codes.P9, 5);
        matchTwo.put(Codes.P10, 5);
        matchTwo.put(Codes.P11, 5);
    }

    public PayoutCalculation(SlotMachine slotMachine) {
        this.slotMachine = slotMachine;
    }

    public int calculatePayout() {

        List<Codes> result = slotMachine.playRound();

        if (result.get(0) == result.get(1)
                && result.get(1) == result.get(2)
                && result.get(0) == result.get(2))
            return matchThree.get(result.get(0));

        else if (result.get(0) == result.get(1)
                && result.get(0) != result.get(2)
                && result.get(1) != result.get(2))
            return matchTwo.get(result.get(0));

        else if (result.get(0) == Codes.P11
                && result.get(1) != Codes.P11)
            return  2;

        else return 0;

    }

}
