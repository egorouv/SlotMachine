package ru.egorov.slotmachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.egorov.slotmachine.calculation.PayoutCalculation;
import ru.egorov.slotmachine.enums.Codes;
import ru.egorov.slotmachine.model.SlotMachine;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayoutCalculationTests {

    private PayoutCalculation payoutCalculation;
    private SlotMachine slotMachine;

    @BeforeEach
    public void setUp() {
        slotMachine = new SlotMachine();
        payoutCalculation = new PayoutCalculation(slotMachine);
    }

    private void setSlotMachineResult(Codes... codes) {
        slotMachine = new SlotMachine() {
            @Override
            public List<Codes> playRound() {
                return Arrays.asList(codes);
            }
        };
        payoutCalculation = new PayoutCalculation(slotMachine);
    }

    @Test
    public void testMatchThreePayout() {
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P1);
        assertEquals(100, payoutCalculation.calculatePayout(), "Expected payout for three P1 symbols is 100");

        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P2);
        assertEquals(80, payoutCalculation.calculatePayout(), "Expected payout for three P2 symbols is 80");

        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P3);
        assertEquals(80, payoutCalculation.calculatePayout(), "Expected payout for three P3 symbols is 80");

        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P4);
        assertEquals(50, payoutCalculation.calculatePayout(), "Expected payout for three P4 symbols is 50");

        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P5);
        assertEquals(50, payoutCalculation.calculatePayout(), "Expected payout for three P5 symbols is 50");

        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P6);
        assertEquals(25, payoutCalculation.calculatePayout(), "Expected payout for three P6 symbols is 25");

        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P7);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for three P7 symbols is 20");

        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P8);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for three P8 symbols is 20");

        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P9);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for three P9 symbols is 10");

        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P10);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for three P10 symbols is 10");

        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P11);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for three P11 symbols is 10");
    }

    @Test
    public void testMatchTwoPayout() {
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P2);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P3);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P4);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P5);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P6);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P7);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P8);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P9);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P10);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");
        setSlotMachineResult(Codes.P1, Codes.P1, Codes.P11);
        assertEquals(30, payoutCalculation.calculatePayout(), "Expected payout for two P1 symbols is 30");

        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P1);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");
        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P3);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");
        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P4);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");
        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P5);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");
        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P6);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");
        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P7);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");
        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P8);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");
        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P9);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");
        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P10);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");
        setSlotMachineResult(Codes.P2, Codes.P2, Codes.P11);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P2 symbols is 20");

        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P1);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");
        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P2);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");
        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P4);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");
        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P5);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");
        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P6);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");
        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P7);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");
        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P8);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");
        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P9);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");
        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P10);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");
        setSlotMachineResult(Codes.P3, Codes.P3, Codes.P11);
        assertEquals(20, payoutCalculation.calculatePayout(), "Expected payout for two P3 symbols is 20");

        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P1);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");
        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P2);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");
        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P3);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");
        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P5);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");
        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P6);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");
        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P7);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");
        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P8);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");
        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P9);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");
        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P10);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");
        setSlotMachineResult(Codes.P4, Codes.P4, Codes.P11);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P4 symbols is 10");

        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P1);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");
        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P2);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");
        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P3);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");
        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P4);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");
        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P6);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");
        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P7);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");
        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P8);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");
        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P9);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");
        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P10);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");
        setSlotMachineResult(Codes.P5, Codes.P5, Codes.P11);
        assertEquals(10, payoutCalculation.calculatePayout(), "Expected payout for two P5 symbols is 10");

        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P1);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");
        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P2);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");
        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P3);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");
        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P4);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");
        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P5);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");
        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P7);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");
        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P8);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");
        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P9);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");
        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P10);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");
        setSlotMachineResult(Codes.P6, Codes.P6, Codes.P11);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P6 symbols is 5");

        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P1);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");
        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P2);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");
        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P3);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");
        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P4);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");
        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P5);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");
        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P6);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");
        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P8);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");
        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P9);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");
        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P10);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");
        setSlotMachineResult(Codes.P7, Codes.P7, Codes.P11);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P7 symbols is 5");

        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P1);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");
        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P2);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");
        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P3);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");
        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P4);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");
        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P5);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");
        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P6);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");
        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P7);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");
        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P9);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");
        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P10);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");
        setSlotMachineResult(Codes.P8, Codes.P8, Codes.P11);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P8 symbols is 5");

        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P1);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");
        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P2);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");
        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P3);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");
        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P4);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");
        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P5);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");
        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P6);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");
        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P7);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");
        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P8);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");
        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P10);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");
        setSlotMachineResult(Codes.P9, Codes.P9, Codes.P11);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P9 symbols is 5");

        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P1);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");
        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P2);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");
        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P3);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");
        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P4);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");
        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P5);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");
        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P6);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");
        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P7);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");
        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P8);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");
        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P9);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");
        setSlotMachineResult(Codes.P10, Codes.P10, Codes.P11);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P10 symbols is 5");

        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P1);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P2);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P3);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P4);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P5);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P6);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P7);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P8);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P9);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
        setSlotMachineResult(Codes.P11, Codes.P11, Codes.P10);
        assertEquals(5, payoutCalculation.calculatePayout(), "Expected payout for two P11 symbols is 5");
    }

    @Test
    public void testMatchOnePayout() {
        setSlotMachineResult(Codes.P11, Codes.P1, Codes.P1);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
        setSlotMachineResult(Codes.P11, Codes.P2, Codes.P2);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
        setSlotMachineResult(Codes.P11, Codes.P3, Codes.P3);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
        setSlotMachineResult(Codes.P11, Codes.P4, Codes.P4);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
        setSlotMachineResult(Codes.P11, Codes.P5, Codes.P5);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
        setSlotMachineResult(Codes.P11, Codes.P6, Codes.P6);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
        setSlotMachineResult(Codes.P11, Codes.P7, Codes.P7);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
        setSlotMachineResult(Codes.P11, Codes.P8, Codes.P8);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
        setSlotMachineResult(Codes.P11, Codes.P9, Codes.P9);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
        setSlotMachineResult(Codes.P11, Codes.P10, Codes.P10);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");

        setSlotMachineResult(Codes.P11, Codes.P1, Codes.P2);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");

        setSlotMachineResult(Codes.P11, Codes.P2, Codes.P1);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");

        setSlotMachineResult(Codes.P11, Codes.P1, Codes.P11);
        assertEquals(2, payoutCalculation.calculatePayout(), "Expected payout for single P11 symbol is 2");
    }

    @Test
    public void testNoMatchPayout() {
        setSlotMachineResult(Codes.P1, Codes.P2, Codes.P3);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");

        setSlotMachineResult(Codes.P4, Codes.P5, Codes.P6);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");

        setSlotMachineResult(Codes.P7, Codes.P8, Codes.P9);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");

        setSlotMachineResult(Codes.P10, Codes.P3, Codes.P5);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");

        setSlotMachineResult(Codes.P9, Codes.P2, Codes.P4);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");

        setSlotMachineResult(Codes.P6, Codes.P11, Codes.P1);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");

        setSlotMachineResult(Codes.P5, Codes.P10, Codes.P7);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");

        setSlotMachineResult(Codes.P3, Codes.P6, Codes.P8);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");

        setSlotMachineResult(Codes.P2, Codes.P7, Codes.P9);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");

        setSlotMachineResult(Codes.P1, Codes.P4, Codes.P10);
        assertEquals(0, payoutCalculation.calculatePayout(), "Expected payout for all different symbols is 0");
    }

}
