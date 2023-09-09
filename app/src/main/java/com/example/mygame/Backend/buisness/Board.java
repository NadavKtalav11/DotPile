package com.example.mygame.Backend.buisness;


public class Board {
    private Pile[][] pilesBoard;
    private Card[] cardsToPut;
    private int remainingCards;
    private int boardLength = 3;
    private int boardHeight = 3;
    private ScoreBoard scoreBoard;


    public Board(){
        cardsToPut = new Card[3];
        pilesBoard = new Pile[boardHeight][boardLength];
        for (int i= 0 ; i< boardHeight ; i++){
            for (int j=0 ; j<boardLength; j++){
                pilesBoard[i][j] = new Pile();
            }
        }
        for (int i=0 ; i<cardsToPut.length;i++){
            cardsToPut[i]= new Card();
        }
        remainingCards = 3;
        scoreBoard = new ScoreBoard();
    }


    public boolean addCardToPile(int pileNum , int cardNum){
        int row = pileNum/3;
        int col = pileNum%3;
        if (cardsToPut[cardNum]== null){
            return false;
        }
        Card currCard = cardsToPut[cardNum];
        Pile currPile =pilesBoard[row][col];
        boolean success =currPile.addCard(currCard);
        if (success){
            scoreBoard.addScore(pilesBoard[row][col].getNumOfDots());
            if (currPile.pileIsFull()){
                scoreBoard.addScore(10);
                currPile.setEmpty();
            }
            cardsToPut[cardNum]=null;
            remainingCards--;
            if (remainingCards ==0){
                newCardsToPut();
            }
        }



        return success;
    }

    public int getScore(){
        return scoreBoard.getCurrScore();
    }

    public boolean hasOptionToPut(){
        for (int i = 0; i < boardHeight ; i++) {
            for (int j = 0; j < boardLength; j++) {
                for (int k = 0; k < 3; k++) {
                    if (cardsToPut[k]!=null) {
                        if (pilesBoard[i][j].canPutCard(cardsToPut[k])) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean hasOptionToPutWithRotate() {
        Pile[][] copy = new Pile[boardHeight][boardLength];
        for (int i = 0; i < boardHeight ; i++) {
            for (int j = 0; j < boardLength; j++) {
                copy[i][j] = new Pile(pilesBoard[i][j]);
            }
        }

        for (int i = 0; i < boardHeight ; i++) {
            for (int j = 0; j < boardLength; j++) {
                copy[i][j].rotate();
            }
        }

        for (int i = 0; i < boardHeight ; i++) {
            for (int j = 0; j < boardLength; j++) {
                for (int k = 0; k < 3; k++) {
                    if (cardsToPut[k]!=null) {
                        if (copy[i][j].canPutCard(cardsToPut[k])) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


    public void newCardsToPut() {
        boolean cardsHasOption = false;
        while (!cardsHasOption) {
            Card[] optionalCards = new Card[3];
            for (int i = 0; i < cardsToPut.length; i++) {
                optionalCards[i] = new Card();
            }
            boolean hasOptionToPut = false;
            for (int i = 0; i < boardHeight & !hasOptionToPut; i++) {
                for (int j = 0; j < boardLength && !hasOptionToPut; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (optionalCards[k] != null) {
                            if (pilesBoard[i][j].canPutCard(optionalCards[k])) {
                                hasOptionToPut = true;
                                cardsHasOption = true;
                            }
                        }
                    }
                }
            }
            cardsToPut= optionalCards;
        }
        remainingCards = 3;

    }

    public void printBoard(){
        System.out.println("your score is- " + scoreBoard.getCurrScore());
        //System.out.println("       1             2             3     ");
        for (int i= 0 ; i<boardHeight*3 ; i++) {

            for (int j = 0; j < boardLength; j++) {
                if ((i%3) ==1){
                    System.out.print((i+j)+ " ");
                }
                else {
                    System.out.print("  ");
                }
                pilesBoard[i/3][j].printPileRow(i%3);
                System.out.print("  ");
            }
            if ((i+1)%3==0) {
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("card options are- " );
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<cardsToPut.length;j++) {
                if (i==0){
                    System.out.print(j+1 +"- ");
                }
                else {
                    System.out.print("   ");
                }
                if (cardsToPut[j] != null) {
                    cardsToPut[j].printCardRow(i);
                }

            }
            System.out.println();
        }
    }

    public boolean NotNullCards(){
        return remainingCards==3|| remainingCards==0;
    }

    public Card[] getCardsToPut(){
        return cardsToPut;
    }
    public Card getCardsToPut(int cardNum){
        return cardsToPut[cardNum];
    }

    public Pile[][] getPilesBoard() {
        return pilesBoard;
    }

    public Pile getPile(int pileNum) {

        return pilesBoard[pileNum/3][pileNum%3];
    }

    public void rotate(int pile){
        pilesBoard[pile/3][pile%3].rotate();
    }
}

