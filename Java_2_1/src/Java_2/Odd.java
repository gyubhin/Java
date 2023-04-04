//사용자로부터 양의 정수 10개를 입력받아 배열에 저장하고, 
//그 중에서 홀수가 몇 개인지 구하여 출력하는 프로그램을 작성하시오. 
//단, for-each문을 이용해야 합니다.

package Java_2;
import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Odd odd = new Odd();
		odd.pro5();
	}
	
	void pro5() {
		Scanner scanner = new Scanner(System.in);
		int intArray[];
		intArray = new int[10];
		
		for (int i = 0; i<10; i++) {
		System.out.println("양수를 입력해주세요.");
		int a  = scanner.nextInt();
		intArray[i] = a;
		}
		
		int count = 0;
		for (int od : intArray) {
			if(od%2 == 1) {
				count += 1;
			}
		}
		System.out.println(count);
	}
	

}
