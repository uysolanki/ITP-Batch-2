package AssessmentSolutions;

public class SOD {
public static void main(String[] args) {
	int n=10;
	int sum=0;
	int r;
	
	while(n>0)
	{
		r=n%10;
		sum+=r;
		n=n/10;
	}
	
	System.out.println(sum);
}
}
