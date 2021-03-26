
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs = "Let's take LeetCode contest";
		String s = reverseWords(strs);
		for(int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));
	}
	
	static public String reverseWords(String s) {
        String res = new String();
        int n = s.length();
        int i = 0, j = 0;
        while(i < n)
        {
        	j = i+1;
            while(j < n && s.charAt(j)!= ' ')
                j++;
            System.out.println("start pointer at: "+i);
            System.out.println("end pointer at: "+j);
            String word = s.substring(i,j);
            System.out.println("word is : "+word);
            if(res.length() == 0)
                res = reverse(word);
            else
                res = res + ' ' + reverse(word);
            System.out.println("reverse is "+ res);
            i = j + 1;
        }
        return res;
    }
    
    static public String reverse(String s)
    {
        StringBuffer str = new StringBuffer();
        for(int i = s.length()-1; i >= 0; i--)
        {
            str.append(s.charAt(i));
        }
        return str.toString();
    }
        

}
