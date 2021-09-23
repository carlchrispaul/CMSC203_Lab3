import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Movie m1 = new Movie();
		char choice = 'y';
		
		while(choice == 'y' || choice == 'Y') {
			System.out.println("Enter the name of the movie");
			m1.setTitle(scan.nextLine());
			System.out.println("Enter the rating of the movie");
			m1.setRating(scan.nextLine());
			System.out.println("Enter the number of tickets sold");
			m1.setSoldTickets(scan.nextInt());
			System.out.println(m1);
			System.out.println("Would you like to enter another movie? (y or n)");
			choice = scan.next().charAt(0);
			scan.nextLine();
		}
		System.out.println("Goodbye");
	}
}
