import java.util.Scanner;

public class UC4_ttt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        // 1. Convert 1-based input to 0-based index
        int index = slot - 1;

        // 2. Mathematical Mapping using Division and Modulo
        // Row = index / board_size
        // Column = index % board_size
        int row = index / 3;
        int col = index % 3;

        // 3. Output the result
        System.out.println("Slot " + slot + " maps to: Row " + row + ", Column " + col);
        
        // Example visualization:
        // Slot 5 -> index 4 -> 4/3 = Row 1, 4%3 = Col 1
    }
}