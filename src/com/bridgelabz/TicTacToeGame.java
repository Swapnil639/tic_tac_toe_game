package com.bridgelabz;

public class TicTacToeGame {
    public static void main(String[] args){
        System.out.println("Welcome to Tic Tac Toe game !");
        createBoard();
    }
    public static void createBoard(){
        char[] board = new char[10];
        for (int i=0;i<board.length;i++){
            board[i]=' ';
        }
    }
}