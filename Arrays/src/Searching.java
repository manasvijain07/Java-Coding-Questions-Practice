
public class Searching {
	
	//TC - O(n) SC - O(1)
	public void linearSearch(int []a, int val)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == val)
			{
				System.out.println("Value found at index : "+i);
				return;
			}
		}
		System.out.println("Value not found");
		
	}
	
	//TC - O(log n) SC - O(1)
	//Imp condition - Array needs to be sorted
	public void binarySearch(int []a, int val, int start, int end)
	{
		if(a.length == 0 || start > end)
		{
			System.out.println("Value not found");
			return;
		}
		int mid = start + (end - start)/2;
		
		if(a[mid] == val)
		{
			System.out.println("Value found at index: "+mid);
			return;
		}
		if(val < a[mid])
		{
			binarySearch(a, val, start, mid-1);
		}
		else
		{
			binarySearch(a, val, mid+1, end);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] a = new int[n];
		
		for(int i = 0 ; i < 5; i++)
		{
			a[i] = i+1;
		}
		Searching s = new Searching();
		s.linearSearch(a, 2);
		
		s.binarySearch(a, 5, 0, a.length-1);
		
		s.binarySearch(a, 6, 0, a.length-1);
		
	}

}
