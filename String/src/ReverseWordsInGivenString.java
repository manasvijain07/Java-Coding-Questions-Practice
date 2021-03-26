
public class ReverseWordsInGivenString {
	
	//TC - O(n)	SC - O(1)
	public String reverse(String s)
	{
		StringBuffer temp_string = new StringBuffer();
		StringBuffer final_string = new StringBuffer();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				temp_string.append(s.charAt(i)); 
			}
			else
			{
				final_string.insert(0, " " + temp_string);
				temp_string.setLength(0);
			}
		}
		final_string.insert(0, temp_string);
		return final_string.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding simplified nice";
		ReverseWordsInGivenString r = new ReverseWordsInGivenString();
		String t = r.reverse(s);
		System.out.print(t);
	}

}
