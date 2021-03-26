package Arrays_Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	public List<Integer> spiralOrder(int[][] a) {
	       List<Integer> res = new ArrayList<>();
	       
	        int m = a.length-1, n = a[0].length-1;
	        int top = 0, bottom = m, left = 0, right = n;
	        
	        while(top <= bottom && left <= right)
	        {
		        for(int i = left; i <= right; i++)
		        {
		            res.add(a[top][i]);
		        }
		        top++;
		        
		        for(int i = top; i <= bottom; i++)
		        {
		            res.add(a[i][right]);
		        }
		        right--;
		        
		        for(int i = right; i >= left; i--)
		        {
		            res.add(a[bottom][i]);
		        }
		        bottom--;
		        
		        for(int i = bottom; i >= top; i--)
		        {
		        	res.add(a[i][left]);
		        }
		        left++;
			}
	        return res;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3, 4},{5,6, 7, 8},{9, 10, 11, 12}};
		
		SpiralMatrix s = new SpiralMatrix();
		List<Integer> res = s.spiralOrder(matrix);
		System.out.print(res);
	}

}
