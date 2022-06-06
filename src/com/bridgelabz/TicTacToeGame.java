package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10];
    static char player;
    static char computerPlayer;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe game !");
        createBoard();
        playerChoice();
        showBoard();
    }

    // UC1 create board
    public static void createBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    // UC2 player choose letter x or o
    public static void playerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose X or O : ");
        player = scanner.next().toUpperCase().charAt(0);
        if (player == 'X') {
            computerPlayer = 'O';
        } else {
            computerPlayer = 'X';
        }
        while (true) {
            makeMove();
            showBoard();
        }
    }

    // UC3 display board
    public static void showBoard() {
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
    }

    // UC4  make move to a desired location
    public static void makeMove() {
        System.out.println("choose an index from 1 to 9 to write x or o :");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (board[index] == ' ') {
            board[index] = player;
        } else {
            System.out.println("choose an empty place ");
            System.out.println();
        }
    }

}
