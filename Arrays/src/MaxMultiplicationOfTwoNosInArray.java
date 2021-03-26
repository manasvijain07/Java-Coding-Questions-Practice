import java.util.Arrays;

public class MaxMultiplicationOfTwoNosInArray {
	
	// TC - O(n^2)	SC - O(1)
	public int getMaxProductBruteForce(int[] a)
	{
		int max_prod = 1;
		
		for(int i = 0; i < a.length-1; i++)
		{
			for(int j = i+1; j < a.length;j++)
			{
				if(a[i] * a[j] > max_prod)
				{
					max_prod = a[i] * a[j];
				}
			}
		}
		return max_prod;
	}
	
	public int getMaxProductSorting(int[] a)
	{
		if(a.length <= 1)
			return -1;
		Arrays.sort(a);
		int max1 = a[a.length-1] * a[a.length-2];
		int max2 = a[0] * a[1];
		return Math.max(max1, max2);
	}
	
	public int getMaxProductOptimized(int[] a)
	{
		if(a.length <= 1)
			return -1;
		
		if(a.length == 2)
			return a[0] * a[1];
		
		int max1 = a[0] > a[1] ? a[0]: a[1];
		int sec_max = a[1] < a[0]? a[1] : a[0];
		int min = a[0] < a[1]? a[0] : a[1];
		int sec_min = a[0] > a[1]? a[1]: a[0];
		
		for(int i = 2; i < a.length; i++)
		{
			if(a[i] > max1)
			{
				sec_max = max1;
				max1 = a[i];
			} else if(a[i] > sec_max)
			{
				sec_max = a[i];
			} 
			
			if(a[i] < min)
			{
				sec_min = min;
				min = a[i];
			} else if(a[i] < sec_min)
			{
				sec_min = a[i];
			}
		}
		return Math.max(max1 * sec_max, min * sec_min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = {4, 1, -2, -7, 3};
			
			MaxMultiplicationOfTwoNosInArray m = new MaxMultiplicationOfTwoNosInArray();
			System.out.println(m.getMaxProductBruteForce(a));
			System.out.println(m.getMaxProductSorting(a));
			System.out.println(m.getMaxProductBruteForce(a));
	}

}
