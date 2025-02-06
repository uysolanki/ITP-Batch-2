package javaday5;

public class CBRDemo {

	public static void main(String[] args) {
		Student s1=new Student(18,"Virat",true,78.5);
		System.out.println(s1.getSname());
		test(s1);
		System.out.println(s1.getSname());
		
		int a;

	}

	private static void test(Student stemp) {
		stemp.setSname("Kohli");
		int a;
	}

}
