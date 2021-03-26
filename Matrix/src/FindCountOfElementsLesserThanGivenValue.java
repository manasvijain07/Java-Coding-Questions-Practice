
//Find number of elements lesser than or equal to given value in Sorted Matrix


public class FindCountOfElementsLesserThanGivenValue {
	
	// TC - O(n ^ 2) or O(n * m) where n = size of row and m - size of column 		SC - O(1)
	public int findCountBruteForce(int[][] matrix, int val)
	{
		int count = 0;
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[0].length; j++)
			{
				if(matrix[i][j] <= val)
					count++;
			}
		}
		return count;
	}
	
	// TC - O(n + m)	SC - O(1) 
	public int findCount(int[][]matrix, int val)
	{
		if(matrix.length == 0)
			return -1;
		int row = 0, col = matrix[0].length-1, count = 0;
		
		while(row < matrix.length && col >= 0)
		{
			if(matrix[row][col] <= val)
			{
				count = count + col + 1;
				row++;
			} 
			else
			{
				col--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{2, 7, 15},
				{4, 9, 19},
				{6, 10, 24}
		};
		int val = 8;
		
		FindCountOfElementsLesserThanGivenValue f = new FindCountOfElementsLesserThanGivenValue();
		int res = f.findCount(matrix, val);
		System.out.print(res);
	}

}
