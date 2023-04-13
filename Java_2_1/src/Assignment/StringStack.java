package Assignment;
import java.util.Scanner;

public class StringStack implements Stack {

	int top, maxoftop;
	String[] item;

	public StringStack(int size) {
		item = new String[size];
		top = -1;					 //아무것도 추가하지 않으면 인덱스:-1
		maxoftop = size;
	}

	public int length() {            //스택에 저장된 문자열 개수
		return top + 1;
	}

	public int capacity() {         //스택에 저장 가능한 개수
		return maxoftop;
	}

	public String pop() {          //문자열에 아무것도 저장되어 있지 않으면 리턴 null  
		if (top == -1) {           //저장되어 있다면 하나씩 출력
			return null;
		}
		String str = item[top--];
		return str;

	}

	public Boolean push(String val) {  //문자열 저장하기
		if (top == maxoftop - 1) {
			return false;
		}
		item[++top] = val;
		return true;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력>> ");
		int size = scanner.nextInt();
		StringStack stringstack = new StringStack(size);

		while (true) {
			System.out.print("문자열 입력 >>> ");
			String input = scanner.next();

			if (input.equals("그만")) {
				break;
			}

			while (!stringstack.push(input)) {
				System.out.println("스택이 꽉 차서 푸시 불가");
				break;
			}
		}

		System.out.print("스택에 저장된 모든 문자열 팝: ");
		while(stringstack.length()>0) {                  //문자열의 개수가 0 초과인동안 계속 pop 메소드로 출력
			System.out.print(stringstack.pop() + " ");
		}
		scanner.close();

	}
}
