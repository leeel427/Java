package kr.co.ezenac.ex;

import java.util.Objects;

public class EqualsHashcode {
	int num1 = 1;
	int num2 = 2;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(num1, num2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsHashcode other = (EqualsHashcode) obj;
		return num1 == other.num1 && num2 == other.num2;
	}
	
	private void name() {
		System.out.println();
	}
	
	
	
}
