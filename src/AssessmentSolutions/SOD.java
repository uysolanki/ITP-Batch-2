package AssessmentSolutions;

public class SOD {
public static void main(String[] args) {
	int n=7777;
	int sum;
	int r;
	while(n>9)
	{
		sum=0;
		while(n>0)
		{
		r=n%10;
		sum+=r;
		n=n/10;
		}
		n=sum;
	}
	System.out.println(n);
}
}
