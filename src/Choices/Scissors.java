package Choices;

public class Scissors extends Choice{

    @Override
    public String getName(){
        return GameChoices.SCISSORS;
    }

    @Override
    public String competeExplanation(Choice otherPlayerChoice){
        if  (otherPlayerChoice instanceof Rock)
            return "Scissors gets broken by rock! Scissors loses!";
        else if (otherPlayerChoice instanceof Paper)
            return "Scissors cut paper! Scissors wins!";
        else if (otherPlayerChoice instanceof Scissors)
            return "Scissors does nothing to scissors! It's a tie!";
        else if (otherPlayerChoice instanceof Lizard)
            return "Scissors decapitate lizard! Scissors wins!";
        else if (otherPlayerChoice instanceof Spock)
            return "Scissors gets melted by spock! Scissors loses!";
    }

    @Override
    public int determineWin(Choice otherPlayerChoice){

    }
    
}
