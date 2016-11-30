
public class Multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		try
		{
	    arr[4]=10/07;
	    
	    System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter the correct index:");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("enter the valid numbers...");
		}
		catch(Exception a)
		{
			System.out.println("give the correct inputs..");
		}
	}

}
