
// find Largest Contiguous Sum Subarray from an array and also return the indexes - TC- O(n)

public class LargestContiguousSumSubarray {
	
	public int findContiguousSum(int [] a)
	{
		int current_sum = a[0], max_sum = a[0];
		
		for(int i = 1; i < a.length; i++)
		{
			current_sum = Math.max(current_sum + a[i], a[i]);
			max_sum = Math.max(max_sum, current_sum);
		}
		return max_sum;
	}
	
	public void findContiguousSumWithIndexes(int [] a)
	{
		int current_sum = a[0], max_sum = a[0];
		int start = 0, end = 0, s = 0;
		
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > current_sum + a[i])
			{
				current_sum = a[i];
				s = i;
			}
			else
			{
				current_sum = current_sum + a[i];
			}
			
			if(current_sum > max_sum)
			{
				max_sum = current_sum;
				start = s;
				end = i;
			}
		}
		
		System.out.println("Max sum - "+ max_sum);
		System.out.print("Indexes are -> "+ start + " - " + end);
		
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-3, -4, 4, -1, -2, 1, 5, -3};
		
		LargestContiguousSumSubarray l = new LargestContiguousSumSubarray();
		System.out.println(l.findContiguousSum(a));
		
		l.findContiguousSumWithIndexes(a);
	}

}
