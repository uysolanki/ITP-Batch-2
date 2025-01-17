package day5;

public class FactorialRecursion {

	public static void main(String[] args) {
		int n=5;
		int result=factorial(n);
		System.out.println(result);

	}

	private static int factorial(int n) {
		if(n==0 || n==1)
		return 1;
		else
		return n*factorial(n-1);
	}

}
