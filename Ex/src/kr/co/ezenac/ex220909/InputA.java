package kr.co.ezenac.ex220909;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputA {
	
	public static void main(String[] args) throws IOException {
		
		try(FileInputStream fis = new FileInputStream("inputA.txt")) {
			int i;
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while (( i = br.read()) != -1) {
				System.out.print((char)i);
			}
			br.close();
			System.out.println();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		FileInputStream fInputStream = new FileInputStream("inputA.txt");
//		FileOutputStream fOutputStream = new FileOutputStream("inputB.txt");
		
		String str = "동해물과 백두산이 마르고";
		int result = 0;
		for ( int k=0; k<str.length(); k++) {
			if (str.charAt(k) == ' ') {
				result++;
			}
		}
		System.out.println("띄어쓰기 개수 " + result + " 개");
//		return result;
		
//		byte[] readByte = new byte[35];
//		int data = 0;		
//		while( ( data = fInputStream.read(readByte)) != -1) {
//			fOutputStream.write(readByte);
//			System.out.println("읽은 바이트 수 : " + data);
//		}
//		
//		fOutputStream.flush();
//		System.out.println("복사본 파일이 생성되었습니다.");
//		
//		fOutputStream.close();
//		fInputStream.close();
				

	}
	
}
