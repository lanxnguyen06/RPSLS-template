/*
 * Created on 2025-11-04
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

 public final class Player {
    private String name;
    private int wins;

    public Player (String name){
        this.name = name;
        this.wins = 0;
    }

    public String getName(){
        return name;
    }

    public int getWins(){
        return wins;
    }

    public void addWin(){
        wins++;
    }

    public void resetWins(){
        wins = 0;
    }
    // TODO: implement.
}
