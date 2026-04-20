public class UC1_ttt {
    public static void main(String[] args) {
        // 1. 2D Array Representation (3x3)
        char[][] board = new char[3][3];

        // 2. Initialization Logic
        // Fill the board with '-' to represent empty cells
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // 3. Display Logic (Nested Loops)
        System.out.println("Empty Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Print cell and a space for readability
                System.out.print(board[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}