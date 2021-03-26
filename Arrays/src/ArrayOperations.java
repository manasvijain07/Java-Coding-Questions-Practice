
public class ArrayOperations {
	int count = 0;
	
	public void insertAtEnd(int[] a, int val)
	{
		if(count < a.length)
		{
			a[count++] = val;
		}
		else
		{
			System.out.println("Array is full");
		}
	}
	
	public void print(int[] a)
	{
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		System.out.println("\nCount is : "+ count);
	}
	
	public void insertAtIndex(int[] a, int val, int index)
	{
		int i = a.length-1;
		
		while(i > index)
		{
			a[i] = a[i-1];
			i--;
		}
		a[i] = val;
		count++;
	}
	
	public void deleteValFromEnd(int []a)
	{
		if(a.length <= 0)
			return;
		count--;
	}
	
	public void deleteVal(int []a, int val)
	{
		int j = Integer.MIN_VALUE;
		for(int i = 0; i < count; i++)
		{
			if(a[i] == val)
			{
				j = i;
				for(int k = j; k < count; k++)
				{
					a[k] = a[k+1];
				}
				count--;
			}
		}
		
		if(j == Integer.MIN_VALUE)
		{
			System.out.println(val + "not found in array");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] a = new int[n];
		
		ArrayOperations ao = new ArrayOperations();
		ao.insertAtEnd(a, 1);		
		ao.insertAtEnd(a, 2);
		ao.insertAtEnd(a, 3);
		ao.insertAtEnd(a, 4);
		ao.insertAtIndex(a, 3, 1);

		ao.print(a);
		ao.insertAtIndex(a, 5, 2);
		ao.print(a);
		ao.insertAtIndex(a, 8, 0);
		ao.print(a);
		ao.insertAtIndex(a, 48, 0);
		ao.print(a);
		ao.deleteValFromEnd(a);
		ao.print(a);
		
		ao.deleteVal(a, 3);
		ao.print(a);
	}
	

}
