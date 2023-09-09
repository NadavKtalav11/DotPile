package com.example.mygame.Backend.buisness;


import java.util.Random;

public class Card {
    private boolean[][] cardDots;
    public int numOfDots ;

    public Card() {
        int length = 3;
        int height = 3;
        cardDots = new boolean[length][height];
        int upperBound = 3;
        Random rand = new Random();
        numOfDots = rand.nextInt(upperBound)+1;
        int alreadyPut = 0;
        while (alreadyPut < numOfDots) {
            int col = rand.nextInt(length);
            int row = rand.nextInt(height);
            if (!cardDots[col][row]) {
                cardDots[col][row] = true;
                alreadyPut++;
            }
        }
    }

    public void printCard(){
        for (int i=0 ; i<cardDots.length ; i++){
            for (int j=0; j<cardDots[i].length ; j++){
                if (cardDots[i][j]){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void printCardRow(int row){
        for (int i=0 ; i<cardDots.length ; i++){
            if (cardDots[row][i]){
                System.out.print("|*| ");
            }
            else System.out.print("| | ");
        }

    }


    public boolean[][] getDots(){
        return this.cardDots;
    }

    public int getNumOfDots() {
        return numOfDots;
    }
}

