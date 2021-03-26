
public class DuplicateZeroes {
	
	 public void duplicateZeros(int[] arr) {
	        
	        int zeroes = 0;
	        
	        for(int i = 0; i < arr.length; i++)
	        {
	            if(arr[i] == 0)
	            {
	                zeroes++;
	            }
	        }
	        
	        if(zeroes == 0)
	            return;
	        
	        int i = arr.length -zeroes-1;
	        int j = arr.length-1;
	        
	        while(i != j)
	        {
	            if(arr[i] != 0)
	            {
	                arr[j] = arr[i];
	                i--;
	                j--;
	            }
	            else
	            {
	                arr[j--] = 0;
	                arr[j] = 0;
	                i--;
	                j--;
	            }
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = {1,0,2,3,0,4,5,0};
			DuplicateZeroes d = new DuplicateZeroes();
			d.duplicateZeros(a);
			for(int i : a)
			{
				System.out.print(i + " ");
			}
	}

}
