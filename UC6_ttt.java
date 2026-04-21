public class UC6_ttt {

    // Method to place move
    public static void placeMove(char[] board, int index, char symbol) {

        // Check if index is valid (1–9)
        if (index >= 1 && index <= 9) {
            if (board[index - 1] == ' ') {   // check empty
                board[index - 1] = symbol;
                System.out.println("Board updated: Symbol '" + symbol + "' placed at position " + index);
            } else {
                System.out.println("Cell already occupied!");
            }
        } else {
            System.out.println("Invalid position! Choose 1–9.");
        }
    }

    // Correct main method
    public static void main(String[] args) {

        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        int index = 5;      // example move
        char symbol = 'X';  // example symbol

        placeMove(board, index, symbol);
    }
}