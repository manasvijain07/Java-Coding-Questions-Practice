
// Get sum of first N Natural Nos

public class FindSumOfFirstNNaturalNos {
	
	public int getSum(int n)
	{
		if(n == 1)
			return 1;
		return n + getSum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new FindSumOfFirstNNaturalNos().getSum(15));
	}

}
