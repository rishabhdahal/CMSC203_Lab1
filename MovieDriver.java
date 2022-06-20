// define package to integrate Movie.java
package store;

import java.util.Scanner;

// create public class
public class MovieDriver 
{
	public static void main (String[] args)
	{
		// define Scanner
		Scanner userInput = new Scanner (System.in);
		char choice = 'y';
		// Start while loop for continuous operation
		while (choice == 'y')
		{
			// define inputMovie in reference to Movie.java to process the date within both 
			Movie inputMovie = new Movie();
			// Ask user to input movie name
			System.out.println("Enter the name of a movie");
			// Receive the input
			String movieName = userInput.nextLine();
			// set the input as setTitle for the movie
			inputMovie.setTitle(movieName);
			// Ask user to input movie rating
			System.out.println("Enter the rating of the movie");
			// Receive the input
			String movieRating = userInput.nextLine();
			// set the input as setRating for the movie
			inputMovie.setRating(movieRating);
			// Ask user to input number of tickets sold
			System.out.println("Enter the number of tickets sold for this movie");
			// Receive the input
			int ticketsSold = userInput.nextInt();
			// set the input as setSoldTickets for the movie
			inputMovie.setSoldTickets(ticketsSold);
			// show the input data in the screen as specified in Movie.java file
			System.out.println(inputMovie.toString());
			// ask user whether or not to repeat process
			System.out.println("Do you want to enter another? (y or n)");
			// receive input from the user
			choice = userInput.next().charAt(0);
			userInput.nextLine();
		}
		System.out.println("Goodbye");
	}
}
