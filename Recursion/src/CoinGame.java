
public class CoinGame {
	
	public int noOfCoinsCollected(int[] nums)
	{
		return getMaxNoOfCoins(nums, 0, nums.length - 1);
	}
	
	public int getMaxNoOfCoins(int[] nums, int start, int end)
	{
		if(start + 1 == end)
		{
			return Math.max(nums[start], nums[end]);
		}
		
		
		
		return Math.max(nums[start] + Math.min(getMaxNoOfCoins(nums, start + 2, end), getMaxNoOfCoins(nums, start + 1, end - 1)), 
						nums[end] + Math.min(getMaxNoOfCoins(nums, start + 1, end - 1), getMaxNoOfCoins(nums, start, end - 2)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 5, 7, 3, 2, 4};
		System.out.print(new CoinGame().noOfCoinsCollected(nums));
	}

}
