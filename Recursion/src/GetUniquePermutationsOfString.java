import java.util.HashSet;
import java.util.Set;

public class GetUniquePermutationsOfString {
	
	Set<String> hashSet = new HashSet<>();
	
	public String getAllUniquePermutations(String s)
	{
		return getPerm(s, 0, s.length() - 1);
	}
	
	public String getPerm(String s, int l, int r)
	{
		if(l == r)
			{
				if(hashSet.contains(s))	return s;
				System.out.println(s);
				hashSet.add(s);
				return s;
			}
		
		for(int i = l; i <= r; i++)
		{
			s = interchange(s, l, i);
			getPerm(s, l + 1, r);
			s = interchange(s, l, i);
		}
		return s;
	}
	
	public String interchange(String s, int a, int b)
	{
		char[] c = s.toCharArray();
		char t = c[a];
		c[a] = c[b];
		c[b] = t;
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetUniquePermutationsOfString p = new GetUniquePermutationsOfString();
		p.getAllUniquePermutations("abcc");
	}

}
