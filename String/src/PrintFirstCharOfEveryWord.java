
public class PrintFirstCharOfEveryWord {
	
	public static void main(String args[])
	{
		String s = "      Hello World";
		
		char []a = s.toCharArray();
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != ' ')
			{
				if(i == 0)
				{
					System.out.println(a[i]);
				} 
				else if(a[i-1] == ' ')
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
