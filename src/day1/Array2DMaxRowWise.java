package day1;

public class Array2DMaxRowWise {

	public static void main(String[] args) {
		int matrix[][]={{10,20,30},{40,50,60},{70,80,90},{10,20,30}};
		
		int max;
		
		for(int i=0;i<matrix.length;i++)
		{
			max=matrix[i][0];
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]>max)
				{
					max=matrix[i][j];
				}
			}
			System.out.println(String.format("Row %d max number is %d",(i+1),max));
			//System.out.println("Row "+(i+1)+ "max number is "+max);
		}
		
		
	}

}
//Row 1 max number is 30
//Row 2 max number is 60
//Row 3 max number is 90
//Row 4 max number is 30