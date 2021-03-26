import java.util.HashSet;
import java.util.Set;

//Find the first repeating value in array
// TC - O(n)	 SC- O(n)

public class FindFirstRepeatingValueInArray {
	
	public int getFirstRepeating(int[] a)
	{
		Set<Integer> s = new HashSet<>();
		int first = -1;
		
		for(int i = a.length-1; i >= 0; i--)
		{
			if(s.contains(a[i]))
			{
				first = a[i];
			} else
			{
				s.add(a[i]);
			}
		}
		return first;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2, 3, 4, 4, 3, 5, 2};
		
		FindFirstRepeatingValueInArray f = new FindFirstRepeatingValueInArray();
		System.out.print(f.getFirstRepeating(a));
	}

}
