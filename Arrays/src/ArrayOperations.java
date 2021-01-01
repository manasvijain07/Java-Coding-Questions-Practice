
public class ArrayOperations {
	
	int count = 0;
	
	public void add(int[] a, int val)
	{

		a[count++] = val;
		
	}
	
	public void print(int[] a)
	{
		System.out.println("Printing array elements - ");
		for(int i = 0; i < count; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
	}
	
	public void insertAtIndex(int[]a, int val, int pos)
	{
		for(int i = count-1; i > pos; i--)
		{
			a[i] = a[i-1];
		}
		a[pos] = val;
	}
	
	public void deleteFromEnd(int[] a)
	{
		if(a.length <= 0)
			return;
		count--;
	}
	
	public void deleteValue(int[] a, int val)
	{
		int pos = 0;
		for(int i = 0; i < count; i++)
		{
			if(a[i] == val)
			{
				pos = i;
				break;
			}
		}
		
		for(int i = pos; i < count-1; i++)
		{
			a[i] = a[i+1];
		}
		count--;
	}
	
	public void deletedFromPosition(int[]a, int pos)
	{
		for(int i = pos; i < count; i++)
		{
			a[i] = a[i+1];
		}
		count--;
	}
	
	public static void main(String [] a)
	{
		int[] b = new int[5];
		ArrayOperations ao = new ArrayOperations();
		
		ao.add(b, 0);
		ao.add(b, 1);
		ao.add(b, 2);
		ao.print(b);
		
//		ao.insertAtIndex(b, 4, 1);
//		System.out.println(ao.count);
//		ao.print(b);
//		
//		ao.insertAtIndex(b, 5, 0);
//		System.out.println(ao.count);
//		ao.insertAtIndex(b, 10, 2);
//		System.out.println(ao.count);
//
//		ao.print(b);
//		System.out.println(ao.count);
		
//		ao.deleteFromEnd(b);
//		ao.print(b);
//		
//		ao.deleteValue(b, 1);
//		ao.print(b);
		
		ao.deletedFromPosition(b, 0);
		ao.print(b);
		
	}
}
