package kr.co.ezenac.inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw();
		
		System.out.println();
		
		Circle circle2 = new Circle(new Point(150, 150), 500);
		circle2.draw();
		
		System.out.println();
		
		Triangle triangle = new Triangle();
		triangle.draw();
		
		System.out.println();
		
		Triangle triangle2 = new Triangle(new Point(0, 0), new Point(20, 0), new Point(0, 20));
		triangle2.draw();
		
		System.out.println();
		// 부모 클래스의 point array
		Triangle triangle3 = new Triangle();
		triangle3.draw();
		
		System.out.println();
		
		// 현재 클래스(내 클래스)에서 따로 생성한 point
		Point[] points = new Point[] {new Point(10,10), new Point(80,100), new Point(20,120)};
		
		Triangle triangle4 = new Triangle(points);
		triangle4.draw();
		
		System.out.println();
		
	
	}

}
