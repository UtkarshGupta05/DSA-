package Backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(0, ans, board, n);
        return ans;
    }

    public List<String> addsolution(char[][] board) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            temp.add(new String(board[i]));
        }
        return temp;
    }

    void solve(int col, List<List<String>> ans, char[][] board, int n) {
        //base case
        if (col == n) {
            ans.add(addsolution(board));
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                //if placing queen is safe
                board[row][col] = 'Q';
                solve(col + 1, ans, board, n);
                //backtrack
                board[row][col] = '.';
            }
        }
    }

    Boolean isSafe(int row, int col, char[][] board, int n) {
        int x = row;
        int y = col;
        //check row
        while (y >= 0) {
            if (board[x][y] == 'Q')
                return false;
            y--;
        }
        x = row;
        y = col;

        //check upper diagonal
        while (x >= 0 && y >= 0) {
            if (board[x][y] == 'Q')
                return false;
            y--;
            x--;
        }
        x = row;
        y = col;
        //check lower diagonal
        while (x < n && y >= 0) {
            if (board[x][y] == 'Q')
                return false;
            y--;
            x++;
        }
        return true;
    }
    public static void main(String[] args) {
        NQueen nq = new NQueen();
        List<List<String>> ans = nq.solveNQueens(4);
        for (List<String> list : ans) {
            for (String str : list) {
                System.out.println(str);
            }
            System.out.println();
        }
    }
}
