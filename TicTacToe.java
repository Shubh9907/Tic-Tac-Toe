package com.bridgelabz;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[] board = new char[9];
    static char playerCharacter;
    static char computerCharacter;
    static String win, lose;
    static double toss = Math.floor(Math.random() * 10 % 2);
    static int blankSpaces;
    static int flag = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tac-Toe Game");
        createBoard();
        playerChoice();
        showBoard();
        firstTurn();
        gameFlow();
    }

    public static void createBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }
//        System.out.println(Arrays.toString(board));
    }

    public static void playerChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose between X and O");
        playerCharacter = (sc.next().toUpperCase(Locale.ROOT)).charAt(0);

        if (playerCharacter == 'X') {
            computerCharacter = 'O';
            win = "XXX";
            lose = "OOO";
            System.out.println("You Plays with :- " + playerCharacter + " and Computer Plays with :- " + computerCharacter);
        } else if (playerCharacter == 'O') {
            computerCharacter = 'X';
            win = "OOO";
            lose = "XXX";
            System.out.println("You Plays with :- " + playerCharacter + " and Computer Plays with :- " + computerCharacter);
        } else {
            System.out.println("Please Enter a valid input (i.e. X or O)");
        }
    }

    public static void showBoard() {
        System.out.println("Tic-Tac-Toe Board");
        System.out.println("     1     2     3");
        System.out.println("        +     +      ");
        System.out.println("A    " + board[0] + "  |  " + board[1] + "  |  " + board[2] + "   ");
        System.out.println("  +-----+-----+-----+");
        System.out.println("B    " + board[3] + "  |  " + board[4] + "  |  " + board[5] + "   ");
        System.out.println("  +-----+-----+-----+");
        System.out.println("C    " + board[6] + "  |  " + board[7] + "  |  " + board[8] + "   ");
        System.out.println("        +     +      ");
    }

    public static void playerMove() {
        System.out.println("Your turn Please Choose a location where you want to put " + playerCharacter);
        Scanner sc = new Scanner(System.in);
        String chooseLocation = sc.next();

        switch (chooseLocation) {
            case "A1", "a1": {
                if (board[0] == ' ') {
                    board[0] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "A2", "a2": {
                if (board[1] == ' ') {
                    board[1] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "A3", "a3": {
                if (board[2] == ' ') {
                    board[2] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "B1", "b1": {
                if (board[3] == ' ') {
                    board[3] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "B2", "b2": {
                if (board[4] == ' ') {
                    board[4] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "B3", "b3": {
                if (board[5] == ' ') {
                    board[5] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "C1", "c1": {
                if (board[6] == ' ') {
                    board[6] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "C2", "c2": {
                if (board[7] == ' ') {
                    board[7] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            case "C3", "c3": {
                if (board[8] == ' ') {
                    board[8] = playerCharacter;
                } else {
                    System.out.println("The block you choose is already filled");
                    playerMove();
                }
                break;
            }
            default:
                System.out.println("Your input is invalid");
        }
        showBoard();
    }

    public static void computerMove() {
        double random = Math.floor((Math.random() * 100 % 9));
        double random1;
        if (board[(int) random] == ' ') {
            board[(int) random] = computerCharacter;
            random1 = random;
        } else {
            random1 = 10;
            computerMove();
        }
        if (random == random1) {
            showBoard();
        }
    }

    public static void firstTurn() {
        if (toss == 1) {
            System.out.println("You won the toss so First turn is yours");
            playerMove();
            computerMove();
        } else {
            System.out.println("Computer won the toss so Computer has the first turn");
            computerMove();
            playerMove();
        }
    }

    public static void checkWinLoseOrTie() {

        String a1 = "" + board[0] + board[1] + board[2];
        String a2 = "" + board[3] + board[4] + board[5];
        String a3 = "" + board[6] + board[7] + board[8];
        String a4 = "" + board[0] + board[3] + board[6];
        String a5 = "" + board[1] + board[4] + board[7];
        String a6 = "" + board[2] + board[5] + board[8];
        String a7 = "" + board[0] + board[4] + board[8];
        String a8 = "" + board[2] + board[4] + board[6];

        if (a1.equals(win) || a2.equals(win) || a3.equals(win) || a4.equals(win) || a5.equals(win) || a6.equals(win) || a7.equals(win) || a8.equals(win)) {
            System.out.println("You won the Tic-Tac-Toe Game");
            flag=1;
        }
        else if (a1.equals(lose) || a2.equals(lose) || a3.equals(lose) || a4.equals(lose) || a5.equals(lose) || a6.equals(lose) || a7.equals(lose) || a8.equals(lose)) {
            System.out.println("You Lose the Tic-Tac-Toe Game");
            flag=1;
        }
        else if (blankSpaces <= 0) {
            System.out.println("Game Draw");
            flag=1;
        }
    }

    public static void gameFlow() {
        blankSpaces=7;
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
}


