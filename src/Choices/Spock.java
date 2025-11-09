package Choices;

public class Spock extends Choice{

    @Override
    public String getName(){
        return GameChoices.ROCK;
    }

    @Override
    public String competeExplanation(Choice otherPlayerChoice){
        if  (otherPlayerChoice instanceof Rock)
            return "Spock vaporizes rock! Spock wins!";
        else if (otherPlayerChoice instanceof Paper)
            return "Spock gets disproved by paper! Spock loses!";
        else if (otherPlayerChoice instanceof Scissors)
            return "Spock melts rock! Spock wins!";
        else if (otherPlayerChoice instanceof Lizard)
            return "Spock gets poisoned by lizard! Spock loses!";
        else if (otherPlayerChoice instanceof Spock)
            return "Spock does nothing to spock! It's a tie";
    }

    @Override
    public int determineWin(Choice otherPlayerChoice){
        if (otherPlayerChoice instanceof Spock)
            return 0; // tie
        else if (otherPlayerChoice instanceof Paper || otherPlayerChoice instanceof Lizard)
            return -1; // lose
        else 
            return 1; // win
    }
    
}
