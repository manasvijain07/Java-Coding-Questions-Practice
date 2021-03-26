
//Eg - {7,6,7,6,5,4,3,2,3,2,1} 	target = 2

public class cc {
	
	public int getOccurance(int []a, int target)
	{
		int i = 0;
		while(i < a.length)
		{
			if(a[i] == target)
				return i;
			i += Math.abs(a[i] - target);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,6,7,6,5,4,3,2,3,2,1};
		int target = 8;
		
		FindFirstOccuranceIfAdjacentValueDifferBy1 f = new FindFirstOccuranceIfAdjacentValueDifferBy1();
		System.out.print(f.getOccurance(a, target));
	}

}
