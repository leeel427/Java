package kr.ac.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionTest {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			 fis = new FileInputStream("ezen.txt");
	
		} catch (FileNotFoundException e) {
			
	//		e.printStackTrace();					// 디버그 모드에서 나오는 Stack, 예외사항 추적-빨간색으로 알려줌
			System.out.println(e.getMessage());		// 예외 메세지만 보여줌
			
		}
		finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다.");
		}
		
		System.out.println("여기도 항상 수행됩니다.");
		
	}

}
