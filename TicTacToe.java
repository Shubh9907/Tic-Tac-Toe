package com.bridgelabz;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[] board = new char[9];
    static char playerCharacter;
    static char computerCharacter;

    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tac-Toe Game");
        createBoard();
        playerChoice();
        showBoard();
        firstTurn();
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
            System.out.println("You Plays with :- " + playerCharacter + " and Computer Plays with :- " + computerCharacter);
        } else if (playerCharacter == 'O') {
            computerCharacter = 'X';
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
        System.out.println("Please Choose a location where you want to put " + playerCharacter);
        Scanner sc = new Scanner(System.in);
        String chooseLocation = sc.next();
        System.out.println("You Choose:- " + chooseLocation + " block");

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

    public static void computerMove(){
        double random = Math.floor((Math.random()*100%9));
        double random1;
        System.out.println("random computer move "+(int)random);
        if (board[(int)random]==' '){
            board[(int)random]=computerCharacter;
            random1=random;
        } else {
            random1=10;
            computerMove();}
        if (random==random1){
        showBoard();}
    }

    public static void firstTurn(){
        double random = Math.floor(Math.random()*10%2);
        System.out.println("toss "+random);
        if (random==1){
            System.out.println("You won the toss so First turn is yours");
            playerMove();
            computerMove();}
        else {
            System.out.println("Computer won the toss so Computer has the first turn");
            computerMove();
            playerMove();}
    }
}

