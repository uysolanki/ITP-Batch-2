package javaday13EH;

public class Test {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50};
		int search=50;
		
		int index=linearSearch(arr,search);

		System.out.println(index==-1?"Number Not Found":"Number Found at Index "+index);

	}

	private static int linearSearch(int[] arr, int search) {
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)		//i=0		aar[0] =10     10==20
			return i;				//i=1       arr[1]= 20     20==20
		}
			
		return -1;
	}

}
