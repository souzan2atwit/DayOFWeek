import java.util.Scanner;

public class DayOfWeek {
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				// Ask the user for their favorite day of the week
				System.out.print("What is your favorite day of the week? ");
				String favoriteDay = scanner.nextLine();

				// Print a message with the user's favorite day
				System.out.println("Your favorite day of the week is: " + favoriteDay);
			}
	    }
}
