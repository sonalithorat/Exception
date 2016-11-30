import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class CheckedEx {  //using try catch block

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:/Sonali/sonali.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println("file is not exist");
			e.printStackTrace();
		}
		
		int k;
		try {
			while((k=fis.read())!=-1)
			{
				System.out.print((char)k);
			}
		} catch (IOException e) {
			System.out.println("input output error occured..");
			e.printStackTrace();
		}
		
		
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
