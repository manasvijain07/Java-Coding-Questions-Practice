
// TC - O(n+m) 	SC - O(n+m)

public class MergeTwoSortedArrays {
	
	public int[] merge(int[] a, int[] b)
	{
		int[] res = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		
		while(i < a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
				res[k++] = a[i++];
			} else
			{
				res[k++] = b[j++];
			}
		}
		
		while(i < a.length)
		{
			res[k++] = a[i++];
		}
		
		while(j < b.length)
		{
			res[k++] = b[j++];
		}
		return res;
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
		int[] a = {2, 3, 4, 7, 8};
		int[] b = {1, 5, 10};
		MergeTwoSortedArrays m = new MergeTwoSortedArrays();
		int[] res = m.merge(a, b);
		m.print(res);
		
	}

}
