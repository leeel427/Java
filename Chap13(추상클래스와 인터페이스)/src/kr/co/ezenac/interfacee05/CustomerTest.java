package kr.co.ezenac.interfacee05;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayWorld();
		customer.order();
		
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();

		Sell seller = customer;
		seller.sell();
		seller.order();
		

	}

}
