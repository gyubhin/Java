package Java_4;

public class Week5_main {

	public static void main(String[] args) {
		// 첫 번쨰 문제를 위한 부분(colorPoint 문제)
		ColorPoint cp = new ColorPoint(5, 5, "Yellow"); //노랑 5,5 점의 실체를 만든다.
		cp.setXY(10, 20);  //리턴 타입 없으니 void로 받기(컬러포인트에서)
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");

		
		
		// 두 번쨰 문제를 위한 부분(3D)
//		Point3D p = new Point3D(1, 2, 3); // 1, 2, 3은 x, y, z축의 값
//		System.out.println(p.toString() + "입니다.");
//
//		p.moveUp(); // z축으로 위로 1만큼 이동
//		System.out.println(p.toString() + "입니다.");
//
//		p.moveDown(); // z축으로 아래로 1만큼 이동
//		p.move(10, 10); // x, y축 좌표를 (10, 10)으로 이동
//		System.out.println(p.toString() + "입니다.");
//
//		p.move(100, 200, 300); // x, y, z축 좌표를 (100, 200, 300)으로 이동
//		System.out.println(p.toString() + "입니다.");
	}

}
