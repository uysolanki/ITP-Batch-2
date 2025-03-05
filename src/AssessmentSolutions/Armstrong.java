package AssessmentSolutions;

public class Armstrong {
public static void main(String[] args) {
	int n=7777;
	boolean result=checkArmstrong(n);
	if(result)
		System.out.println("Armstrong");
	else
		System.out.println("Not Armstrong");
	
}

public static boolean checkArmstrong(int n) {
	int raiseTo=Integer.toString(n).length();
	int bu=n;
	int r,sum=0;
	while(n>0)
	{
	r=n%10;
	sum+=Math.pow(r, raiseTo);
	n=n/10;
	}
	if(bu==sum)
		return true;
	else
		return false;
}


}
