package AssessmentSolutions;

public class Armstrong1to10000 {
public static void main(String[] args) {
	
	for(int i=1;i<=10000;i++)
	{
		if(Armstrong.checkArmstrong(i))
			System.out.println(i);
	}
	//2520
}
}
