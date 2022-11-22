package kr.co.ezenac.lambda06;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class TestBiConsumer {

	public static void main(String[] args) {
		
		List<Double> list = Arrays.asList(2.2, 3.3, 4.4);
		BiConsumer<Integer, Double> biConsumer = (index, input) ->
					System.out.println("두개의 입력값 처리 : " + input + " 인덱스 번호 : " + index);
		
		spend(list,biConsumer);
		
		

	}

	
	
		
	public static <T> void spend(List<T> inputs, BiConsumer<Integer, T> biconsumer) {
		for (int i=0; i<inputs.size(); i++) 
			biconsumer.accept(i, inputs.get(i));
	}
		
}
