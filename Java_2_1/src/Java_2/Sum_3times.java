package Java_2;

public class Sum_3times {

	public static void main(String[] args) {
		Sum_3times summ = new Sum_3times();
		summ.pro3();

	}
	
	void pro3() {
		int sum = 0;
		
		for (int i = 1; i<100; i++) {
			if (i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
