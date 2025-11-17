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

    public void playRound() {
        System.out.printf(player.getName() + ", please enter %s, %s, %s, %s, or %s: %n", GameChoices.ROCK, GameChoices.PAPER,
                GameChoices.SCISSORS, GameChoices.LIZARD, GameChoices.SPOCK);

        String choice = scanner.nextLine();
        Choice playerChoice = getChoice(choice); // converts String choice into choice object to be able to compare the two choices
        Choice computerChoice = getRandomChoice();

        while (playerChoice == null){ // if user enters a string that isn't any of the choices it will still be converted to a choice but will be null so it loops back
            System.out.println("That's not an option, pick again.");
            System.out.printf("<<Player name>>, please enter %s, %s, %s, %s, or %s: %n", GameChoices.ROCK, GameChoices.PAPER,
                GameChoices.SCISSORS, GameChoices.LIZARD, GameChoices.SPOCK);

            choice = scanner.nextLine();
            playerChoice = getChoice(choice);
        }

        System.out.println(player.getName() + " chose " + playerChoice.getName());
        System.out.println(computer.getName() + " chose " + computerChoice.getName());

        int point = playerChoice.compete(computerChoice); // compares to see which choice wins, if player loses, point = -1, if tie +0, if player wins +1

        if (point == 1){
            player.addWin(); // adds a point to the player's score
            System.out.println(player.getName() + " wins this round!");
        }
        else if (point == -1){
            computer.addWin(); // adds a point to the computer's score
            System.out.println(computer.getName() + " wins this round!");
        }
        else if (point == 0){
            System.out.println("This round ends in a tie!");
        }
    }

    private Choice getChoice(String choice) {
        if (choice == null)
            return null;

        choice = choice.toLowerCase(); // converts the string to lowercase for safety measures

        switch(choice){
            case "lizard": // takes in string input "lizard"
                return new Lizard(); // converts the string into a choice by returning a lizard object (in which is a lizard is a subclass of choice)
            case "paper": // does the same thing for the rest of them
                return new Paper();
            case "rock":
                return new Rock();
            case "scissors":
                return new Scissors();
            case "spock":
                return new Spock();
            default:
                return null; // default case
            }
    }

    private Choice getRandomChoice() {
        int rando = random.nextInt(5); // taken from Random class, 0-4 (exclusive of 5). chose 5 because there are 5 choices to choose from

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
                return null; // default case
        }
    }

    public void startGame() {
        System.out.println("Let's play Rock, Paper, Scissors, Lizard, Spock! First player to get to " + minWins + " wins!");
        while (player.getWins() < minWins && computer.getWins() < minWins){
            playRound();
            System.out.println("Scores:");
            System.out.println(player.getName() + " has " + player.getWins() + " points.");
            System.out.println("The computer has " + computer.getWins() + " points.");
            System.out.println("");
        }

        if (player.getWins() >= minWins)
            System.out.println("Congratulations, " + player.getName() + ". You won!");
        else
            System.out.println("The computer wins!");
    }
    


    // NO NEED TO TOUCH main()
    public static void main(String[] args) {
        RockPaperScissorsLizardSpock game = new RockPaperScissorsLizardSpock();
        game.startGame();
        game.scanner.close();
    }
}
