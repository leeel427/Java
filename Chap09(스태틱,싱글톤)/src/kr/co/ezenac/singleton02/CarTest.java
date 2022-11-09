package kr.co.ezenac.singleton02;

//import org.graalvm.compiler.hotspot.replacements.arraycopy.PluginFactory_CheckcastArrayCopyCallNode;

public class CarTest {

	public static void main(String[] args) {
		CarFactory carfactory1 = CarFactory.getInstance();
		Car car1 = carfactory1.createCar();
		
		CarFactory carfactory2 = CarFactory.getInstance();
		Car car2 = carfactory2.createCar();
//		
//		CarFactory carfactory = CarFactory.getInstance();
//		Car car1 = carfactory.createCar();
//		Car car2 = carfactory.createCar();
//		
//		
		System.out.println(carfactory1.getInstance()+", "+car1.getCarNumber());
		System.out.println(carfactory2.getInstance()+", "+car2.getCarNumber());
		
	//	System.out.println(Car.serialNum);
		System.out.println();
		
		
		if (carfactory1.equals(carfactory2) ) {
			System.out.println("같은 공장 입니다.");
		}
		else {
			System.out.println("다른 공장 입니다.");
		}

	}

}
