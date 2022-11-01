package kr.co.ezenac.operator02;

public class PrintfTest {

	public static void main(String[] args) {
		String name = "Admiral Yi";
		int age =20;
		double height = 185.5;
		
		System.out.printf("%s의 나이는 %d이고, 키는 %f 입니다.\n",name, age, height);
		//%.xf 로 소수점 자리수를 제한할수 있다.
		System.out.printf("[%s]의 나이는 %d이고, 키는 %.2f 입니다.\n",name, age, height);

	}

}
