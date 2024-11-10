package ru.egorov.slotmachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SlotMachineTests {

    private SlotMachine slotMachine;

    @BeforeEach
    public void setUp() {
        slotMachine = new SlotMachine();
    }

    @Test
    public void testPlayRoundReturnsThreeSymbols() {
        List<Codes> result = slotMachine.playRound();
        assertEquals(3, result.size(), "playRound should return a list of exactly 3 symbols");
    }

    @Test
    public void testPlayRoundReturnsValidSymbols() {
        List<Codes> result = slotMachine.playRound();
        for (Codes code : result) {
            assertNotNull(code, "Each symbol in result should not be null");
        }
    }

}
