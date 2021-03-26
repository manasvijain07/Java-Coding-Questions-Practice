import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;

// Eg - {12, 3, 5, 1, 9}	target = 6



public class PairWithSumExistsInArray {
	
	// TC - O(n^2)	 SC - O(1)
	public int[] getPairBruteForce(int []a, int target)
	{
		for(int i = 0; i <a.length-1; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] + a[j] == target)
				{
					return new int[] {a[i], a[j]};
				}
			}
		}
		return new int[0];
	}
	
	//TC - O(n log n)	SC - O(1)
	public int[] getPairBySorting(int[]a , int target)
	{
		Arrays.sort(a);
		
		int i = 0, j = a.length - 1;
		
		while(i < j)
		{
			if(a[i] + a[j] == target)
			{
				return new int[] {a[i], a[j]};
			}
			if(a[i] + a[j] < target)
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		return new int[0];
	}
	
	// TC - O(n) SC - O(n)
	public int[] getPairByHashMap(int[] a, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < a.length; i++)
		{
			map.put(a[i], i);
		}
		
		for(int i = 0; i < a.length; i++)
		{
			int val = target - a[i];
			if(map.containsKey(val) && map.get(val) != i)
			{
				return new int[] {a[i], val};
			}
		}
		return new int[0];
	}
	
	public int[] getPairByHashSet(int[] a, int target)
	{
		HashSet<Integer> set = new HashSet<>();
		
		for(int i: a)
		{
			int val = target - i;
			if(set.contains(val))
			{
				return new int[] {i, val};
			} else
			{
				set.add(i);
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = {12, 3, 3, 1, 5};
			int target = 16;
			
			PairWithSumExistsInArray p = new PairWithSumExistsInArray();
//			int[] res = p.getPairBruteForce(a, target);
//			int[] res = p.getPairBySorting(a, target);
//			int[] res = p.getPairByHashMap(a, target);
			int[] res = p.getPairByHashSet(a, target);
			if(res.length > 0)
				System.out.print("Pair is --> "+res[0] + " and "+ res[1]);
			else
				System.out.print("No such pair exists");
	}

}
