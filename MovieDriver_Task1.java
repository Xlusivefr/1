import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        // Create a new object of type Scanner that reads from the keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Loop to allow input for multiple movies
        boolean continueInput = true;

        while (continueInput) {
            // Create a new movie object
            Movie movie = new Movie();
            
            // Prompt the user to enter the title of a movie
            System.out.println("Enter the title of the movie:");
            // Read in the line that the user types
            String title = scanner.nextLine();
            // Set the title in the movie object
            movie.setTitle(title);
            
            // Prompt the user to enter the movie’s rating
            System.out.println("Enter the movie's rating:");
            // Read in the line that the user types
            String rating = scanner.nextLine();
            // Set the rating in the movie object
            movie.setRating(rating);
            
            // Prompt the user to enter the number of tickets sold at a (unnamed) theater
            System.out.println("Enter the number of tickets sold:");
            // Read in the integer that the user types
            int ticketsSold = scanner.nextInt();
            // Set the number of tickets sold in the movie object
            movie.setSoldTickets(ticketsSold);
            
            // Print out the information using the movie’s toString method
            System.out.println(movie.toString());

            // Prompt to see if the user wants to continue
            System.out.println("Do you want to enter another movie? (yes/no)");
            String response = scanner.next();
            scanner.nextLine(); // Clear the newline character from the input buffer

            // Check if the user wants to continue
            if (!response.equalsIgnoreCase("yes")) {
                continueInput = false; // Exit the loop
            }
        }

        // Close the scanner
        scanner.close();
    }
}
