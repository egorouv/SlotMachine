package ru.egorov.slotmachine.model;

import ru.egorov.slotmachine.enums.Codes;

import java.util.List;
import java.util.Random;

public class Reel {

    private final List<Codes> codes;
    private final Random random;

    public Reel(List<Codes> codes) {
        this.codes = codes;
        this.random = new Random();
    }

    public Codes spin() {
        return codes.get(random.nextInt(codes.size()));
    }

}
