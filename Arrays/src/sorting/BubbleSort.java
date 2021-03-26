package sorting;

// TC - Worst Case - O(n^2) 	Best Case - O(n)
// SC - O(1)		

public class BubbleSort {
	
	public void performBubbleSort(int []a)
	{
		if(a.length == 0 || a.length == 1)
			return;
		
		int n = a.length;
		
		// flag is to check if the array is already sorted - Best case. So in 1 pass 
		// we can figure it out and then we don't need to run other passes
		int flag;
		for(int i = 0; i < n-1; i++)		//n-1 as we will not be counting the last pass with one element left
		{
			flag = 0;
			for(int j = 0; j < n-i-1; j++)	//n-i-1 as we have already i sorted elements on right side
			{
				if(a[j] > a[j+1])
				{
					swap(a, j, j+1);
					flag = 1;
				}
			}
			if(flag == 0)
				return;
		}
	}
	
	
	public void print(int[] a)
	{
		for(int i : a)
		{
			System.out.print(i + " ");
		}
	}
	
	public void swap(int[] a, int i, int j)
	{
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = new int[6];
//		a[0] = 2;
//		a[1] = 7;
//		a[2] = 4;
//		a[3] = 1;
//		a[4] = 5;
//		a[5] = 3;
		
		for(int i = 0; i < 6; i++)
		{
			a[i] = i+1;
		}
		
		BubbleSort b = new BubbleSort();
		b.print(a);
		b.performBubbleSort(a);
		System.out.println("After sorting - ");
		b.print(a);
	}

}
