class InvalidAge extends Exception
{
	public InvalidAge(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
public class CustomExc {
	
	static void validate(int age) throws InvalidAge
	{
		if(age<18)
		{
			throw new InvalidAge("invalid age");
		}
		else
		{
			System.out.println("welcome user");
		}
	}

	public static void main(String[] args) throws InvalidAge {
		
		validate(46);

	}

}
