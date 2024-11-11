package ru.egorov.slotmachine;

import ru.egorov.slotmachine.calculation.Simulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();
        Simulation simulation = new Simulation();
        simulation.simulate(rounds);

    }
}
