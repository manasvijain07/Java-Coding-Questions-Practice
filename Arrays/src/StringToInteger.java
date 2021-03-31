
public class StringToInteger {
	
	public int myAtoi(String str) {
        int result = 0;
        boolean negative = false;
        int i = 0;
        while(str.charAt(i) == ' ')
        {
            i++;
        }
        
        if(str.charAt(i) == '-')
        {
            negative = true;
            i++;
        } 
            
        while(i < str.length() && Character.isDigit(str.charAt(i)))
        {
           int val = Character.getNumericValue(str.charAt(i));
           long cal_val = (long)result * 10 + val;
           if(!negative && (cal_val > Integer.MAX_VALUE ))
           {
               return Integer.MAX_VALUE;
           }
            else if(negative && ((-1) * cal_val < Integer.MIN_VALUE))
            {
                return Integer.MIN_VALUE;
            }
            else
            {
                result = result * 10 + val;
                i++;
            }
        } 
        
        return negative ? result * (-1) : result;   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "-91283472332";
		System.out.print(new StringToInteger().myAtoi(s));
	}

}
