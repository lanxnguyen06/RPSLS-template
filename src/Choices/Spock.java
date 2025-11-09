package Choices;

public class Spock extends Choice{

    @Override
    public String getName(){
        return GameChoices.ROCK;
    }

    public String competeExplanation(Choice otherPlayerChoice) {
        switch (otherPlayerChoice){
            case Rock r:
                return "Spock vaporizes rock! Spock wins!";
            case Paper p:
                return "Spock gets disproved by paper! Spock loses!";
            case Scissors s:
                return "Spock melts scissors! Spock wins!";
            case Lizard l:
                return "Spock gets poisoned by lizard! Spock loses!";
            case Spock sp:
                return "Spock does nothing to spock! It's a tie";
            default:
                return "Invalid choice.";
        }
    }

    @Override
    public int determineWin(Choice otherPlayerChoice){
        switch (otherPlayerChoice){
            case Spock sp:
                return 0; // tie
            case Scissors s:
                return 1; // win
            case Rock r:
                return 1; // win
            default:
                return -1; // loss (paper or lizard)
        }
    }
}
