// Find element in row & column wise Sorted Matrix


public class FindValInSortedMatrix {
	
	// TC - O(n ^ 2) or O(n * m) where n = size of row and m - size of column 		SC - O(1)
	public int[] findValBruteForce(int[][] matrix, int val)
	{
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[0].length; j++)
			{
				if(matrix[i][j] == val)
					return new int[] {i, j};
			}
		}
		return new int[]{-1, -1};
	}
	
	// TC - O(n + m) as we are not accessing all elements or O(n) if size of row = size of col	  SC- O(1)
	public int[] findValOptimized(int [][] matrix, int val)
	{
		if(matrix.length == 0)
		{
			System.out.print("Matrix is blank");
			return new int[] {-1, -1};
		}
		int row = 0;
		int col = matrix[0].length - 1;
		
		while(row < matrix.length && col >= 0)
		{
			int current_val = matrix[row][col];
			if(current_val == val)
				return new int[] {row, col};
			
			if(val < current_val)
			{
				col--;
			}
			else
			{
				row++;
			}
		}
		return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{2, 7, 15},
				{4, 9, 19},
				{6, 10, 24}
		};
		int val = 15;
		
		FindValInSortedMatrix f = new FindValInSortedMatrix();
		int[] res = f.findValOptimized(matrix, val);
		System.out.print(res[0] + ", " + res[1]);
	}

}
