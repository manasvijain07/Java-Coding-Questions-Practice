
// TC - O(n logn) SC - O(n)
public class MergeSort {

	int count = 6;
	
	public void print(int[] a)
	{
		System.out.println("Printing array elements - ");
		for(int i = 0; i < count; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
	}
	
	public void mergeSort(int []a, int start, int end)
	{
		if(start != end)
		{
			int mid = start + (end - start)/2;
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			merge(a, start, mid, end);
		}
		
	}
	
	public void merge(int[] a, int start, int mid, int end)
	{
		int[] res = new int[end - start + 1];
		int i = start, j = mid + 1, k = 0;
		
		while(i <= mid && j <= end)
		{
			if(a[i] < a[j])
			{
				res[k++] = a[i++];
			}
			
			else
			{
				res[k++] = a[j++];
			}
		}
		
		while(i <= mid)
		{
			res[k++] = a[i++];
		}
		
		while(j <= end)
		{
			res[k++] = a[j++];
		}
		
		for(int l = start; l <= end ; l++)
		{
			a[l] = res[l - start];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[6];
		a[0] = 50;
		a[1] = 20;
		a[2] = 45;
		a[3] = 10;
		a[4] = 90;
		a[5] = 12;
		
		MergeSort b = new MergeSort();
		b.print(a);
		
		b.mergeSort(a, 0, a.length-1);
		b.print(a);
	}

}
