// input -   7, 1, 4, 8, 11, 2, 14, 3		(increasing subsequence - 7 -> 8 -> 11 -> 14 (total = 4)
//																	  1 -> 4 -> 8 -> 11 -> 14 (total = 5))
// steps -   1, 1, 2, 3, 4,  2,  5, 3 
// output -> 5

public class LongestIncreasingSubsequence {
	
	public int increasingSequence(int[] a)
	{
		int n = a.length;
		int[] result = new int[a.length];
		int max = 0;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 0; j < i ; j++)
			{
				if(a[i] > a[j] && result[j] + 1 > result[i])
				{
					result[i] = result[j] + 1;
				}
			}
		}
		
		for(int i : result)
		{
			max = Math.max(i, max);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7, 1, 4, 8, 11, 2, 14, 3};
		
		LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
		System.out.println(l.increasingSequence(a));
	}

}
