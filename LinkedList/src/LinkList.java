public class LinkList {

	private Node head;
	private static class Node 
	{
		int val;
		Node next;
		Node(int val)
		{
			this.val = val;
			this.next = null;
		}
	}
	
	public void print()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.val + " ---> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void print(Node head)
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.val + " ---> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public int lengthOfList()
	{
		Node current = head;
		int count = 0;
		while(current != null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertAtBeginning(int val)
	{
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtEnd(int val)
	{
		Node newNode = new Node(val);
		Node current = head;
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = newNode;
	}
	
	public boolean search(int val)
	{
		Node current = head;
		while(current != null)
		{
			if(current.val == val)
				return true;
			else
				current = current.next;
		}
		return false;
	}
	
	public Node reverse()
	{
		Node current = head;
		Node previous = null;
		Node next = null;
		while(current != null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public Node findMiddleNode()
	{
		Node fastptr = head;
		Node slowptr = head;
		
		while(fastptr!= null && fastptr.next != null)
		{
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
		}
		return slowptr;
	}
	
	public Node findNthNodeFromEnd(int n)
	{
		Node current = head;
		int count = 0;
		while(current != null)
		{
			count++;
			current = current.next;
		}
		int nodeNum = count - n;
		Node t = head;
		int c = 0;
		while(c != nodeNum)
		{
			c++;
			t = t.next;
		}
		return t;
	}
	
	public void insertInSortedList(int val)
	{
		Node current = head;
		Node newNode = new Node(val);
		Node prev = head;
		while(current != null && current.val < val)
		{
			prev = current;
			current = current.next;
		}
		newNode.next = prev.next;
		prev.next = newNode;
	}
	
	public void removeKey(int val)
	{
		Node current = head;
		Node prev = head;
		if(current != null && current.val == val)
		{
			head = current.next;
			return;
		}
		
		while(current != null)
		{
			if(current.val == val)
			{
				prev.next = current.next;
			}
			prev = current;
			current = current.next;
		}
	}
	
	public boolean detectLoop()
	{
		Node slowptr = head;
		Node fastptr = head;
		
		while(fastptr != null && fastptr.next != null)
		{
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
			
			if(slowptr == fastptr)
				return true;
		}
		return false;
		
	}
	
	public static void main(String a[])
	{
		LinkList l = new LinkList();
		l.head = new Node(1);
		Node second = new Node(3);
		Node third = new Node(4);
		l.head.next = second;
		second.next = third;
//		third.next = second;
		
		l.print();
		System.out.println("Length of LinkList- " +l.lengthOfList());
		
		l.insertAtBeginning(0);
		System.out.println("\nAfter insertion at beginning - ");
		l.print();
		
		l.insertAtEnd(5);
		System.out.println("\nAfter insertion at end - ");
		l.print();
		
		System.out.println("\n0 present in LinkList - "+l.search(0));
	
//		Node n = l.reverse();
//		System.out.println("\nReverse List - ");
//		l.print(n);
		
		System.out.println("\nMiddle node - "+l.findMiddleNode().val);
		
		System.out.println("\nSecond node from end - "+l.findNthNodeFromEnd(1).val);
		
		l.insertInSortedList(6);
		System.out.println("Insertion in sorted array -");
		l.print();
		
		l.removeKey(0);
		System.out.println("\nRemove key = 0 - ");
		l.print();
		
//		System.out.println("\nLoop in linkList - "+l.detectLoop());
	}
}
