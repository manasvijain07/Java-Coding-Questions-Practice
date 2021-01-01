
public class InsertionSort {
	
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
	
	public void insertionSort(int[] a)
	{
		for(int i = 1; i < a.length ; i++)
		{
			int key = a[i];
			int j;
			for(j = i-1; j >=0 && key < a[j] ; j--)
			{
				a[j+1] = a[j];
			}
			a[j+1] = key;
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
		
		InsertionSort b = new InsertionSort();
		b.print(a);
		
		b.insertionSort(a);
		b.print(a);
	}

}
