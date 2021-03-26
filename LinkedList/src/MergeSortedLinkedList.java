import java.util.ArrayList;
import java.util.List;

class ListNode
{
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; this.next = null; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeSortedLinkedList {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current = new ListNode();
        ListNode head = current;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            }
            else
            {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            }
        }
        
        while(l1 != null)
        {
            current.next = l1;
            current = current.next;
            l1 = l1.next;
        }
        
        while(l2 != null)
        {
            current.next = l2;
            current = current.next;
            l2 = l2.next;            
        }
        
        return head.next;
    }
	
	public void print(ListNode listNode)
	{
		ListNode current = listNode;
		while(current != null)
		{
			System.out.print(current.val + "-->");
			current = current.next;
		}
		System.out.println("null\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode first = new ListNode(1);
		ListNode sec = new ListNode(2);
		ListNode third = new ListNode(4);
		
		first.next = sec;
		sec.next = third;

		ListNode first1 = new ListNode(1);
		ListNode sec1 = new ListNode(3);
		ListNode third1 = new ListNode(4);
		
		first1.next = sec1;
		sec1.next = third1;

		MergeSortedLinkedList m = new MergeSortedLinkedList();
		m.print(first);
		m.print(first1);
		
		ListNode c = m.mergeTwoLists(first, first1);
		m.print(c);
	}

}
