import java.util.*;

public class Nqueens {
    public static void nqueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // coloumn loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nqueens(board, row + 1);// function call
            board[row][j] = '.';// bactracking stepp
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----------CHESS BOARD----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ".";

            }
        }
        nqueens(board, 0);
    }
}