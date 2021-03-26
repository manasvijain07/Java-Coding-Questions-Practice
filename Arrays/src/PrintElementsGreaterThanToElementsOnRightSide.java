import java.util.ArrayList;

// Print Elements which are greater than all it's right elements
// Eg - 14, 15, 8, 9, 5, 2 
// Output - 2, 5, 9, 15

public class PrintElementsGreaterThanToElementsOnRightSide {
	
	public void getElements(int []a)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = a.length-1; i >= 0; i--)
		{
			if(a[i] > max)
			{
				max = a[i];
				System.out.print(a[i] + " ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []a = {14, 15, 8, 9, 5, 2 };
			PrintElementsGreaterThanToElementsOnRightSide p = new PrintElementsGreaterThanToElementsOnRightSide();
			p.getElements(a);
	}

}
