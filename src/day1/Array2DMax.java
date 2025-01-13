package day1;

public class Array2DMax {

	public static void main(String[] args) {
		int matrix[][]={{10,20,30},{40,50,60},{70,80,90},{10,20,30}};
		
		int max=matrix[0][0];
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]>max)
				{
					max=matrix[i][j];
				}
			}
		}
		
		System.out.println(max);
	}

}
//Row 1 max number is 30
//Row 2 max number is 60
//Row 3 max number is 90
//Row 4 max number is 30