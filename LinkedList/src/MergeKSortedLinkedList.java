import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Merge k Sorted Lists
 * 
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * 
 * Merge all the linked-lists into one sorted linked-list and return it.
 * 
 * 
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 *
 */

public class MergeKSortedLinkedList {
	
	public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null)
            return null;
        
        ListNode result = new ListNode(-2147483648);
        ListNode current = result;
        for(ListNode list: lists)
        {
        	if(list != null)
        	{
        		current = merge(list, current);
        	}
        }
        return result.next;  
    }
    
    public ListNode merge(ListNode l1, ListNode l2)
    {
        ListNode result = new ListNode();
        ListNode current = result;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                current.next = l1;
                l1 = l1.next;
            }
            else
            {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        
        while(l1 != null)
        {
            current.next = l1;
            l1 = l1.next;
            current = current.next;
        }
                
        while(l2 != null)
        {
            current.next = l2;
            l2 = l2.next;
            current = current.next;
        }
        return result.next;
    }
    
	public void print(ListNode[] listNode)
	{
		for(ListNode l: listNode)
		{
			ListNode current = l;
			System.out.print("[");
			while(current != null)
			{
				System.out.print(current.val + "-->");
				current = current.next;
			}
			System.out.print("null]  ");
		}
	}
	
	public void printList(ListNode listNode)
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
		ListNode first = new ListNode(2);
//		ListNode sec = new ListNode(4);
//		ListNode third = new ListNode(5);
		
//		first.next = sec;
//		sec.next = third;

		ListNode first1 = null;
//		ListNode sec1 = new ListNode(3);
//		ListNode third1 = new ListNode(4);
		
//		first1.next = sec1;
//		sec1.next = third1;
		
		ListNode first2 = new ListNode(-1);
//		ListNode sec2 = new ListNode(6);
		
//		first2.next = sec2;
		
		ListNode[] linked = new ListNode[3];
		linked[0] = first;
		linked[1] = first1;
		linked[2] = first2;
		MergeKSortedLinkedList m = new MergeKSortedLinkedList();
		m.print(linked);
		ListNode result = m.mergeKLists(linked);
		m.printList(result);
		
	}

}
