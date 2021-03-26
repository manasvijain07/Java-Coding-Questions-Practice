package sorting;

//TC - O(n^2)	SC - O(n)
public class SelectionSort {
	
	public void performSelectionSort(int[] a)
	{
		int n = a.length;
		if(n <= 1)
			return;
		
		for(int i = 0; i < n; i++)
		{
			int min = i;
			for(int j = i+1; j < n; j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			if(min != i)
			{
				int t = a[min];
				a[min] = a[i];
				a[i] = t;
			}
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
		
		SelectionSort i = new SelectionSort();
		i.print(a);
		i.performSelectionSort(a);
		System.out.println("After sorting - ");
		i.print(a);
	}
}
