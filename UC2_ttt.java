public class UC2_ttt {
    public static void main(String[] args) {
        // Game State Variables
        String player1 = "Player 1";
        String player2 = "Player 2";
        char p1Symbol, p2Symbol;
        String currentPlayer;
        char currentSymbol;

        // 1. Random Number Generation (Toss)
        // Math.random() returns a value between 0.0 and 1.0
        // (int)(Math.random() * 2) results in either 0 or 1
        int toss = (int) (Math.random() * 2);

        // 2. Conditional Logic for Role Assignment
        System.out.println("Performing toss...");
        
        if (toss == 0) {
            System.out.println("Toss Result: 0 -> " + player1 + " starts first!");
            currentPlayer = player1;
            p1Symbol = 'X';
            p2Symbol = 'O';
            currentSymbol = p1Symbol;
        } else {
            System.out.println("Toss Result: 1 -> " + player2 + " starts first!");
            currentPlayer = player2;
            p2Symbol = 'X';
            p1Symbol = 'O';
            currentSymbol = p2Symbol;
        }

        // 3. Display Final Assignment
        System.out.println("--- Assignment ---");
        System.out.println(player1 + " Symbol: " + p1Symbol);
        System.out.println(player2 + " Symbol: " + p2Symbol);
        System.out.println("Current Turn: " + currentPlayer + " (" + currentSymbol + ")");
    }
}