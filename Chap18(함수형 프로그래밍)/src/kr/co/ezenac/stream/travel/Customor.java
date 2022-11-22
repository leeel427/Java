package kr.co.ezenac.stream.travel;

/*
 *  여행사 패키지 여행 상품이 있습니다.
 *  여행 비용은 15세 이상은 100만원, 그 미만은 50만원 입니다.
 *  고객 세명이 패키지 여행을 떠납니다.
 *  비용 계산과 고객 검색에 대한 연산을 스트림을 활용해서 구현 하시오 
 */


public class Customor {
	
	private String name;
	private int age;
	private int price;
	
	
	public Customor(String name, int age, int price) {
	//super();
	this.name = name;
	this.age = age;
	this.price = price;
}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	
	
	@Override
	public String toString() {
		return "Customor [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
	
	

}
