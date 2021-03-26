package sorting;

public class QuickSort {
	
	public void performQuickSort(int[] a, int start, int end)
	{
		if(start < end)
		{
			int partitionPoint = partition(a, start, end);
			performQuickSort(a, start, partitionPoint);
			performQuickSort(a, partitionPoint + 1, end);
		}
	}
	
	public int partition(int []a, int start, int end)
	{
		int pivot = start;
		int i = start, j = end;
		while(i < j)
		{
			while(a[i] <= a[pivot] && i < end)
			{
				i++;
			}
			
			while(a[j] > a[pivot])
			{
				j--;
			}
			
			if(i < j)
			{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[pivot];
		a[pivot] = a[j];
		a[j] = t;
		return j;
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
		
		QuickSort i = new QuickSort();
		i.print(a);
		i.performQuickSort(a, 0, a.length-1);
		System.out.println("After sorting - ");
		i.print(a);
	}
}

