
public class TrimTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "           Hello World     ";
			System.out.println(s);
			
			char[] c = s.toCharArray();
			int start = 0, i = 0, end = 0;

			while(c[i] == ' ')
			{
				i++;
			}
			start = i;
			
			int l = c.length - 1;
			
			while(c[l] == ' ')
			{
				l--;
			}
			end = l;
			
			for(int ij = start; ij <= end; ij++)
			{
				System.out.print(c[ij]);
			}
			
			
			
	}

}
