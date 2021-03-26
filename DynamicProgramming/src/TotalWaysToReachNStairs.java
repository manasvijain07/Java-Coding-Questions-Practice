
public class TotalWaysToReachNStairs {
	
	//TC - O(3^N) SC - O(N)
	public int recursion(int n)
	{
		if (n == 0) 
			return 1;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		return recursion(n-1) + recursion(n-2) + recursion(n-3);
	}
	
	//TC - O(N) SC- O(N)
	public int topDown(int n)
	{
		int []dp = new int[n + 1];
		if(n == 0)	return 1;
		if(n == 1)	return 1;
		if(n == 2) 	return 2;
		
		if(dp[n] == 0)
			dp[n] = topDown(n-1) + topDown(n-2) + topDown(n-3);
		return dp[n];
	}
	
	//TC - O(N) SC- O(N)
	public int bottomUp(int n)
	{
		int []dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= n ; i++)
		{
			dp[i] = dp[i -1] + dp[i-2] + dp[i-3];
		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalWaysToReachNStairs t = new TotalWaysToReachNStairs();
		System.out.println(t.recursion(5));
		System.out.println(t.topDown(5));
		System.out.println(t.bottomUp(5));
	}

}
