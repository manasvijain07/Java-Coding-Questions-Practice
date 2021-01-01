
// TC - O(n^2)
public class BubbleSort {

	
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
	
	public void bubbleSort(int []a)
	{
		if(a.length == 0 || a.length == 1)
			return ;
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length - i - 1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
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
		
		BubbleSort b = new BubbleSort();
		b.print(a);
		
		b.bubbleSort(a);
		b.print(a);
		
	}

}
