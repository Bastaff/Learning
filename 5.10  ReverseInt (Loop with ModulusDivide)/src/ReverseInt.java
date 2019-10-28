import java.util.Scanner;

public class ReverseInt {
 public static void main (String[] args){

	 Scanner s = new Scanner(System.in);
	 int inNumber = s.nextInt();
	 int inDigit;
	 
	 while (inNumber > 0) {
		 inDigit = inNumber % 10;
		 
		 System.out.print(inDigit);
		 
		 inNumber /= 10;
		 
	 }
	 
 }
}
