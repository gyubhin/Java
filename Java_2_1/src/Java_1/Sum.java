package Java_1;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요.: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = a+b;
		
		System.out.println(a+"+"+b+"="+sum);
		scanner.close();
	}

}
