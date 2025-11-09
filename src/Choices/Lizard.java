package Choices;

public class Lizard extends Choice {

    @Override
    public String getName(){
        return GameChoices.LIZARD;
    }

    @Override
    public String competeExplanation(Choice otherPlayerChoice) {
        switch (otherPlayerChoice){
            case Rock r:
                return "Lizard gets crushed by rock! Lizard loses!";
            case Paper p:
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
