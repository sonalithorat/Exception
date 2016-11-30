import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		try
		{
			System.out.println(s.nextInt());
		}catch(Exception e)
		{
			System.out.println("enter only integer value");
		}

	}

}
