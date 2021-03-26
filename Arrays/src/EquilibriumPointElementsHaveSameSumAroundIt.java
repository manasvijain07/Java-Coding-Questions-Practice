
// Find Equilibrium point where elements before & after it has equal sum
//Eg - {1, 6, 7, 0, 7}
// 7 is equilibrium point as sum before and after it is 7

public class EquilibriumPointElementsHaveSameSumAroundIt {

	public void findEquilibriumPoint(int[] a)
	{
		int sum = 0, sum_so_far = 0;
		
		for(int i: a)
		{
			sum += i;
		}
		
		for(int i = 0; i < a.length; i++)
		{
			sum -= a[i];
			if(sum == sum_so_far)
			{
				System.out.print("Equilibrium point is = "+ a[i] + " at index = "+i);
				return;
			}
			
			sum_so_far += a[i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1, 6, 7, 0, 7};
		EquilibriumPointElementsHaveSameSumAroundIt e = new EquilibriumPointElementsHaveSameSumAroundIt();
		e.findEquilibriumPoint(a);
	}

}
