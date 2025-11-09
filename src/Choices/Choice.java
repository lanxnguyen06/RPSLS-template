/*
 * Created on 2025-11-04
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package Choices;

// TODO: implement Choice
// Choice should function as the Base class for all the choices
// There is no default Choice!

// Rock was already partially implemented as an example
// You may make changes to the structure and type of both classes!

public abstract class Choice {

    public abstract String getName();
    
    public abstract String competeExplanation(Choice otherPlayerChoice);

    public abstract int determineWin(Choice otherPlayerChoice);


    // NO NEED TO TOUCH compete()
    public int compete(Choice otherPlayerChoice) {
        System.out.println("Outcome: " + competeExplanation(otherPlayerChoice));
        return determineWin(otherPlayerChoice);
    }
}
