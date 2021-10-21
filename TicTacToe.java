package com.bridgelabz;

import java.util.Arrays;

public class TicTacToe{

    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tac-Toe Game");
        createBoard();
    }

    public static void createBoard(){
        char[] board = new char[9];
        for (int i=0; i<9; i++){
            board[i] = ' ';
        }
        System.out.println(Arrays.toString(board));
    }
}
