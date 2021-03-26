

// TC - O(n)	SC - O(1)
public class MissingNoFrom1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 1, 3, 6, 7, 8};
		
		int n = a.length+1;
		int sum = n * (n + 1)/2;
		
		for(int i = 0; i < a.length; i++)
		{
			sum -= a[i];
		}
		System.out.print("Remaining no = "+sum);
	}

}
