
public class PerfectSquare {
	
	public boolean isPerfectSquare(int num) {
        if(num == 1)
            return true;
        return getPerfect(2, num, num);
    }
    
    public boolean getPerfect(int start, int end, int num)
    {
        if(start <= end)
        {
            int mid = start + (end - start)/2;
            long val = mid * mid;
            if((int) val == num)
                 return true;
            if((val) > num)
            {
                return getPerfect(start, mid - 1, num);
            }
            else
            {
                return getPerfect(mid+1, end, num);
            }
        }
        else
            return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		
		PerfectSquare p = new PerfectSquare();
		System.out.print(p.isPerfectSquare(n));
	}

}
