
public class SubArrayWhoseSumIsEqualToGivenSum {
	
	public int[] getSubarrayWithTargetSum(int[] a, int target)
	{
		if(a.length == 1 && target == a[0])
			return new int[] {0, 0};
		int i = 0, j = 0;
		int current_sum = 0;
		
		while(j < a.length)
		{
			if(a[j] == target)
			{
				return new int[] {j, j};
			}
			current_sum += a[j]; 
			if(current_sum == target)
			{
				return new int[] {i, j};
			} 
			else if(current_sum < target)
			{
				
				j++;
			} else
			{
				current_sum -= a[i];
				i++;
				j++;
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 2, -2, -20, 10};
		int sum = -10;
		
		SubArrayWhoseSumIsEqualToGivenSum s = new SubArrayWhoseSumIsEqualToGivenSum();
		int[] res = s.getSubarrayWithTargetSum(a, sum);
		
		if(res.length == 0)
		{
			System.out.print("No such subarray found");
		} 
		else 
		{
			System.out.print("Indexes are : "+ res[0] +" to "+ res[1]);
		}
	}
}

