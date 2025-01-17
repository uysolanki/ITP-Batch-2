package day4;

public class CallByRefDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		System.out.println(arr[0]);    //10
		test(arr);					
		System.out.println(arr[0]);    //10
	}

	private static void test(int brr[]) {
		System.out.println(brr[0]);        //10
		brr[0]=99;
		System.out.println(brr[0]);       //99
	}
}
