package Java_1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("세 실수를 입력하세요. ");
		float a= scanner.nextFloat();
		float b= scanner.nextFloat();
		float c= scanner.nextFloat();
		
		float sum = a+b+c;
		float avr = (a+b+c)/3;
		System.out.printf("합계는 %.2f이고 평균은 %.2f이다.",sum,avr);
	}

}
