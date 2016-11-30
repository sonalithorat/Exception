import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws IOException {
		try(FileInputStream fis=new FileInputStream("C:/Sonali/sonali.txt"))
				{
				int k;
				while((k=fis.read())!=-1)
				{
					System.out.print((char)k);
				}
		}
		
		

	}

}
