package kr.ac.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputstreamTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		int i;
		try {
			fis = new FileInputStream("input.txt");

			while ((i = fis.read()) != -1) {
				System.out.println((char)fis.read());
			}
					
//			System.out.println((char)fis.read());
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
					
				}
			}
		}
		
		
		System.out.println("end");

	}

}
