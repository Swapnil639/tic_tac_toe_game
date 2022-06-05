package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10];

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe game !");
        createBoard();
        playerChoice();
        showBoard();
    }

    public static void createBoard() {

        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void playerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose x or o : ");
        char player = scanner.next().charAt(0);
        char computerPlayer;

        if (player == 'x') {
            computerPlayer = 'o';
        } else {
            computerPlayer = 'x';
        }
        System.out.println("player choice is: " + player + " computer choice is: " + computerPlayer);
    }

    public static void showBoard() {
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
    }
}