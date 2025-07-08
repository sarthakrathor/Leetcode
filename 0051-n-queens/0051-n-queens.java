class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0, board, solutions, n);
        return solutions;
    }

    private void solve(int row, char[][] board, List<List<String>> solutions, int n) {
        if (row == n) {
            solutions.add(buildBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe8Directions(row, col, board, n)) {
                board[row][col] = 'Q'; 
                solve(row + 1, board, solutions, n); 
                board[row][col] = '.'; 
            }
        }
    }

    private List<String> buildBoard(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }

    private boolean isSafe8Directions(int row, int col, char[][] board, int n) {

        // Up
        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col] == 'Q') return false;
        }

        // Down
        for (int r = row + 1; r < n; r++) {
            if (board[r][col] == 'Q') return false;
        }

        // Left
        for (int c = col - 1; c >= 0; c--) {
            if (board[row][c] == 'Q') return false;
        }

        // Right
        for (int c = col + 1; c < n; c++) {
            if (board[row][c] == 'Q') return false;
        }

        // Top-left ↖
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') return false;
        }

        // Top-right ↗
        for (int r = row - 1, c = col + 1; r >= 0 && c < n; r--, c++) {
            if (board[r][c] == 'Q') return false;
        }

        // Bottom-left ↙
        for (int r = row + 1, c = col - 1; r < n && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') return false;
        }

        // Bottom-right ↘
        for (int r = row + 1, c = col + 1; r < n && c < n; r++, c++) {
            if (board[r][c] == 'Q') return false;
        }

        return true; 
    }
}

 