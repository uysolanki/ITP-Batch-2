package javaday17.collection;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int first=0;
		int last=arr.length;
		int search=46;   //Found
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(search==arr[mid])
			{
				System.out.println("Found");
				break;
			}
			else if(search>arr[mid])
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		
		if(first>last)
			System.out.println("Not Found");

	}

}
