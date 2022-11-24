package kr.ac.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTest {

	public static void main(String[] args) throws IOException {
		
			FileOutputStream fos = new FileOutputStream("inout.txt" , true);
			try (fos) {
				byte[] bs = new byte[26];
				byte data = 65;				//'A'의 아스키 코드 값, 'Z'는 90
				for (int i=0; i<bs.length; i++)
					bs[i] =data++;
				
				fos.write(bs); 				// 배열 한꺼번에 출력하기
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("출력이 완료되었습니다.");
		
			try(FileInputStream fis = new FileInputStream("inout.txt")) {
				
				byte[] bs = new byte[26];
				int i;
				while((i = fis.read(bs)) != -1) {
					for (byte b : bs) 
						System.out.print((char)b);
//					for (int k=0; k < i; k++)
//						System.out.print((char)bs[k]);				
						System.out.println(" : "+ i +" 바이트 읽음");
				}
													
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			System.out.println("end");
		

	}

}
