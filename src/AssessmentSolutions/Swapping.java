package AssessmentSolutions;

public class Swapping {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Before A= "+a +"\t" +"B= "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After A= "+a +"\t" +"B= "+b);
	}

}
