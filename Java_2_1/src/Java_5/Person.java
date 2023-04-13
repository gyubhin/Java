package Java_5;

import java.util.Scanner;

public class Person {
	private String name;
	private int[] number;

	public Person(String name) {
		// 매개변수 name을 Person의 멤버 변수 name 값으로 설정하고 number를 정수 세 개의 배열의 실체를 지정한다.
		this.number = new int[3];
		this.name = name;
	}

	public String toString() {
		return "[" + this.name + "]";
	}

	public void selectNumber() { // 랜덤하게 1부터 3까지의 정수 중 하나를 number[0] ~ [2]에 각각 저장하고 세 정수를 출력한다.
		for (int i = 0; i < 3; i++) {
			number[i] = (int) (Math.random() * 3 + 1);
			System.out.print(number[i] + " \n");
		}

	}

	public boolean checkWin() { // 세 정수가 모두 같으면 true 아니면 false를 리턴한다.
		if (number[0] == number[1] && number[1] == number[2])
			return true;
		else
			return false;
	}

	public boolean game() {
		Scanner sc = new Scanner(System.in);
		System.out.print(this.toString()); // 현재 Person 객체의 이름을 출력한다.
		String tstr = sc.nextLine();         // 사용자가 엔터키를 누른다.
		
		// 세 개의 랜덤 정수를 선택한다.
		this.selectNumber();
		
		// 이겼는지 체크해서 이겼으면 이 사람이 이겼다고 출력한 후 true를 리턴하고 졌으면 "아쉽습니다"라고 출력한 후 false를 리턴한다.
		if (this.checkWin()) {
			System.out.println(this.name+"님이 이겼습니다!!!");
			return true;
		}
		else {
			System.out.println("아쉽습니다.");
			return false;
		}
	}
}
