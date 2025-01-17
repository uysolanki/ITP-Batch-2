package day5;

public class RecursionDemo {

	public static void main(String[] args) {
		int n=3;
		int result=sum(n);
		System.out.println(result);

	}

	private static int sum(int n) {
		if(n==1)
			return 1;
		else
			return n+sum(n-1);
	}

}
