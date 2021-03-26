package sorting;

// TC - O(n log n)	SC - O(n)

public class MergeSort {
	
	public void performMergeSort(int[] a, int start, int end)
	{
		if(start != end)
		{
			int mid = start + (end - start)/2;
			performMergeSort(a, start, mid);
			performMergeSort(a, mid+1, end);
			merge(a, start, mid, end);
		}
		
	}
	
	public void merge(int[] a, int start, int mid, int end)
	{
		int[] result = new int[end - start + 1];
		int i = start, j = mid+1, k = 0;
		
		while(i <= mid && j <= end)
		{
			if(a[i] < a[j])
			{
				result[k++] = a[i++];
			}
			
			else
			{
				result[k++] = a[j++];
			}
		}
		
		while(i <= mid)
		{
			result[k++] = a[i++];
		}
		
		while(j <= end)
		{
			result[k++] = a[j++];
		}


		for(int l = start; l <= end; l++)
		{
			a[l] = result[l - start];
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
		
		MergeSort i = new MergeSort();
		i.print(a);
		i.performMergeSort(a, 0, a.length-1);
		System.out.println("After sorting - ");
		i.print(a);
	}
}
