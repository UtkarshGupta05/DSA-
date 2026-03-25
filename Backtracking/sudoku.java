package Backtracking;
public class sudoku {
    public static boolean sudokuSolver(int[][] board, int row, int col) {
        // base case
        if (row == board.length) {
            return true;
        }
        // recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == board.length) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (board[row][col] != 0) {
            return sudokuSolver(board, nextRow, nextCol);
        }
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = i;
                if (sudokuSolver(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // check in row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        // check in col
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        // check in grid
        int sqrt = (int) (Math.sqrt(board.length));
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;
        for (int i = boxRowStart; i < boxRowStart + sqrt; i++) {
            for (int j = boxColStart; j < boxColStart + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if (sudokuSolver(board, 0, 0)) {
            System.out.println("Solution exists");
            display(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}