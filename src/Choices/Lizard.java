package Choices;

public class Lizard extends Choice {

    @Override
    public String getName(){
        return GameChoices.LIZARD;
    }

    @Override
    public String competeExplanation(Choice otherPlayerChoice) {
        switch (otherPlayerChoice){ // evaluates the other player's choice
            case Rock r: // if the case is that the other player chooses rock (variable r isn't used it's just a placeholder)
                return "Lizard gets crushed by rock! Lizard loses!"; // player = lizard, other player = rock. rock beats lizard so other player wins
            case Paper p: // ... and vice versa for the other choices
                return "Lizard eats paper! Lizard wins!";
            case Scissors s:
                return "Lizard gets decapitated by scissors! Lizard loses!";
            case Lizard l:
                return "Lizard does nothing to lizard! It's a tie!";
            case Spock sp:
                return "Lizard poisons spock! Lizard wins!";
            default:
                return "Invalid choice.";
        }
    }


    @Override
    public int determineWin(Choice otherPlayerChoice){
        switch (otherPlayerChoice){
            case Lizard l:
                return 0; // tie
            case Paper p:
                return 1; // win
            case Spock s:
                return 1; // win
            default:
                return -1; // loss (paper or spock)
        }
    }
    
}
