
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        s = s.trim();
        char[] t = s.toCharArray();
        int start = 0, end = s.length()-1;
        
        while(start < end)
        {
            char c = t[start];
            t[start] = t[end];
            t[end] = c;
            start++;
            end--;
        }
        return String.valueOf(t);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the sky is blue";
		
		System.out.print(new ReverseWordsInAString().reverseWords(s));
	}

}
