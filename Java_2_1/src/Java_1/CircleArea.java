package Java_1;

public class CircleArea {

	public static void main(String[] args) {
//		final var PI  = 3.14; //var로해도 작동하네
		
		final double PI  = 3.14;
		double radius = 10.2;
		double circleArea = radius*radius*PI;
		
		System.out.println("반지름: "+radius+"cm");
		System.out.println("원의 넓이: "+circleArea+"cm^2");
	}

}
