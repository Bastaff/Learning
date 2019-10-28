import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numberIn;
		boolean isValid; 


		isValid = false;
		do {
			numberIn = s.nextInt();

			if (numberIn >= 0 && numberIn <= 10) {
				isValid = true;
				System.out.println("You have entered " + numberIn);}
			
				else if(numberIn >= 90 && numberIn <= 100) {
				isValid = true;
				System.out.println("You have entered " + numberIn);
				}
			
			 else {
				System.out.println("Invalid input, try again..."); // Print error message and repeat
			}
		} while (!isValid);
		}
	}
