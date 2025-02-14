package javaday11array;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {10,50,20,40,30};
		int search=30;
		
//		int pos=0;
//		int flag=0;
//		for(int n:arr)										//n			search
//		{				     								//10		30
//			if(search==n)									//50
//			{												//20
//				flag=1;										//40
//				System.out.println("Found at Index "+pos);	//30
//				break;
//			}
//			pos++;
//		}
//		if(flag==0)
//		{
//				System.out.println("Not Found");
//		}
//		
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(search==arr[i])
			{
				System.out.println("Found at Index "+ i);
				break;
			}
		}
		if(i==arr.length)
			System.out.println("Not Found");
		
	}

}
