package Choices;

public class Lizard extends Choice {

    @Override
    public String getName(){
        return GameChoices.LIZARD;
    }

    @Override
    public String competeExplanation(Choice otherPlayerChoice){
        if  (otherPlayerChoice instanceof Rock)
            return "Lizard gets crushed by rock! Lizard loses!";
        else if (otherPlayerChoice instanceof Paper)
            return "Lizard eats paper! Lizard wins!";
        else if (otherPlayerChoice instanceof Scissors)
            return "Lizard gets decapitated by scissors! Lizard loses!";
        else if (otherPlayerChoice instanceof Lizard)
            return "Lizard does nothing to lizard! It's a tie!";
        else if (otherPlayerChoice instanceof Spock)
            return "Lizard poisons spock! Lizard wins!";
    }

    @Override
    public int determineWin(Choice otherPlayerChoice){
        if (otherPlayerChoice instanceof Lizard)
            return 0; // tie
        else if (otherPlayerChoice instanceof Rock || otherPlayerChoice instanceof Scissors)
            return -1; // lose
        else 
            return 1; // win
    }
    
}
