/*
 * Created on 2025-11-04
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

import java.util.Random;
import java.util.Scanner;
import Choices.*;

public class RockPaperScissorsLizardSpock {

    private Player player;
    private Player computer;

    private final int minWins = 2;

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    protected RockPaperScissorsLizardSpock() {
        System.out.println("Player 1, please enter your name:");
        this.player = new Player(scanner.nextLine());
        System.out.println();
        this.computer = new Player("Computer");
    }

    // NOTE: You may define additional methods to provide a better, cleaner structure!

    // TODO: implement playRound and round win check here
    public void playRound() {
        System.out.printf("<<Player name>>, please enter %s, %s, %s, %s, or %s: %n", GameChoices.ROCK, GameChoices.PAPER,
                GameChoices.SCISSORS, GameChoices.LIZARD, GameChoices.SPOCK);
        // ...
    }

    // TODO: implement a method to convert the player's input into a choice
    private Choice getChoice(String choice) {
        choice = choice.toLowerCase();

        if (choice == null)
            return null;
        else{
            switch(choice){
                case "lizard":
                    return new Lizard();
                case "paper":
                    return new Paper();
                case "rock":
                    return new Rock();
                case "scissors":
                    return new Scissors();
                case "spock":
                    return new Spock();
                default:
                    return new Lizard(); // default case
            }
        }
        // Check the passed string and return a Choice object (i.e., Rock, Paper, Scissors, Lizard, or Spock)
        // Pick a default case
    }

    // TODO: implement a method to get a random choice for the computer
    private Choice getRandomChoice() {
        int rando = random.nextInt(5); // taken from Random class, 0-4 (exclusive of 5)

        switch (rando){
            case 0:
                return new Lizard();
            case 1:
                return new Paper();
            case 2:
                return new Rock();
            case 3:
                return new Scissors();
            case 4:
                return new Spock();
            default:
                return new Lizard(); // default case
        }
        // Based on a random number, return a Choice object (i.e., Rock, Paper, Scissors, Lizard, or Spock)
        // Pick a default case
    }

    // TODO: implement the main game loop and overall game win check here
    public void startGame() {
    
    }


    // NO NEED TO TOUCH main()
    public static void main(String[] args) {
        RockPaperScissorsLizardSpock game = new RockPaperScissorsLizardSpock();
        game.startGame();
        game.scanner.close();
    }
}
