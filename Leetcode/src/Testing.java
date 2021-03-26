import LinkList.Node;

public class Testing {
	private ListNode head;
	private static class ListNode {
		int val;
		ListNode next;
		
		ListNode(int val)
		{
			this.val = val;
		}
		
	}
	
	public void print()
	{
		ListNode current = head;
		while(current != null)
		{
			System.out.print(current.val + " ---> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public boolean isPalindrome(ListNode head) {
        ListNode reversed = reverse(head);
        ListNode x = head;
        ListNode y = reversed;
        while(x != null)
        {
            if(x.val != y.val)
                return false;
            x = x.next;
            y = y.next;
        }
        return true;
    }
    
	public ListNode reverse()
	{
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void main(String []a)
    {
		Testing t = new Testing();
    	t.head = new ListNode(1);
    	ListNode sec = new ListNode(1);
    	ListNode third = new ListNode(2);
    	ListNode fourth = new ListNode(1);
    	t.head.next = sec;
    	sec.next = third;
    	third.next = fourth;
    	t.print();
    	
    	System.out.println("Reversed - ");
    	t.reverse();
    	t.print();
    	
    }
}

