import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
	
	public int[] intersection(int[] a, int[]b)
	{
		ArrayList<Integer> al = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < a.length; i++)
			set.add(a[i]);
		
		for(int i = 0; i < b.length; i++)
		{
			if(set.contains(b[i]))
			{
				al.add(b[i]);
			}
		}
		int[] arr = new int[al.size()];
		int k = 0;
		for(int val : al)
		{
			arr[k++] = val;
		}
		return arr;
	}
	
	public int[] intersectionWithSortAndSet(int[] a, int[]b)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		
		Set<Integer> s = new HashSet<>();
		int i = 0, j = 0;
		while(i < a.length && j < b.length)
		{
			if(a[i] == a[j])
			{
				s.add(a[i]);
				i++;
				j++;
			}
			if(a[i] < a[j])
			{
				i++;
			} else
			{
				j++;
			}
		}
		int[] arr = new int[s.size()];
		int k = 0;
		for(int val : s)
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
		
		IntersectionTwoArrays i = new IntersectionTwoArrays();
		int[] res = i.intersection(a, b);
		i.print(res);
	}

}
