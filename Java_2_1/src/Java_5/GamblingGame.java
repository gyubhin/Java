package Java_5;
import java.util.Scanner;

public class GamblingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamblingGame gg = new GamblingGame();
		gg.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 선수 이름>> ");
		String fstr = sc.next();
		System.out.print("2번째 선수 이름 >> ");
		String sstr = sc.next();
		
		Person p1 = new Person(fstr);
		Person p2 = new Person(sstr);
		
		// p1과 p2가 번갈아서 게임을 하다가 누군가가 이기면 전체 게임을 멈춘다.
		while (!(p1.game()||p2.game())) {
			p1.game();
			p2.game();
			
		}


	}

}
