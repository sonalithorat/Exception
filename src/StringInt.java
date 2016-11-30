import java.util.InputMismatchException;
import java.util.Scanner;

public class StringInt {

	public static void main(String[] args) {
		String integerStr ="sonali";
		System.out.println("The string to scan integer from it is: " +integerStr);
		Scanner consoleScanner =new Scanner(integerStr);
		try {
		
			System.out.println("The integer value scanned from string is: " +consoleScanner.nextInt());
			
		}/**/
		catch(ArithmeticException e)
		{
			System.out.println("int value not present.");
			consoleScanner.close();
		}
		catch(InputMismatchException ime) {
		
			System.out.println("in this string integer value is not present");
		}
		

	}

}
