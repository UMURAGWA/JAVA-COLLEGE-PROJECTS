// Define a public class named "NEST1"
public class NEST1 {
    // Define the main method, the entry point of the program
    public static void main(String[] args) {
        // Start an outer "for" loop with an initialization of 'h' to 1,
        // a condition 'h <= 5', and an increment 'h++' to iterate from 1 to 5.
        for (int h = 1; h <= 5; h++) {
            // Start an inner "for" loop with an initialization of 'o' to 1,
            // a condition 'o < h', which depends on the outer loop variable 'h'.
            for (int o = 1; o < h; o++) {
                // Within the inner loop, print the message "I feel good."
                System.out.println("I feel good");
            }
                System.out.println();
        }
    }
}