package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe{

    static char[] board = new char[9];
    static char playerInput;

    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tac-Toe Game");
        createBoard();
        playerChoice();
        showBoard();
        desiredMove();
    }

    public static void createBoard(){
        for (int i=0; i<9; i++){
            board[i] = ' ';
        }
//        System.out.println(Arrays.toString(board));
    }

    public static void playerChoice() {
        char computer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose between X and O");
        playerInput = sc.next().charAt(0);

        if (playerInput=='X' || playerInput=='x'){
            computer = 'O';
            System.out.println("You Plays with :- " +playerInput+ " and Computer Plays with :- " +computer);}
        else if (playerInput=='O'|| playerInput=='o'){
            computer = 'X';
            System.out.println("You Plays with :- " +playerInput+ " and Computer Plays with :- " +computer);}
        else {
            System.out.println("Please Enter a valid input (i.e. X or O)");}
    }

    public static void showBoard(){
        System.out.println("Tic-Tac-Toe Board");
        System.out.println("     1     2     3");
        System.out.println("        +     +      ");
        System.out.println("A    " +board[0]+"  |  " +board[1]+ "  |  " +board[2]+ "   ");
        System.out.println("  +-----+-----+-----+");
        System.out.println("B    " +board[3]+"  |  " +board[4]+ "  |  " +board[5]+ "   ");
        System.out.println("  +-----+-----+-----+");
        System.out.println("C    " +board[6]+"  |  " +board[7]+ "  |  " +board[8]+ "   ");
        System.out.println("        +     +      ");
    }

    public static void desiredMove(){
        System.out.println("Please Choose a location where you want to put X or O");
        Scanner sc = new Scanner(System.in);
        String chooseLocation = sc.next();
        System.out.println("You Choose:- " +chooseLocation+ " block");
    }
}
