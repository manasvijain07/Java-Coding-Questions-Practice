import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < rowIndex + 1; i++)
        {
            result.add(0,1);
//            System.out.print(result.size());
            for(int j = 1; j < i; j++)
            {
                result.set(j, result.get(j) + result.get(j+1));
            }
        }
        return result;
    }
	
	public static void main(String a[])
	{
		List<Integer> res = new PascalTriangle().getRow(5);

			for(int val: res)
			{
				System.out.print(val + " ");
			}
			System.out.println("");
	}
}
