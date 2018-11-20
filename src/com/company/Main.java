package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] playerboard = new String[8][8];
        Chessboard board = new Chessboard(playerboard);
        board.setBoard('a', 5, "Test");
        System.out.println(board.getBoard('a', 5));
    }
}

class Chessboard{
    private String[][] board;

    public Chessboard(String[][] board) {
        this.board = board;
    }

    public String getBoard(char col, int row) {
        return this.board[getColumn(col)][row-1];
    }

    public void setBoard(char col, int row, String value) {
        this.board[getColumn(col)][row-1] = value;
    }

    private int getColumn(char col){
        int column = 0;
        switch (col){
            case 'a':
                column = 0;
                break;
            case 'b':
                column = 1;
                break;
            case 'c':
                column = 2;
                break;
            case 'd':
                column = 3;
                break;
            case 'e':
                column = 4;
                break;
            case 'f':
                column = 5;
                break;
            case 'g':
                column = 6;
                break;
            case 'h':
                column = 7;
                break;
        }
        return column;
    }
}
