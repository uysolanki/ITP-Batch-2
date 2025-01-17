package day4;

public class FunctionCallDemo {

	public static void main(String[] args) {
		int n=5;
		prime(n);

	}

	private static void prime(int n) {
		System.out.println(display(n*n)+n);
		
	}

	private static int display(int k) {
		return k;
		
	}

}
