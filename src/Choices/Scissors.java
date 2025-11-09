package Choices;

public class Scissors extends Choice{

    @Override
    public String getName(){
        return GameChoices.SCISSORS;
    }

    @Override
    public String competeExplanation(Choice otherPlayerChoice) {
        switch (otherPlayerChoice){
            case Rock r:
                return "Scissors gets broken by rock! Scissors loses!";
            case Paper p:
                return "Scissors cut paper! Scissors wins!";
            case Scissors s:
                return "Scissors does nothing to scissors! It's a tie!";
            case Lizard l:
                return "Scissors decapitates lizard! Scissors wins!";
            case Spock sp:
                return "Scissors gets melted by spock! Scissors loses!";
            default:
                return "Invalid choice.";
        }
    }


    @Override
    public int determineWin(Choice otherPlayerChoice){
        switch (otherPlayerChoice){
            case Scissors s:
                return 0; // tie
            case Paper p:
                return 1; // win
            case Lizard l:
                return 1; // win
            default:
                return -1; // loss (rock or spock)
        }
    }
    
}
