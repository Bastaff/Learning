import java.util.Scanner;

public class SumOfDigitsInt {
	public static void main (String [] args) {
		 
		
		
		Scanner s = new Scanner(System.in);
		 int inNumber = s.nextInt();
		 int inDigit;
		 int sum = 0;
		 while (inNumber > 0) {
			 inDigit = inNumber % 10;
			
			 
			 inNumber /= 10;
			sum += inDigit;
		
	}
		
		 System.out.println(sum);

}
}