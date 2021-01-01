
public class LinearSearch {

	int count = 5;
	
	public void print(int[] a)
	{
		System.out.println("Printing array elements - ");
		for(int i = 0; i < count; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
	}
	
	public int linearSearch(int []a, int val)
	{
		if(a.length == 0)
			return -1;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i]== val)
				return i;
		}
		return -1;
	}
	
	public static void main(String [] args)
	{
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			a[i] = i+1;
		}
		
		LinearSearch l = new LinearSearch();
		l.print(a);
		
		int val = l.linearSearch(a, 6);
		if(val == -1)
			System.out.println("Value not found");
		else
			System.out.print(val);
	}
}
