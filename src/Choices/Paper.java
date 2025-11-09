package Choices;

public class Paper extends Choice{

    @Override
    public String getName(){
        return GameChoices.PAPER;
    }

    @Override
    public String competeExplanation(Choice otherPlayerChoice){
        if  (otherPlayerChoice instanceof Rock)
            return "Paper covers rock! Paper wins!";
        else if (otherPlayerChoice instanceof Paper)
            return "Paper does nothing to paper! It's a tie!";
        else if (otherPlayerChoice instanceof Scissors)
            return "Paper gets cut by scissors! Paper loses!";
        else if (otherPlayerChoice instanceof Lizard)
            return "Paper gets eaten by lizard! Paper loses!";
        else if (otherPlayerChoice instanceof Spock)
            return "Paper disproves spock! Paper wins!";
    }

    @Override
    public int determineWin(Choice otherPlayerChoice){

    }
    
}
