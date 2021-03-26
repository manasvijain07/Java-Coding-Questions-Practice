
public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "coding";
			System.out.println(s);
			
			char[] c = s.toCharArray();
			
			int i =0, j = c.length - 1;
			
			while(i < j)
			{
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp;
				i++;
				j--;
			}
			System.out.println(c);
			
	}

}
