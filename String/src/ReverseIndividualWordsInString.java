import java.util.Stack;

public class ReverseIndividualWordsInString {
	
	// TC - O(n) SC - O(1)
	public String reverseUsingStringBuilder(String s)
	{
		StringBuilder temp_string = new StringBuilder();
		StringBuilder final_string = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				temp_string.insert(0, s.charAt(i));
			} else
			{
				final_string.append(temp_string + " ");
				temp_string.setLength(0);
			}
		}
		final_string.append(temp_string);
		return final_string.toString();
	}
	

	// TC - O(n) SC - O(n)
	public String reverseUsingStack(String str)
	{
		Stack<Character> stack = new Stack<>();
		StringBuffer final_string = new StringBuffer();
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				while(!stack.isEmpty())
				{
					final_string.append(stack.pop());
				}
				final_string.append(' ');
			} else
			{
				stack.push(str.charAt(i));
			}
		}	
		while(!stack.isEmpty())
		{
			final_string.append(stack.pop());
		}
		return final_string.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "Hello World";
			System.out.println(s);
			
			ReverseIndividualWordsInString r = new ReverseIndividualWordsInString();
	
			String final_string = r.reverseUsingStack(s); 
			System.out.print(final_string);
		
	}

}
