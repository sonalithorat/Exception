import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExc {  //using throws keyword

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:/Sonali/sonali.txt");
				
		
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.print((char)k);
		}

		fis.close();
	}

}
