
// Find number of elements greater than given value in row & column wise Sorted Matrix
public class FindCountOfElementsGreaterThanGivenValue {
	
	// TC - O(n + m)	SC - O(1) 
	public int findCount(int [][]matrix, int val)
	{
		if(matrix.length == 0)
			return 0;
		
		int row = 0, col = matrix.length - 1, count = 0;
		int total_rows = matrix[0].length;
		
		while(row < total_rows && col >= 0)
		{
			if(matrix[row][col] >= val)
			{
				count = count + total_rows - row;
				col--;
			}
			else
			{
				row++;
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
		int val = 16;
		
		FindCountOfElementsGreaterThanGivenValue f = new FindCountOfElementsGreaterThanGivenValue();
		int res = f.findCount(matrix, val);
		System.out.print(res);
	}

}
