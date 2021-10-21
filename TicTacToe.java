package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe{

    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tac-Toe Game");
        createBoard();
        playerChoice();
    }

    public static void createBoard(){
        char[] board = new char[9];
        for (int i=0; i<9; i++){
            board[i] = ' ';
        }
//        System.out.println(Arrays.toString(board));
    }

    public static void playerChoice() {
        char computer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose between X and O");
        char playerInput = sc.next().charAt(0);
        if (playerInput=='X'){
            computer = 'O';}
        else
            computer = 'X';

            System.out.println("You Plays with :- " +playerInput+ " and Computer Plays with :- " +computer);
    }
}
