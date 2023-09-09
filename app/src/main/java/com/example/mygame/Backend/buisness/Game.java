package com.example.mygame.Backend.buisness;

import com.example.mygame.Backend.buisness.Board;

import java.util.Scanner;

public class Game {
    private Board gameBoard;

    public Game(){
        gameBoard= new Board();
        gameLoopForCommandLine();
    }

    public void gameLoopForCommandLine(){
        Scanner scanner = new Scanner(System.in);
        boolean terminate = false;
        while (!terminate){
            gameBoard.printBoard();
            System.out.println("please select the card number you want to put");
            int cardNumber = scanner.nextInt();
            while (cardNumber<1 || cardNumber>3){
                System.out.println("please select the card number you want to put");
                cardNumber = scanner.nextInt();
            }
            System.out.println("please select the place you want to put the card");
            int place = scanner.nextInt();
            while (place<1 || place>9){
                System.out.println("please select the row you want to put the card");
                place = scanner.nextInt();
            }
            //System.out.println("please select the col you want to put the card");
            //int col = scanner.nextInt();
            /*while (col<1 || col>3){
                System.out.println("please select the col you want to put the card");
                col = scanner.nextInt();
            }*/
            boolean success = gameBoard.addCardToPile(place-1, cardNumber-1);
            if (!success){
                System.out.println("you can't put this card in the place that you choose");
            }
            if (!gameBoard.hasOptionToPut()){
                terminate =true;
                System.out.println("you lose , your score was " + gameBoard.getScore());
            }

        }
    }
}
