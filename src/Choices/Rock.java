/*
 * Created on 2025-11-04
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package Choices;

public class Rock extends Choice{

    @Override
    public String getName(){
        return GameChoices.ROCK;
    }

    @Override
    public String competeExplanation(Choice otherPlayerChoice) {
        switch (otherPlayerChoice){
            case Rock r:
                return "Rock does nothing to rock! It's a tie!";
            case Paper p:
                return "Rock gets covered by paper! Rock loses!";
            case Scissors s:
                return "Rock breaks scissors! Rock wins!";
            case Lizard l:
                return "Rock crushes lizard! Rock wins!";
            case Spock sp:
                return "Rock gets vaporized by spock! Rock loses!";
            default:
                return "Invalid choice.";
        }
    }


    @Override
    public int determineWin(Choice otherPlayerChoice){
        switch (otherPlayerChoice){
            case Rock r:
                return 0; // tie
            case Scissors s:
                return 1; // win
            case Lizard l:
                return 1; // win
            default:
                return -1; // loss (paper or spock)
        }
    }
}
