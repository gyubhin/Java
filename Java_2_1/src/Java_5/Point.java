package Java_5;

public class Point {
	
	private int x, y;
	
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}

	public Point(){ }
	public Point(int x, int y){ this.x = x; this.y = y; }
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	protected void move(int x, int y){ this.x = x; this.y = y; }
}
