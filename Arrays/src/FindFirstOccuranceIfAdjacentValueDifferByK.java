
public class FindFirstOccuranceIfAdjacentValueDifferByK {
	public int getOccurance(int []a, int target, int k)
	{
		int i = 0;
		while(i < a.length)
		{
			if(a[i] == target)
				return i;
			int diff = Math.abs(a[i] - target)/ k;
			diff = Math.max(1, diff);
			i += diff;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {70,60,70,80,90,110,130};
		int target = 110;
		int k = 20;
		
		FindFirstOccuranceIfAdjacentValueDifferByK f = new FindFirstOccuranceIfAdjacentValueDifferByK();
		System.out.print(f.getOccurance(a, target, k));
	}
}
