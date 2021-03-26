import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithNoRepeatingChars {
	
	public int getLongestSubstring(String s)
	{
		int start = 0, end = 0, max_length = 0;
		Set<Character> set = new HashSet<>();
		
		while(end < s.length())
		{
			if(!set.contains(s.charAt(end)))
			{
				set.add(s.charAt(end));
				end++;
			} else
			{
				max_length = Math.max(max_length, end - start + 1);
				set.remove(new Character(s.charAt(start)));
				start++;
			}
		}
		max_length = Math.max(max_length, end - start + 1);
		return max_length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babccbacd";
		
		LongestSubstringWithNoRepeatingChars l = new LongestSubstringWithNoRepeatingChars();
		System.out.print(l.getLongestSubstring(s));
	}

}
