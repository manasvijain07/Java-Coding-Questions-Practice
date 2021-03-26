package Arrays_Matrix;

public class GetPeakElement {
	
	public int findPeakElement(int[] nums) {
        if(nums.length < 2)
        {
            return 0;
        }
        if(nums.length == 2)
        {
            return nums[0] >  nums[1] ? 0: 1;
        }
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            
            else if(nums[mid] < nums[mid + 1])
            {
                start = mid+ 1;
            }
            else
            {
                end = mid;
            }
        }
        return end;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,5,4,3,2,3,2};
		GetPeakElement g = new GetPeakElement();
		
		System.out.print(g.findPeakElement(nums));
		
	}

}
