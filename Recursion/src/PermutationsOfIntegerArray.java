// TC- O(n * n!)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PermutationsOfIntegerArray {
	
	public void backtrack(int n,
	        ArrayList<Integer> nums,
	        List<List<Integer>> output,
	        int first) {
		// if all integers are used up
		if (first == n)
		output.add(new ArrayList<Integer>(nums));
		for (int i = first; i < n; i++) {
		// place i-th integer first 
		// in the current permutation
			Collections.swap(nums, first, i);
			// use next integers to complete the permutations
			backtrack(n, nums, output, first + 1);
			// backtrack
			Collections.swap(nums, first, i);
		}
	}
	
	public List<List<Integer>> permute(int[] nums) {
		// init output list
		List<List<Integer>> output = new LinkedList();
		
		// convert nums into list since the output is a list of lists
		ArrayList<Integer> nums_lst = new ArrayList<Integer>();
		for (int num : nums)
		nums_lst.add(num);
		
		int n = nums.length;
		backtrack(n, nums_lst, output, 0);
		return output;
	}
		    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		PermutationsOfIntegerArray p = new PermutationsOfIntegerArray();
		
		List<List<Integer>> res = p.permute(nums);
		
		for(List<Integer> list: res)
		{
			for(Integer val : list)
			{
				System.out.print(val + ", ");
			}
			System.out.print("\n");
		}
	}

}
