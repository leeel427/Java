package kr.co.ezenac.membership;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer(202208, "이순신");
		Customer customerS = new VIPCustomer(202209, "신사임당", 100);
		Customer customerL2 = new GOLDCustomer(202210, "이방원");
		Customer customerC = new GOLDCustomer(202211, "최영");
		Customer customerK = new VIPCustomer(202212, "김유신", 200);
		
		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerL2);
		customerList.add(customerC);
		customerList.add(customerK);
		
		System.out.println("===== 고객 정보 출력 =====");
			
		for (Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		System.out.println();
		System.out.println("===== 할인율 계산 =====");
		int price = 10000;
		
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +" 님이 " + cost +" 원 지불하셨습니다.");
		}
		
		System.out.println();
		System.out.println("===== 보너스 포인트 계산 =====");
	
		for (Customer customer : customerList) {
			customer.calcPrice(price);
			int bonus = customer.bonusPoint;
			System.out.println(customer.getCustomerName() +" 님의 포인트는 " + bonus +" 입니다.");
			System.out.println(customer.getCustomerName() +" 님의 포인트는 " + customer.bonusPoint +" 입니다.");
		}
		
		

	}

}
