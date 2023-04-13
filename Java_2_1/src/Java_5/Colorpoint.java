package Java_5;

public class Colorpoint extends Point{
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Colorpoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public boolean equals(Object obj) {
		Colorpoint cp = (Colorpoint)obj;
		
		if (this.color.equals(cp.color) && super.getX()==cp.getX() && super.getY()==cp.getY()) {
			return true;
		}
		else 
			return false;	
	}
	
	public String toString(){
		return this.color + " (" + getX() +"," +getY() +")";
	}
	
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}

	public static void main(String [] args){
		Colorpoint cp = new Colorpoint (5,6,"blue");
		cp.set(10,20);
		cp.setColor("RED");
		
		Colorpoint cp1 = new Colorpoint (10,20,"RED");
		Colorpoint cp2 = new Colorpoint (13,23,"RED");
		
		if (cp.equals(cp1)) {
			System.out.println(cp1.toString());
		}
		if (cp.equals(cp2)) {
			System.out.println(cp2.toString());
		}		
		
		String str = cp.toString();
//		System.out.println(str);
	}

}