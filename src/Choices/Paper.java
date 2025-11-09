package Choices;

public class Paper extends Choice{

    @Override
    public String getName(){
        return GameChoices.PAPER;
    }

    @Override
    public String competeExplanation(Choice otherPlayerChoice) {
        switch (otherPlayerChoice){
            case Rock r:
                return "Paper covers rock! Paper wins!";
            case Paper p:
                return "Paper does nothing to paper! It's a tie!";
            case Scissors s:
                return "Paper gets cut by scissors! Paper loses!";
            case Lizard l:
                return "Paper gets eaten by lizard! Paper loses!";
            case Spock sp:
                return "Paper disproves spock! Paper wins!";
            default:
                return "Invalid choice.";
        }
    }


    @Override
    public int determineWin(Choice otherPlayerChoice){
        switch (otherPlayerChoice){
            case Paper p:
                return 0; // tie
            case Spock sp:
                return 1; // win
            case Rock r:
                return 1; // win
            default:
                return -1; // loss (scissors or lizard)
        }
    }
    
}
