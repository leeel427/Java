package kr.ac.ezenac.exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class clazz = Class.forName(className);
		return clazz;
						
	}
	
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();				//개발시 참고 개발 끝나고 안보이게 해주는게 좋음
			System.out.println("FileNotFoundException : " + e.getMessage());
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("ClassNotFoundException : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
		
	
		
	}
	
}
