package Java_2;

import java.util.Scanner;

public class Sum5 {

	public static void main(String[] args) {
		Sum5 sum = new Sum5();
		sum.pro2();
	}

	void pro2() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요.");
			int k = scanner.nextInt();
			sum += k;
		}
		System.out.println(sum);
	}
}