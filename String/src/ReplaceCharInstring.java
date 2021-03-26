
public class ReplaceCharInstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hellpppp Wprld !!";
		System.out.println(s);
		
		char[] c = s.toCharArray();
		
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] == 'p')
			{
				c[i] = 'o';
			}
		}
		
		System.out.print(c);
		
	}

}
