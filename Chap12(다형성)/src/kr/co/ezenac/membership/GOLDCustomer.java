package kr.co.ezenac.membership;

public class GOLDCustomer extends Customer {
	
	double salesRatio;
	
	public GOLDCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		salesRatio = 0.1;
		
		System.out.println("GOLDCostomer(int , String) 생성자 호출");
	}
		
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	
	}
	
		
}
