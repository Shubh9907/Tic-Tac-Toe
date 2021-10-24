package com.bridgelabz;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[] board = new char[10];
    static char playerCharacter;
    static char computerCharacter;
    static String playerWin, playerLose;
    static double toss;
    static int blankSpaces;
    static int flag;
    static int count, check1, check2, check3, check4;

    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tac-Toe Game");
        createBoard();
        playerChoice();
        showBoard();
        firstTurn();
        gameFlow();
        playAgain();
    }

//    To create a blank tic-tac-toe board
    public static void createBoard() {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }

//    Player can choose either 'X' or 'O'
    public static void playerChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose between X and O");
        playerCharacter = (sc.next().toUpperCase(Locale.ROOT)).charAt(0);

        if (playerCharacter == 'X') {
            computerCharacter = 'O';
            playerWin = "XXX";
            playerLose = "OOO";
            System.out.println("You Plays with :- " + playerCharacter + " and Computer Plays with :- " + computerCharacter);
        } else if (playerCharacter == 'O') {
            computerCharacter = 'X';
            playerWin = "OOO";
            playerLose = "XXX";
            System.out.println("You Plays with :- " + playerCharacter + " and Computer Plays with :- " + computerCharacter);
        } else {
            System.out.println("Your input is invalid Please Enter a valid input (i.e. X or O)");
            playerChoice();
        }
    }

//    to display the tic-tac-toe board
    public static void showBoard() {
        System.out.println("Tic-Tac-Toe Board");
        System.out.println("     1     2     3");
        System.out.println("        +     +      ");
        System.out.println("A    " + board[1] + "  |  " + board[2] + "  |  " + board[3] + "   ");
        System.out.println("  +-----+-----+-----+");
        System.out.println("B    " + board[4] + "  |  " + board[5] + "  |  " + board[6] + "   ");
        System.out.println("  +-----+-----+-----+");
        System.out.println("C    " + board[7] + "  |  " + board[8] + "  |  " + board[9] + "   ");
        System.out.println("        +     +      ");
    }

    /**
     * Player can choose the cell in which he want to put his character.
     * If that cell is already filled then player needs to re-enter the cell.
     * Scanner class is used to get user input.
     */
    public static void playerMove() {
        System.out.println("Your turn Please Choose a location where you want to put " + playerCharacter);
        Scanner sc = new Scanner(System.in);
        String chooseLocation = sc.next();

        switch (chooseLocation) {
            case "A1", "a1": {
                if (board[1] == ' ') {
                    board[1] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "A2", "a2": {
                if (board[2] == ' ') {
                    board[2] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "A3", "a3": {
                if (board[3] == ' ') {
                    board[3] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "B1", "b1": {
                if (board[4] == ' ') {
                    board[4] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "B2", "b2": {
                if (board[5] == ' ') {
                    board[5] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "B3", "b3": {
                if (board[6] == ' ') {
                    board[6] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "C1", "c1": {
                if (board[7] == ' ') {
                    board[7] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "C2", "c2": {
                if (board[8] == ' ') {
                    board[8] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "C3", "c3": {
                if (board[9] == ' ') {
                    board[9] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            default: {
                System.out.println("Your input is invalid Please enter a valid input");
                playerMove();
            }
        }
        showBoard();
    }

//    this methods is used to call computer's priority move
    public static void computerMove() {
        computerTryToWinOrBlock();
    }

//    Check if Computer can win the game then it can check for block the opponent
    public static void computerTryToWinOrBlock() {

        String a1 = "" + board[2] + board[3];
        String a11 = "" + board[4] + board[7];
        String a111 = "" + board[5] + board[9];
        String a2 = "" + board[1] + board[3];
        String a22 = "" + board[5] + board[8];
        String a3 = "" + board[1] + board[2];
        String a33 = "" + board[6] + board[9];
        String a333 = "" + board[5] + board[7];
        String b1 = "" + board[1] + board[7];
        String b11 = "" + board[5] + board[6];
        String b2 = "" + board[1] + board[9];
        String b22 = "" + board[3] + board[7];
        String b222 = "" + board[2] + board[8];
        String b2222 = "" + board[4] + board[6];
        String b3 = "" + board[3] + board[9];
        String b33 = "" + board[4] + board[5];
        String c1 = "" + board[1] + board[4];
        String c11 = "" + board[8] + board[9];
        String c111 = "" + board[3] + board[5];
        String c2 = "" + board[7] + board[9];
        String c22 = "" + board[2] + board[5];
        String c3 = "" + board[3] + board[6];
        String c33 = "" + board[7] + board[8];
        String c333 = "" + board[1] + board[5];


//        Computer will check if he can win
        if (board[1] == ' ' && (a1 + computerCharacter).equals(playerLose)) {
            board[1] = computerCharacter;
            showBoard();
        } else if (board[1] == ' ' && (a11 + computerCharacter).equals(playerLose)) {
            board[1] = computerCharacter;
            showBoard();
        } else if (board[1] == ' ' && (a111 + computerCharacter).equals(playerLose)) {
            board[1] = computerCharacter;
            showBoard();
        } else if (board[2] == ' ' && (a2 + computerCharacter).equals(playerLose)) {
            board[2] = computerCharacter;
            showBoard();
        } else if (board[2] == ' ' && (a22 + computerCharacter).equals(playerLose)) {
            board[2] = computerCharacter;
            showBoard();
        } else if (board[3] == ' ' && (a3 + computerCharacter).equals(playerLose)) {
            board[3] = computerCharacter;
            showBoard();
        } else if (board[3] == ' ' && (a33 + computerCharacter).equals(playerLose)) {
            board[3] = computerCharacter;
            showBoard();
        } else if (board[3] == ' ' && (a333 + computerCharacter).equals(playerLose)) {
            board[3] = computerCharacter;
            showBoard();
        } else if (board[4] == ' ' && (b1 + computerCharacter).equals(playerLose)) {
            board[4] = computerCharacter;
            showBoard();
        } else if (board[4] == ' ' && (b11 + computerCharacter).equals(playerLose)) {
            board[4] = computerCharacter;
            showBoard();
        } else if (board[5] == ' ' && (b2 + computerCharacter).equals(playerLose)) {
            board[5] = computerCharacter;
            showBoard();
        } else if (board[5] == ' ' && (b22 + computerCharacter).equals(playerLose)) {
            board[5] = computerCharacter;
            showBoard();
        } else if (board[5] == ' ' && (b222 + computerCharacter).equals(playerLose)) {
            board[5] = computerCharacter;
            showBoard();
        } else if (board[5] == ' ' && (b2222 + computerCharacter).equals(playerLose)) {
            board[5] = computerCharacter;
            showBoard();
        } else if (board[6] == ' ' && (b3 + computerCharacter).equals(playerLose)) {
            board[6] = computerCharacter;
            showBoard();
        } else if (board[6] == ' ' && (b33 + computerCharacter).equals(playerLose)) {
            board[6] = computerCharacter;
            showBoard();
        } else if (board[7] == ' ' && (c1 + computerCharacter).equals(playerLose)) {
            board[7] = computerCharacter;
            showBoard();
        } else if (board[7] == ' ' && (c11 + computerCharacter).equals(playerLose)) {
            board[7] = computerCharacter;
            showBoard();
        } else if (board[7] == ' ' && (c111 + computerCharacter).equals(playerLose)) {
            board[7] = computerCharacter;
            showBoard();
        } else if (board[8] == ' ' && (c2 + computerCharacter).equals(playerLose)) {
            board[8] = computerCharacter;
            showBoard();
        } else if (board[8] == ' ' && (c22 + computerCharacter).equals(playerLose)) {
            board[8] = computerCharacter;
            showBoard();
        } else if (board[9] == ' ' && (c3 + computerCharacter).equals(playerLose)) {
            board[9] = computerCharacter;
            showBoard();
        } else if (board[9] == ' ' && (c33 + computerCharacter).equals(playerLose)) {
            board[9] = computerCharacter;
            showBoard();
        } else if (board[9] == ' ' && (c333 + computerCharacter).equals(playerLose)) {
            board[9] = computerCharacter;
            showBoard();
        }

//        Computer will check if the opponent is winning then it will block the opponent
        else if (board[1] == ' ' && (a1 + playerCharacter).equals(playerWin)) {
            board[1] = computerCharacter;
            showBoard();
        } else if (board[1] == ' ' && (a11 + playerCharacter).equals(playerWin)) {
            board[1] = computerCharacter;
            showBoard();
        } else if (board[1] == ' ' && (a111 + playerCharacter).equals(playerWin)) {
            board[1] = computerCharacter;
            showBoard();
        } else if (board[2] == ' ' && (a2 + playerCharacter).equals(playerWin)) {
            board[2] = computerCharacter;
            showBoard();
        } else if (board[2] == ' ' && (a22 + playerCharacter).equals(playerWin)) {
            board[2] = computerCharacter;
            showBoard();
        } else if (board[3] == ' ' && (a3 + playerCharacter).equals(playerWin)) {
            board[3] = computerCharacter;
            showBoard();
        } else if (board[3] == ' ' && (a33 + playerCharacter).equals(playerWin)) {
            board[3] = computerCharacter;
            showBoard();
        } else if (board[3] == ' ' && (a333 + playerCharacter).equals(playerWin)) {
            board[3] = computerCharacter;
            showBoard();
        } else if (board[4] == ' ' && (b1 + playerCharacter).equals(playerWin)) {
            board[4] = computerCharacter;
            showBoard();
        } else if (board[4] == ' ' && (b11 + playerCharacter).equals(playerWin)) {
            board[4] = computerCharacter;
            showBoard();
        } else if (board[5] == ' ' && (b2 + playerCharacter).equals(playerWin)) {
            board[5] = computerCharacter;
            showBoard();
        } else if (board[5] == ' ' && (b22 + playerCharacter).equals(playerWin)) {
            board[5] = computerCharacter;
            showBoard();
        } else if (board[5] == ' ' && (b222 + playerCharacter).equals(playerWin)) {
            board[5] = computerCharacter;
            showBoard();
        } else if (board[5] == ' ' && (b2222 + playerCharacter).equals(playerWin)) {
            board[5] = computerCharacter;
            showBoard();
        } else if (board[6] == ' ' && (b3 + playerCharacter).equals(playerWin)) {
            board[6] = computerCharacter;
            showBoard();
        } else if (board[6] == ' ' && (b33 + playerCharacter).equals(playerWin)) {
            board[6] = computerCharacter;
            showBoard();
        } else if (board[7] == ' ' && (c1 + playerCharacter).equals(playerWin)) {
            board[7] = computerCharacter;
            showBoard();
        } else if (board[7] == ' ' && (c11 + playerCharacter).equals(playerWin)) {
            board[7] = computerCharacter;
            showBoard();
        } else if (board[7] == ' ' && (c111 + playerCharacter).equals(playerWin)) {
            board[7] = computerCharacter;
            showBoard();
        } else if (board[8] == ' ' && (c2 + playerCharacter).equals(playerWin)) {
            board[8] = computerCharacter;
            showBoard();
        } else if (board[8] == ' ' && (c22 + playerCharacter).equals(playerWin)) {
            board[8] = computerCharacter;
            showBoard();
        } else if (board[9] == ' ' && (c3 + playerCharacter).equals(playerWin)) {
            board[9] = computerCharacter;
            showBoard();
        } else if (board[9] == ' ' && (c33 + playerCharacter).equals(playerWin)) {
            board[9] = computerCharacter;
            showBoard();
        } else if (board[9] == ' ' && (c333 + playerCharacter).equals(playerWin)) {
            board[9] = computerCharacter;
            showBoard();
        } else {
            computerFirstPriority();
        }
    }

    /*    Computer's first priority move is corners it can check
      if the corners is available then computer can play on that first */
    public static void computerFirstPriority(){
        count=0;check1=0;check2=0;check3=0;check4=0;
        double random = Math.floor(Math.random()*10%4);

        switch ((int) random){
            case 0:
                check1++;
                if (check1==1){
                    count++;}
                if (board[1] == ' ') {
                    board[1] = computerCharacter;
                    showBoard();
                } else if (count<4){
                    computerFirstPriority();
                }
                else
                    computerSecondPriority();
                break;
            case 1:
                check2++;
                if (check2==1){
                    count++;}
                if (board[3] == ' ') {
                    board[3] = computerCharacter;
                    showBoard();
                } else if (count<4){
                    computerFirstPriority();}
                else
                    computerSecondPriority();
                break;
            case 2:
                check3++;
                if (check3==1){
                    count++;}
                if (board[7] == ' ') {
                    board[7] = computerCharacter;
                    showBoard();
                    } else if (count<4){
                    computerFirstPriority();
                }
                else
                    computerSecondPriority();
                break;
            case 3:
                check4++;
                if (check4==1){
                    count++;}
                if (board[9] == ' ') {
                    board[9] = computerCharacter;
                    showBoard();
                } else if (count<4){
                    computerFirstPriority();
                }
                else
                    computerSecondPriority();
                break;
        }
    }


/*    Computer's second priority move is the center it can check
    if the center is available then computer can play on that */
    public static void computerSecondPriority(){
        if (board[5] == ' ') {
            board[5] = computerCharacter;
            showBoard();
        } else {
            computerThirdPriority();
        }
    }

    /* Computer's last priority is side cells if they are available
    then it can play on that */
    public static void computerThirdPriority(){
        double ran = Math.floor(Math.random()*10%4);
        switch ((int) ran) {
            case 0:
                if (board[2] == ' ') {
                    board[2] = computerCharacter;
                    showBoard();
                } else {
                    computerThirdPriority();
                }
                break;
            case 1:
                if (board[4] == ' ') {
                    board[4] = computerCharacter;
                    showBoard();
                } else {
                    computerThirdPriority();
                }
                break;
            case 2:
                if (board[6] == ' ') {
                    board[6] = computerCharacter;
                    showBoard();
                } else {
                    computerThirdPriority();
                }
                break;
            case 3:
                if (board[8] == ' ') {
                    board[8] = computerCharacter;
                    showBoard();
                } else {
                    computerThirdPriority();
                }
                break;
        }
    }

//    Toss To know who is going to take first turn
    public static void firstTurn() {
        toss = Math.floor(Math.random() * 10 % 2);
        if (toss == 1) {
            System.out.println("You won the toss so First turn is yours");
        } else {
            System.out.println("Computer won the toss so Computer has the first turn");
        }
    }

//    This method will check if the player or computer is winning
    public static void checkWinLoseOrTie() {

        String a1 = "" + board[1] + board[2] + board[3];
        String a2 = "" + board[4] + board[5] + board[6];
        String a3 = "" + board[7] + board[8] + board[9];
        String a4 = "" + board[1] + board[4] + board[7];
        String a5 = "" + board[2] + board[5] + board[8];
        String a6 = "" + board[3] + board[6] + board[9];
        String a7 = "" + board[1] + board[5] + board[9];
        String a8 = "" + board[3] + board[5] + board[7];

        if (a1.equals(playerWin) || a2.equals(playerWin) || a3.equals(playerWin) || a4.equals(playerWin) || a5.equals(playerWin) || a6.equals(playerWin) || a7.equals(playerWin) || a8.equals(playerWin)) {
            System.out.println("You won the Tic-Tac-Toe Game");
            flag=1;
        }
        else if (a1.equals(playerLose) || a2.equals(playerLose) || a3.equals(playerLose) || a4.equals(playerLose) || a5.equals(playerLose) || a6.equals(playerLose) || a7.equals(playerLose) || a8.equals(playerLose)) {
            System.out.println("You Lose the Tic-Tac-Toe Game");
            flag=1;
        }
        else if (blankSpaces <= 0) {
            System.out.println("Game Draw");
            flag=1;
        }
    }

//    This method will control the flow of the game
    public static void gameFlow() {
        blankSpaces=9;
        flag=0;

        while (blankSpaces>0) {
            if (toss == 1) {
                if (flag==1){
                    break;}
                playerMove();
                blankSpaces--;
                checkWinLoseOrTie();
                if (flag==1){
                    break;}
                computerMove();
                blankSpaces--;
                checkWinLoseOrTie();}
            else {
                if (flag==1){
                    break;}
                computerMove();
                blankSpaces--;
                checkWinLoseOrTie();
                if (flag==1){
                    break;}
                playerMove();
                blankSpaces--;
                checkWinLoseOrTie();}
        }
    }

//    This method is used to check if player want to play again
    public static void playAgain(){
        System.out.println("Enter 'Y' if you want to play again or Enter 'N' to exit");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().toUpperCase(Locale.ROOT).charAt(0);
        if (input=='Y'){
            System.out.println("Welcome to the Tic-Tac-Toe Game");
            createBoard();
            playerChoice();
            showBoard();
            firstTurn();
            gameFlow();
            playAgain();
        }else if (input=='N'){
            System.out.println("Thanks for Playing Tic-Tac-Toe Game");
        }else {
            System.out.println("Your input is invalid, Thanks for Playing");
        }
    }
}


