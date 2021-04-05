
public class GetSubstringOfString {
	
	public void getSubstring(String s, int start, String current)
	{
		if(start >= s.length())
		{
			System.out.print(current + ", ");
			return;
		}
		
		getSubstring(s, start + 1, current + s.charAt(start));
		getSubstring(s, start + 1, current);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		
		
		new GetSubstringOfString().getSubstring(s, 0, "");
	}

}
