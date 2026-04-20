import java.util.Scanner;

public class UC3_ttt {
    // Create a Scanner object for global use in the class
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- Welcome to Tic-Tac-Toe ---");
        
        // Call the method and store the returned value
        int slot = getPlayerInput();
        
        System.out.println("You selected slot: " + slot);
    }

    /**
     * UC3: Method to accept user slot input (1-9)
     * @return the integer entered by the user
     */
    public static int getPlayerInput() {
        int input;
        
        System.out.print("Enter a slot number (1-9): ");
        // Read integer input from the console
        input = sc.nextInt();
        
        // Return the slot value to the game logic
        return input;
    }
}