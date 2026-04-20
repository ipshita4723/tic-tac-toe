public class UC5_ttt {
    public static void main(String[] args) {
        // Mock board for demonstration (UC1 style)
        char[][] board = {
            {'-', 'X', '-'},
            {'-', '-', '-'},
            {'-', '-', 'O'}
        };

        // Example coordinates from UC4 mapping
        int row = 0; 
        int col = 1;

        // Call validation method
        if (isValidMove(board, row, col)) {
            System.out.println("Move accepted! Updating board...");
            board[row][col] = 'X'; // Example symbol
        } else {
            System.out.println("Move rejected! Invalid bounds or cell already occupied.");
        }
    }

    /**
     * UC5: Validates if a move is legal.
     * @param board The current 2D game board
     * @param r The target row
     * @param c The target column
     * @return true if move is valid, false otherwise
     */
    public static boolean isValidMove(char[][] board, int r, int c) {
        // 1. Boundary Checking (Row and Column must be 0, 1, or 2)
        if (r < 0 || r > 2 || c < 0 || c > 2) {
            return false;
        }

        // 2. Cell Occupancy Check (Cell must be empty/dash)
        if (board[r][c] != '-') {
            return false;
        }

        // If both checks pass
        return true;
    }
}