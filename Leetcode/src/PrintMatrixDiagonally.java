
public class PrintMatrixDiagonally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m = {{ 1, 2, 3 },
		              {4, 5, 6 },
		              {7, 8, 9 }}; 
		int[] res = findDiagonalOrderUpToDown(m);
		for(int i:res)
			System.out.println(i);
	}
	
	static int[] findDiagonalOrderDownToUp(int[][] matrix)
	{
		int m = matrix.length;
		int n = matrix[0].length;
		int []res = new int[m*n];
		int c = 0;
		for(int k = 0; k <= m-1; k++)
		{
			int i = k;
			int j = 0;
			while(i >= 0)
			{
				res[c++] = matrix[i][j];				
				i = i-1;
				j = j+1;
			}
		}
		
		for(int k = 1; k <= n-1; k++)
		{
			int i = m-1;
			int j = k;
			while(j <= n-1)
			{
				res[c++] = matrix[i][j];
				i = i-1;
				j = j+1;
			}
		}
		
		return res;
	}

	static int[] findDiagonalOrderUpToDown(int[][] matrix)
	{
		int m = matrix.length;
		int n = matrix[0].length;
		int[] res = new int[m * n];
		int c = 0;
		
		for(int k = 0 ; k <= n-1; k++)
		{
			int i = 0;
			int j = k;
			while(j >= 0)
			{
				res[c++] = matrix[i][j];
				i = i+1;
				j = j-1;
			}
		}
		
		for(int k = 1; k <= m-1; k++)
		{
			int i = k;
			int j = n-1;
			while(i <= m-1)
			{
				res[c++] = matrix[i][j];
				i = i +1;
				j = j -1;
			}
		}
		
		
		return res;
	}
}


