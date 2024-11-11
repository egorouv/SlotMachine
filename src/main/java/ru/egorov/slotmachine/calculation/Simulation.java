package ru.egorov.slotmachine.calculation;

import ru.egorov.slotmachine.model.SlotMachine;

public class Simulation {

    private final PayoutCalculation calculation = new PayoutCalculation(new SlotMachine());
    private int totalOutcome;
    private int totalWins;

    public void simulate(int rounds) {
        for (int i = 0; i < rounds; i++) {
            int payout = calculation.calculatePayout();
            if (payout > 0) {
                totalWins++;
                totalOutcome += payout;
            }
        }
        printStatistic(rounds);
    }

    public void printStatistic(int rounds) {
        double totalHitFrequency = (double) totalWins / rounds;
        double returnToPlayer = (double) totalOutcome / rounds;
        System.out.println(
                "Rounds: " + rounds + "\n" +
                "Total Wins: " + totalWins + "\n" +
                "Total Outcome: " + totalOutcome + "\n" +
                "Total Hit Frequency: " + totalHitFrequency + "\n" +
                "Return to Player: " + returnToPlayer
        );
    }

    public int getTotalOutcome() {
        return totalOutcome;
    }

    public int getTotalWins() {
        return totalWins;
    }

}
