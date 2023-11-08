// Define a public class named "BREAKSTATEMENT"
public class BREAKSTATEMENT {
    // Define the main method, the entry point of the program
    public static void main(String[] args) {
        // Start a "for" loop with an initialization of 'i' to 28,
        // a condition 'i <= 31', and an increment 'i++' to iterate from 28 to 31 (inclusive).
        for (int i = 28; i <= 31; i++) {
            // Check if 'i' is equal to 30.
            if (i == 30) {
                // If 'i' is equal to 30, print a message and use the "break" statement to exit the loop.
                System.out.println("This code Breaks the dates before this one.");
                break;
            }
            // If 'i' is not equal to 30, print a message indicating the days before 'i'.
            System.out.println("Days before this " + i) ;
        }
        // End of the "for" loop
    }
}

