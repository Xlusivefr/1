import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class ESPGame {

    // Constants for color choices and game configuration
    private static final String[] COLORS = {
        "Black", "White", "Gray", "Silver", "Maroon", "Red",
        "Purple", "Fuchsia", "Green", "Lime", "Olive", "Yellow",
        "Navy", "Blue", "Teal", "Aqua"
    };
    private static final int NUMBER_OF_COLORS = COLORS.length;
    private static final int NUM_ROUNDS = 3;

    public static void main(String[] args) {
        try {
            // Display header information
            displayHeader();

            // Read and display the colors
            displayColors();

            // Initialize scanner and random number generator
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Random random = new Random();
            int correctGuesses = 0;

            // Play the guessing game for a number of rounds
            for (int round = 1; round <= NUM_ROUNDS; round++) {
                System.out.println("\nRound " + round);
                System.out.println("I am thinking of a color.");
                System.out.println("Is it one of the list of colors above?");
                System.out.print("Enter your guess: ");
                String userGuess = reader.readLine().trim();

                // Generate a random index for color selection
                int index = random.nextInt(NUMBER_OF_COLORS);
                String selectedColor = COLORS[index];

                // Check if the user's guess matches the selected color (case-insensitive)
                if (userGuess.equalsIgnoreCase(selectedColor)) {
                    correctGuesses++;
                }

                // Display the selected color
                System.out.println("I was thinking of " + selectedColor + ".");
            }

            // Game over
            System.out.println("\nGame Over");
            System.out.println("You guessed " + correctGuesses + " out of " + NUM_ROUNDS + " colors correctly.");

            // Collect user information
            System.out.print("Enter your name: ");
            String name = reader.readLine().trim();
            System.out.print("Describe yourself: ");
            String description = reader.readLine().trim();
            System.out.print("Due Date (MM/DD/YY): ");
            String dueDate = reader.readLine().trim();

            // Display user information
            System.out.println("\nUser Name: " + name);
            System.out.println("User Description: " + description);
            System.out.println("Date: " + dueDate);

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }
    }

    // Method to display header information
    private static void displayHeader() {
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.println("Class: CMSC203");
        System.out.println("Instructor: [Instructor Name]");
        System.out.println("Description: This class implements a simple ESP (extrasensory perception) game where the user tries to guess a randomly selected color from a list.");
        System.out.println("Due: MM/DD/YYYY");
        System.out.println("Platform/compiler: Java JDK");
        System.out.println("I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student.");
        System.out.println("Print your Name here: [Your Name]");
        System.out.println();  // Add a blank line for better readability
    }

    // Method to display colors from the array
    private static void displayColors() {
        System.out.println("There are sixteen colors from a file:");
        for (int i = 0; i < NUMBER_OF_COLORS; i++) {
            System.out.println((i + 1) + " " + COLORS[i]);
        }
    }
}
