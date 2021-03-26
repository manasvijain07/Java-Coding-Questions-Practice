
public class Fibonacci {
	
	//Recursion - TC- O(2 ^ N) SC- O(N) - worst TC
	public int recursion(int n)
	{
		if(n < 2)
			return n;
		return recursion(n-1) + recursion(n-2);
	}
	
	//Iterative - TC-O(N) SC- O(1)
	public int iterative(int n)
	{
		int a = 0, b = 1, c;
		
		for(int i = 2; i <= n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
	//Top Down - TC - O(N) SC - O(N)
	public int fibonacciTopDown(int n)
	{
		int[] dp = new int[n+1];
		if(n < 2)
		{
			return n; 
		}
		
		if(dp[n] == 0)
		{
			dp[n] = fibonacciTopDown(n-1) + fibonacciTopDown(n-2);
		}
		
		return dp[n];
	}
	
	//Bottom Up - TC - O(N) SC - O(N)
	public int fibonacciBottomUp(int n)
	{
		int []dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
				
		for(int i = 2; i <= n ; i++)
		{
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Fibonacci f = new Fibonacci();
			System.out.println(f.fibonacciTopDown(5));
			System.out.println(f.fibonacciBottomUp(5));
			System.out.println(f.recursion(5));
			System.out.println(f.iterative(5));
	}

}
