
// Sort array - 0, 1, 1, 0, 2, 2, 1, 0, 2
// We will use 3 pointers - low, mid, high.

// TC - O(n)
public class SortArrayWithZeroesOnesTwos {
	
	public void sortingFunction(int[] a)
	{
		int low = 0, mid = 0, high = a.length-1;
		
		while(mid <= high)
		{
			switch(a[mid]) {
			case 0:
				if(a[mid] != a[low])
				{
					swap(a, mid, low);
				}
				low++;
				mid++;
				break;
			
			case 1: 
				mid++;
				break;
				
			case 2:
				if(a[mid] != a[high])
				{
					swap(a, mid, high);
				}
				high--;
			}
		}
	}
	
	public void swap(int[] a, int i, int j)
	{
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
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
			int []a = {0, 1, 1, 0, 2, 2, 1, 0, 2};
			SortArrayWithZeroesOnesTwos s = new SortArrayWithZeroesOnesTwos();
			s.print(a);
			s.sortingFunction(a);
			System.out.println("After soring -");
			s.print(a);
	}

}
