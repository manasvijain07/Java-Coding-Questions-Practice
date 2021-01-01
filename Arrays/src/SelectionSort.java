
public class SelectionSort {
	
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
	
	public void selectionSort(int[] a)
	{
		for(int i = 0; i < a.length-1; i++)
		{
			int min = i;
			
			for(int j = i+1; j < a.length; j++)
			{
				if(a[min] > a[j])
				{
					min = j;
				}
			}
			
			if(min != i)
			{
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
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
		
		SelectionSort b = new SelectionSort();
		b.print(a);
		
		b.selectionSort(a);
		b.print(a);
	}

}
