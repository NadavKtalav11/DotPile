package com.example.mygame;



import java.util.ArrayList;

public class Pile {
    private ArrayList<Card> cards;
    private boolean[][] dotsPile ;
    private int numOfDots;

    public Pile(){
        int length = 3;
        int height = 3 ;
        dotsPile = new boolean[length][height];
        cards = new ArrayList<>();
    }

    public boolean addCard(Card card){
        boolean[][] cardDots = card.getDots();
        for (int i=0 ; i<cardDots.length ; i++){
            for (int j=0; j<cardDots[i].length ;j++){
                if (cardDots[i][j] && dotsPile[i][j]){
                    return false;
                }
            }
        }
        for (int i=0 ; i<cardDots.length ; i++) {
            for (int j = 0; j < cardDots[i].length; j++) {
                if (cardDots[i][j]) {
                    dotsPile[i][j] = true;
                }
            }
        }
        numOfDots = numOfDots + card.getNumOfDots();
        cards.add(card);
        return true;
    }
    public boolean pileIsFull(){
        for (int i=0 ; i<dotsPile.length; i++){
            for (int j=0 ; j<dotsPile.length; j++) {
                if (!dotsPile[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void rotate(){
        boolean[][] copy = new boolean[3][3];
        for (int i=0 ; i<dotsPile.length ; i++){
            for (int j=0 ; j<dotsPile[i].length ; j++){
                copy[i][j]= dotsPile[2-j][i];
            }
        }
        dotsPile= copy;
    }

    public void setEmpty(){
        for (int i=0 ; i<dotsPile.length; i++) {
            for (int j = 0; j < dotsPile.length; j++) {
                dotsPile[i][j] = false;

            }
        }
        cards.clear();
        numOfDots = 0;
    }


    public boolean canPutCard(Card card){
        boolean[][] cardDots = card.getDots();
        for (int i=0 ; i<cardDots.length ; i++){
            for (int j=0; j<cardDots[i].length ;j++){
                if (cardDots[i][j] && dotsPile[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public void printPileRow(int row){
        for (int j=0; j<dotsPile[row].length ; j++){
            if (dotsPile[row][j]){
                System.out.print("|*| ");
            }
            else System.out.print("| | ");
        }
    }

    public boolean[][] getDotsPile() {
        return dotsPile;
    }

    public int getNumOfDots(){
        return numOfDots;
    }






}


