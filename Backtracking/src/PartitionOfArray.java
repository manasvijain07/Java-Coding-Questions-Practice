import java.util.ArrayList;

/**
 * Select elements from array that divides it into equal sum
 * 
 *
 */
public class PartitionOfArray {
	
	public void getElements(int[] a)
	{
		ArrayList<Integer> result = new ArrayList<>();
		int sum = 0;
		for(int i : a)
		{
			sum += i;
		}
		
		if(sum % 2 == 0 && getListOfElements(a, sum/2, 0, result))
		{
			for(int i : result)
				System.out.print(i + " ");
		}
		else
		{
			System.out.print("Not possible");
		}
	}
	
	public boolean getListOfElements(int[] a, int sum, int start, ArrayList<Integer> result)
	{
		if(start >= a.length || sum < 0)
			return false;
		
		if(sum == 0)
			return true;
		
		result.add(a[start]);
		boolean leftPartition = getListOfElements(a, sum - a[start], start + 1, result);
		if(leftPartition)	return true;
		result.remove(result.size() - 1);
		return getListOfElements(a, sum, start + 1, result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2, 1, 2, 3, 4, 8};
		
		new PartitionOfArray().getElements(a);
		
		
	}

}
