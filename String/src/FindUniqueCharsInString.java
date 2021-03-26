import java.util.HashSet;
import java.util.Set;

public class FindUniqueCharsInString {
	
	//TC - O(n)	SC - O(n)
	public String findUnqiueChars(String s)
	{
		if(s.length() == 0 || s == null)
			return "";
		Set<Character> set = new HashSet<>();
		for(char c: s.toCharArray())
		{
			set.add(c);
		}
		return set.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaaaa";
		FindUniqueCharsInString f = new FindUniqueCharsInString();
		
		String res = f.findUnqiueChars(s);
		System.out.print(res);
		
	}

}
