package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        Player player = (Player) new HumanPlayer();
        Simulation simulation = new Simulation(player);

        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextLong(20);
        simulation.initialize(randomNumber);

        simulation.loopUntilPlayerSucceed();
    }
}
