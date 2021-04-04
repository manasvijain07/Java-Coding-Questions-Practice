
public class CalculatePower {
	
	public int getPower(int exp, int power)
	{
		if(power == 0)
			return 1;
		
		if(power == 1)
			return exp;
		
		return exp * getPower(exp, power - 1);
	}
	
	// TC - O(log n)
	public int getPowerOptimized(int exp, int power)
	{
		if(power == 0)
			return 1;
		
		if(power % 2 == 0)
		{
			return getPowerOptimized(exp * exp, power/2);
		}
		else
		{
			return exp * getPowerOptimized(exp, power-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int exp = 3;
		int power = 10;
		
		System.out.print(new CalculatePower().getPowerOptimized(exp, power));
	}

}
