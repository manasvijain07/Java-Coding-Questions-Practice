
public class TrappingRainWater {

    public int trap(int[] height) {
        if(height.length == 0 || height == null)
            return 0;
        
        int res = 0, i = 0, j = height.length-1, level = 0;
        
        while(i < j)
        {
        	int lower;
            if(height[i] < height[j])
            {
                lower = height[i++];
            }
            else
            {
                lower = height[j--];
            }
            
            level = Math.max(lower, level);
            res += level - lower;
        }
        return res;
    }
    
    public static void main(String a[])
    {
    	int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    	
    	TrappingRainWater t = new TrappingRainWater();
    	System.out.print(t.trap(height));
    }
}


