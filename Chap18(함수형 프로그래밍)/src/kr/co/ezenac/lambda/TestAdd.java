package kr.co.ezenac.lambda;

public class TestAdd {

	public static void main(String[] args) {
		
//		Add addf = (int x, int y) -> {return x+y;};
		
		Add addf = (x, y) -> x + y;
		
		System.out.println(addf.add(3, 5));

	}

}
