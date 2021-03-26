
public class PrintMatrixInSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = {{ 1, 2, 3 },
	              {4, 5, 6 },
	              {7, 8, 9 }}; 
	int[] res = spriralMatrix(m);
	for(int i:res)
		System.out.println(i);
	}
	
	static int[] spriralMatrix(int[][] matrix)
	{
		int m = matrix.length;
		int n = matrix[0].length;
		int[] res = new int[m * n];
		
		int row = 0, col = 0;
		for(int i = 0 ; i < res.length; i++)
		{
			res[i] = matrix[row][col];
			
			if(col < n-1) col++;
			else if(col == )
			
		}
		
		return res;
	}
}
