package Java_4;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) { //생성자는 public으로, return 타입 없이
		super(x,y);
		this.color = color; //color는 요기 바로 위에 있어서 this 가능
	}
	public void setXY(int x, int y) {
		move(x,y);
//		super.x = x;  //만약 point의 x, y가 private이 아니었다면 이렇게 호출 가능
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() { //오버라이딩
		return this.color + "색 점의 좌표는 (" + super.getX() + "," + super.getY() + ")";
	}
}
