

public class ThrowTest {
	public void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("invalid age");
		}
		
		else 
		{
			System.out.println("welcome...");
		}
	}
 public static void main(String args[])
 {
	 ThrowTest test=new ThrowTest();
	 test.validate(19);
 }
}
