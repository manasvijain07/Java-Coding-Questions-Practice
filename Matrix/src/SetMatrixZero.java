import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Set Matrix Zeroes
 * 
 * 
 * Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.
 * 
 * Follow up:
 *  - A straight forward solution using O(mn) space is probably a bad idea.
 *  A simple improvement uses O(m + n) space, but still not the best solution.
 *  Could you devise a constant space solution?
 * 
 * 
 * Example 1- 
 * 
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * 
 * Example 2 -
 * 
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 * 
 * https://www.youtube.com/watch?v=pGVfd-t2Kpw
 * https://www.youtube.com/watch?v=M65xBewcqcI
 *
 */
public class SetMatrixZero {
	
	// TC - O(m * n)	SC - O(m + n)
public void setZeroesBruteForce(int[][] matrix) {
        
        int m = matrix.length, n = matrix[0].length;
        
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(rows.contains(i) || cols.contains(j))
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }

// TC - O(M * N)	SC - O(1)
		public void setZeroes(int[][] a) {
		    
		    int m = a.length, n = a[0].length;
		    
		    boolean isCol = false;
		    
		    for(int i = 0; i < m ; i++)
		    {
		        if(a[i][0] == 0)
		        {
		            isCol = true;
		        }
		    
		    
		        for(int j = 1; j < n; j++)
		        {
		            if(a[i][j] == 0)
		            {
		                a[i][0] = 0;
		                a[0][j] = 0;
		            }
		        }
		    }
		    
		    for(int i = 1; i < m; i++)
		    {
		        for(int j = 1; j < n; j++)
		        {
		            if(a[i][0] == 0 || a[0][j] == 0)
		            {
		                a[i][j] = 0;
		            }
		        }
		    }
		    
		    if(a[0][0] == 0)
		    {
		        for(int j = 0 ; j < n; j++)
		        {
		            a[0][j] = 0;
		        }
		    }
		    
		    if(isCol)
		    {
		        for(int i = 0; i < m; i++)
		        {
		            a[i][0] = 0;
		        }
		    }
		} 
			 
	 public void display(int[][] matrix)
	 {
		for(int[] row: matrix)
		{
			for(int i: row)
			{
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] matrix = {
					{1, 1, 1},
					{1, 0, 1}, 
					{1, 1, 1}
			};
			
			
			SetMatrixZero s = new SetMatrixZero();
			System.out.println("Before updation - ");
			s.display(matrix);
			System.out.println("\nAfter updation - ");
			s.setZeroesBruteForce(matrix);
			
			
	}

}

