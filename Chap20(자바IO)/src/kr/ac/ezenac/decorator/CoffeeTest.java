package kr.ac.ezenac.decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee kenyaAmericano = new KenyaAmericano();
		kenyaAmericano.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(kenyaAmericano);
		kenyaLatte.brewing();
		System.out.println();
		
		Mocha kenyaMocha = new Mocha(new Latte(kenyaAmericano));
		kenyaMocha.brewing();
		System.out.println();
		
//		Coffee etiopiaAmericano = new EtiopiaAmericano();
//		WhippedCream etiopiaWhip = new WhippedCream(new Mocha(new Latte(etiopiaAmericano)));
//		etiopiaWhip.brewing();
//		System.out.println();					// 내가 한것
		
		WhippedCream etiopiaWhippedMocha =
				new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
		etiopiaWhippedMocha.brewing();
		System.out.println();
		

	}

}
