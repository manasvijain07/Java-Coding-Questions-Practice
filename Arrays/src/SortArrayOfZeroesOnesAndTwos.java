
//Sort an Array of 0's, 1's and 2's - TC - O(n)

public class SortArrayOfZeroesOnesAndTwos {
	
	public void print(int[] a)
	{
		System.out.println("Printing array elements - ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
	}
	
	public void sort(int []a)
	{
		int low = 0, mid = 0, high = a.length - 1;
		
		while(mid <= high)
		{
			switch(a[mid])
			{
				case 0 :
					if(a[low] != a[mid])
					{
						int temp = a[low];
						a[low] = a[mid];
						a[mid] = temp;
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
						int temp = a[high];
						a[high] = a[mid];
						a[mid] = temp;
					}
					high--;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,0,1,1,2,0,0,1,2,0,2,1};
		
		SortArrayOfZeroesOnesAndTwos s = new SortArrayOfZeroesOnesAndTwos();
		s.print(a);
		
		System.out.println("After sorting - ");
		s.sort(a);
		s.print(a);
	}
}
