package Assignment;

public interface Stack {
	int length();   	  	  // 현재 스택에 저장된 개수를 리턴
	int capacity(); 		  // 현재 스택에 저장 가능한 개수 리턴
	String pop();  			  // 스택의 톱에 저장된 문자열을 리턴하고 스택에서 제거
	Boolean push(String val); // 스택에 새로운 문자열 입력
}
