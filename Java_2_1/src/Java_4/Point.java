package Java_4;

class Point {
	private int x, y;
	//멤버변수는 private으로 설정하고
	//set,get 등의 메소드 활용하여 값을 설정함.
	public Point(){ }
	public Point(int x, int y){ this.x = x; this.y = y; }
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	protected void move(int x, int y){ this.x = x; this.y = y; }
}