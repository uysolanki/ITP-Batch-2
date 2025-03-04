package javaday17.collection;

public class ContainsDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum=190;
		//output the 2 numbers forming the sum;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			int num1=arr[i];     //num 1 = 10
			int num2=sum-num1;   //num 2 = 80
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==num2 && num1<num2)
				{
					System.out.println("[" +num1+ ","+ num2+"]");
					flag=1;
					break;
				}
			}	
		}
		if(flag==0)
			System.out.println("No Pair Found");
	}
}
