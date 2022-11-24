package kr.ac.ezenac.stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest02 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요.");
		System.out.println("입력 후 '끝'이라고 쓰세요.");
		
		int i;
		try {
	//			while ((i = System.in.read()) != '\n') {
				InputStreamReader isr = new InputStreamReader(System.in);
				while ((i = isr.read()) != '끝') {
					System.out.print((char)i);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
