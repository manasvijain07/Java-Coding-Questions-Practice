
public class PrintDiagonalElementsMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = {{ 1, 2, 3 },
	              {4, 5, 6 },
	              {7, 8, 9 }}; 
	int[] res = diagonalElements(m);
	for(int i:res)
		System.out.println(i);
	}
	
	static int[] diagonalElements(int matrix[][])
	{
		int m = matrix.length;
		int n = matrix[0].length;
		int[] res = new int[m+n];
		int k = 0;
		
		for(int i = 0 ; i <= n-1; i++)
		{
			res[k++] = matrix[i][i];
		}
		
		int row = 0;
		int col = n-1;
		
		while(col >= 0 && row <= n-1)
			{
				if(row + col == m -1)
				{
					res[k++] = matrix[row][col];
				}
				row++;
				col--;
			}
		
		return res;
		
	}

}
