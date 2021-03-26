import java.util.ArrayList;

/*
 * Print all elements greater than element on the right
 * Example - input = {14, 15, 8, 9, 5, 2} 
 * 			output = {15, 9, 5, 2}
 */


public class PrintElementsGreaterThanItsRight {
	
	public int[] getArray(int[] a)
	{
		if(a.length == 0)
			return new int[0];
		
		ArrayList<Integer> al = new ArrayList<>();
		int max = a[a.length - 1];
		al.add(a[a.length - 1]);
		
		for(int i = a.length - 2; i >= 0 ; i--)
		{
			if(a[i] > max)
			{
				max = a[i];
				al.add(a[i]);
			}
		}
		
		int[] res = new int[al.size()];
		int k = 0;
		for(int i = al.size() - 1; i >= 0; i--)
			res[k++] = al.get(i);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintElementsGreaterThanItsRight p = new PrintElementsGreaterThanItsRight();
		int[] a = {14, 15, 8, 9, 5, 2};
		int [] res = p.getArray(a);
		
		for(int i : res)
		{
			System.out.print(i + " ");
		}
	}

}
