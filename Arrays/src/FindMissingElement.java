
public class FindMissingElement {
	
	public int findMissingElement(int []a, int n)
	{
		int sum = n *(n + 1)/2;
		
		for(int i = 0; i < a.length; i++)
		{
			sum -= a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,5,1,6,4,7, 8};
		
		FindMissingElement f = new FindMissingElement();
		System.out.print(f.findMissingElement(a, a.length + 1));
	}

}
