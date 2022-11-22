package kr.co.ezenac.stream.travel;

import java.util.ArrayList;
import java.util.List;

public class CustomorTest {

	public static void main(String[] args) {
		
		Customor customorL = new Customor("이순신", 40 , 100);
		Customor customorN = new Customor("나대용", 20 , 100);
		Customor customorG = new Customor("권율", 13 , 50);
		
		List<Customor> customorList = new ArrayList<>();
		customorList.add(customorL);
		customorList.add(customorN);
		customorList.add(customorG);
		
		System.out.println("=== 고객 명단 추가된 순서대로 출력 ===");
		
		customorList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customorList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 " + total +"입니다.");
		
		System.out.println("=== 20세 이상 고객 고객 명단 정렬하여 출력 ===");
		customorList.stream().filter(c-> c.getAge()>=20).map(c -> c.getName())
			.sorted().forEach(s -> System.out.println(s));
		
		

	}

}
