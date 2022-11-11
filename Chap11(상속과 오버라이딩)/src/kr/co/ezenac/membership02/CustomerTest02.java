package kr.co.ezenac.membership02;

public class CustomerTest02 {

	public static void main(String[] args) {
		Customer customerL = new Customer(2022, "이순신");
		customerL.bonusPoint = 1000;
		int priceL = customerL.calcPrice(10000);
		System.out.println(customerL.showInfo() + "지불 금액은 " + priceL+ " 원 입니다.");
		
		System.out.println();

		
		Customer customerS = new VIPCustomer(2023, "신사임당");
		customerS.bonusPoint = 10000;
		int priceS = customerS.calcPrice(10000);
		System.out.println(customerS.showInfo() + "지불 금액은 " + priceS+ " 원 입니다.");
	
		System.out.println();

		
		Customer customerL2 = new VIPCustomer(2024, "이방원");
		customerL2.bonusPoint = 10000;
		
		System.out.println(customerL2.showInfo());
		
		System.out.println();
		
		
	}

}
