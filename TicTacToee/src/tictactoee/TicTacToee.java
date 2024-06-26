package tictactoee;

import java.util.Scanner;

public class TicTacToee {
  public static void main(String[] args) {
    char[][] board = new char[3][3];
      for (char[] board1 : board) {
          for (int col = 0; col < board1.length; col++) {
              board1[col] = ' ';
          }
      }

    char player = 'X';
    boolean gameOver = false;
    Scanner scanner = new Scanner(System.in);

    while (!gameOver) {
      printBoard(board);
      System.out.print("Player " + player + " enter: ");
      int row = scanner.nextInt();
      int col = scanner.nextInt();
      System.out.println();

      if (board[row][col] == ' ') {
        board[row][col] = player; // place the element
        gameOver = haveWon(board, player);
        if (gameOver) {
          System.out.println("Player " + player + " has won: ");
        } else {
          // if (player == 'X') {
          // player = 'O';
          // } else {
          // player = 'X';
          // }
          player = (player == 'X') ? 'O' : 'X';
        }
      } else {
        System.out.println("Invalid move. Try again!");
      }
    }
    printBoard(board);
  }

  public static boolean haveWon(char[][] board, char player) {
      // check the rows
      for (char[] board1 : board) {
          if (board1[0] == player && board1[1] == player && board1[2] == player) {
              return true;
          }
      }

    // check for col
    for (int col = 0; col < board[0].length; col++) {
      if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
        return true;
      }
    }

    // diagonal
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
      return true;
    }

    return board[0][2] == player && board[1][1] == player && board[2][0] == player;
  }

  public static void printBoard(char[][] board) {
      for (char[] board1 : board) {
          for (int col = 0; col < board1.length; col++) {
              System.out.print(board1[col] + " | ");
          }
          System.out.println();
      }
  }
}