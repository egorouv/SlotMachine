package ru.egorov.slotmachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimulationTests {

    private Simulation simulation;

    @BeforeEach
    public void setUp() {
        simulation = new Simulation();
    }

    @Test
    public void testSimulationWithPositiveRounds() {
        int rounds = 1000;
        simulation.simulate(rounds);
        assertTrue(simulation.getTotalOutcome() >= 0, "Total outcome should be non-negative");
        assertTrue(simulation.getTotalWins() >= 0 && simulation.getTotalWins() <= rounds,
                "Total wins should be within the range of 0 to rounds");
    }

}
