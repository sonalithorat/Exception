import java.util.Scanner;

public class UncheckedEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers:");
	try{
		
		int	num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int sum=num1/num2;
		System.out.println("addition is:"+sum);
	}catch(ArithmeticException a)
	{
		System.out.println("enter the vali numbers....");
	}
	}

}
