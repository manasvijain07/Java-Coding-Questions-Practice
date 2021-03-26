import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Main {
	public static void main(String args[])
	{
	     LinkedList<String> list=new LinkedList<String>();

	     //Adding elements to the Linked list
	     list.add("Steve");
	     list.add("Carl");
	     list.add("Raj");

	     //Adding an element to the first position
	     list.addFirst("Negan");

	     //Adding an element to the last position
	     list.addLast("Rick");

	     //Adding an element to the 3rd position
	     list.add(2, "Glenn");

	     //Iterating LinkedList
	     Iterator<String> iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	}
}
}

/*class LinearSearch {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> sol = new ArrayList<Integer>();
        HashSet<Integer> s = new HashSet<Integer>();
        for(int num : nums)
            s.add(num);
        int i =1;
        while(i <= nums.length)
        {
            if(s.contains(i))
                i++;
            else
                sol.add(i++);
        }
        return sol;
    }
}
*/

//class LinearSearch {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        
//        ArrayList<Integer> a= new ArrayList<Integer>();
//        int[] point= new int[nums.length+1];
//        for(int i : nums){
//            System.out.println("first " + point[i]);
//        	point[i]++;
//        	System.out.println(point[i]);
//        }
//        
//        for(int k=1; k<point.length; k++){
//        	System.out.println("The value of k is: "+k+" ");
//        	if(point[k]==0){
//            	a.add(k);
//            	System.out.println("This is for k: "+point[k]);
//            }
//        }
//        
//        return a;
//    }
//}