import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class UnionTwoArrays {
	
	// TC - O(N+M)	SC - O(N+M)
	public void union(int[] arr1, int[]arr2)
	{

        HashSet<Integer> hs = new HashSet<>();
 
        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);
        System.out.println(hs);
	}
	
	// TC - O(n logn + m log m)	 SC - O(n+m)
	// If array os already sorted, it will take  TC - O(n+m)	SC - O(1)
	public int[] unionWithSortAndSet(int []a, int[]b)
	{ 
		Arrays.sort(a);
		Arrays.sort(b);
		Set<Integer> res = new HashSet<>();
		int i = 0, j = 0;
		
		while(i < a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
				res.add(a[i++]);
			} else
			{
				res.add(b[j++]);
			}
		}
		
		while(i < a.length)
		{
			res.add(a[i++]);
		}
		
		while(j < b.length)
		{
			res.add(b[j++]);
		}
		int[] arr = new int[res.size()];
		int k = 0;
		for(int val : res)
		{
			arr[k++] = val;
		}
		return arr;
	}

	public void print(int[] a)
	{
		for(int i : a)
		{
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7, 1, 5, 2, 3, 6};
		int[] b = {3, 8, 6, 20, 7};
		
		UnionTwoArrays u = new UnionTwoArrays();
//		int[] res = u.union(a, b);
		
		u.union(a, b);
	}

}
