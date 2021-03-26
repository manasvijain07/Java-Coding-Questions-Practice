package sorting;

//TC - Worst Case - O(n^2)	Best Case - O(n)
// SC - O(1)

public class InsertionSort {
	
	public void performInsertionSort(int[] a)
	{
		int n = a.length;
		if(n <= 1)
			return;
		
		for(int i = 1; i < n; i++)
		{
			int key = a[i];
			int j;
			
			for(j = i-1; j >= 0 && a[j] > key; j--)
			{
				a[j+1] = a[j];
			}
			a[j+1] = key;
		}
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
		int []a = new int[6];
		a[0] = 2;
		a[1] = 7;
		a[2] = 4;
		a[3] = 1;
		a[4] = 5;
		a[5] = 3;
		
//		for(int i = 0; i < 6; i++)
//		{
//			a[i] = i+1;
//		}
		
		InsertionSort i = new InsertionSort();
		i.print(a);
		i.performInsertionSort(a);
		System.out.println("After sorting - ");
		i.print(a);
	}
}
