package com.example.mygame.Backend.buisness;

public class ScoreBoard {
    private int currScore;

    public ScoreBoard(){
        currScore = 0;
    }
    public void addScore(int points){
        currScore = currScore+points;
    }

    public int getCurrScore() {
        return currScore;
    }
}
