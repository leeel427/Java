package kr.ac.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputstreamTest02 {

	public static void main(String[] args) {
		
		int i;
		try (FileInputStream fis = new FileInputStream("input.txt")){
		
			while ((i = fis.read()) != -1) {
				System.out.print((char)(i));
			}
				
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} 
		
		
		System.out.println("end");

	}

}
