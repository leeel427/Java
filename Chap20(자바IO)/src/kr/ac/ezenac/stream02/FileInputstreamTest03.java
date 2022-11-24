package kr.ac.ezenac.stream02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputstreamTest03 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10];
			int i;
			
//			while((i = fis.read(bs)) != -1) {
//  //				for (byte b : bs) 
//	//				System.out.print((char)b);		//배열에 따라 버퍼에 기존 데이터가 남음
//				
//				for (int k=0; k < i; k++)
//					System.out.print((char)bs[k]);				
//					System.out.println(" : "+ i +" 바이트 읽음");
//			}
					
			while( (i=fis.read(bs, 1, 9)) != -1 ) {
				for(int k=0; k<i; k++)
					System.out.print((char)bs[k]);
				System.out.println(" : "+ i +" 바이트 읽음");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println("end");
		
	}

}
