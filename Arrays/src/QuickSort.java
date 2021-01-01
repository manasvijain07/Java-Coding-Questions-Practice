import java.util.Random;

/*
 * TC - 
 * 	O(n log n) -average case
 * 	O(n^2) - worst case
 *  It is an in-place algo. SC - O(1)
 */
public class QuickSort {

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
	
	public void quickSort(int[] a, int start, int end)
	{
	
		if(start < end)
		{
			int pi = partition(a, start, end);
			quickSort(a, 0, pi - 1);
			quickSort(a, pi + 1, end);
		}
	}
	
	public int generateRandomPivot(int[] a, int start, int end)
	{
		Random rand = new Random();
		int pivot = rand.nextInt(end - start) + start;
		
		//setting pivot to start value
		int temp = a[start];
		a[start] = a[pivot];
		a[pivot] = temp;
		
		return start;
	}
	
	public int partition(int [] a, int start, int end)
	{
//		int pivot = start;		---> for taking start index as pivot
		
		//for generating random no as pivot 
		int pivot = generateRandomPivot(a, start, end);
		
		while(start <= end)
		{
			while(a[start] <= a[pivot])
			{
				start++;
			}
			
			while(a[end] > a[pivot])
			{
				end--;
			}
			
			if(start < end)
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		
		//swap pivot with end
		
		int temp = a[pivot];
		a[pivot] = a[end];
		a[end] = temp;
		
		return end;
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
		
		QuickSort b = new QuickSort();
		b.print(a);
		
		b.quickSort(a, 0, a.length-1);
		b.print(a);
	}

}
