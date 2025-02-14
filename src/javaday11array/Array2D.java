package javaday11array;

public class Array2D {

	public static void main(String[] args) {
		//int matrix[][]=new int[3][3];
		
		int matrix[][]= {{11,2,3},{45,5,16},{7,18,9,10}};
		System.out.println();
		
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
		
		for(int i=0;i<matrix.length;i++)
		{
			int max=matrix[i][0];
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]>max)
					max=matrix[i][j];
			}
			//System.out.println("Maximum number from row "+(i+1) + " is " +max);
			System.out.println(String.format("Maximum number from row %d is %d",test(),max));
		}
	}

	public static int test()
	{
		return 100;
	}
}
