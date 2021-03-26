import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithkDistinctChars {
	
	public int getLongestDistinctChars(String s, int k)
	{
		if(s.length() == 0 || s == null || k < 0|| k > s.length())
			return -1;
		int count = 0, start = 0, end = 0, str_length = 0;
		Set<Character> set = new HashSet<>();
		
		while(end < s.length())
		{
			do
			{
				set.add(s.charAt(end));
				end++;
			}while(set.size() < k);
			
			str_length = Math.max(str_length, end - start + 1);
			
			set.remove(new Character(s.charAt(start)));
			start++;
			
		}
		return str_length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bccbababd";
		int k = 1;
		
		LongestSubstringWithkDistinctChars l = new LongestSubstringWithkDistinctChars();
		System.out.print(l.getLongestDistinctChars(s, k));
		
	}

}
