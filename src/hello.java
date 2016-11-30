
public class hello {
	static int total=0;
	public static int sum(int i)
	{
		return total=total+i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			int add=sum(i);
			System.out.println(add);
		}
		
	}

}
