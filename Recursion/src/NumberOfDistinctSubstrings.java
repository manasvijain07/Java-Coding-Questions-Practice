import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctSubstrings {
	
    public int countDistinct(String s) {
        Set<String> hashSet = new HashSet<>();
        getSubstring(s, 0, "", hashSet);
        return hashSet.size();
    }
    
    public void getSubstring(String s, int start, String current, Set<String> hashSet)
    {
        if(start == s.length())
        {
        	System.out.print(current + ", ");
            hashSet.add(current);
            return;
        }
        getSubstring(s, start + 1, current + s.charAt(start), hashSet);
        getSubstring(s, start + 1, current, hashSet);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "aabbaba";
			System.out.print(new NumberOfDistinctSubstrings().countDistinct(s));
	}

}
