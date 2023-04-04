package Java_2;

import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biggest big = new Biggest();
		big.pro4();
	}

	void pro4() {
		Scanner scanner = new Scanner(System.in);
		int intArray[];
		intArray = new int[5];
		
		for (int i = 0; i<5; i++) {
		System.out.println("양수를 입력해주세요.");
		int a  = scanner.nextInt();
		intArray[i] = a;
		}
		
		for (int i = 0; i < 4; i++) {
			if (intArray[i]>intArray[i+1]) {
				intArray[i+1] = intArray[i];
			}
		}
//		System.out.println(intArray); => 이렇게 하면 레퍼런스 변수인 intArray를 출력. 안에 변수 값을 알고 싶다면 for문 이용하여 출력하기
		System.out.println(intArray[4]);
	}
}
