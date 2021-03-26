
public class AddBinary {
	
	public String addBinary(String a, String b) {
        int carry = 0;
        
        StringBuffer sb = new StringBuffer();
        int m = a.length()-1, n = b.length()-1;
        System.out.print(a.charAt(m)+b.charAt(n));
        while(m >= 0 || n >= 0)
        {
            char x = (m <= 0? 0: a.charAt(m));
            char y = (n <= 0? 0: b.charAt(n));
            int c = x + y + carry;
            carry = c% 10;
            int val = c/10; 
            sb.append(val);
            m--;
            n--;
        }
        
        if(carry > 1)
        {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11", b = "1";
		
		AddBinary s = new AddBinary();
		String res = s.addBinary(a, b);
		
		System.out.print(res);
	}

}
