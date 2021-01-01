
//Binary Search - Array should be sorted - TC - O(log n)

public class BinarySearch {
	
	int count = 5;
	
	public void print(int[] a)
	{
		System.out.println("Printing array elements - ");
		for(int i = 0; i < count; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
	}
	
	public int binarySearchRecursive(int[] a, int val, int start, int end)
	{
		if(a.length == 0 || start > end)
			return -1;
		
		int mid = start + (end- start)/2;
		if(val == a[mid])
			return mid;
		else if(a[mid] < val)
			return binarySearchRecursive(a, val, mid+1, end);
		else
			return binarySearchRecursive(a, val, start, mid-1);
		
	}
	

	public int binarySearchIterative(int[] a, int val)
	{
		if(a.length == 0)
			return -1;
		
		int start = 0;
		int end = a.length -1;
		
		while(start < end)
		{
			int mid = start + (end- start)/2;
			
			if(val == a[mid])
			{
				return mid;
			}
			else if(val > a[mid])
			{
				start = mid+1;
			}
			else
			{
				end = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String [] args)
	{
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			a[i] = i+1;
		}
		
		BinarySearch l = new BinarySearch();
		l.print(a);
		
		int val = l.binarySearchRecursive(a, 3, 0, a.length);
		if(val == -1)
			System.out.println("Value not found");
		else
			System.out.println(val);
		
		int val1 = l.binarySearchIterative(a, 31);
		if(val1 == -1)
			System.out.println("Value not found");
		else
			System.out.println(val1);
	}

}
