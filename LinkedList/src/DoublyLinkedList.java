import java.util.NoSuchElementException;

public class DoublyLinkedList {
	ListNode head;
	ListNode tail;
	private int length;

	public static class ListNode
	{
		int val;
		ListNode prev;
		ListNode next;
		ListNode(int val)
		{
			this.val = val;
		}
	}
	
	DoublyLinkedList()
	{
		head = null;
		tail = null;
		length = 0;
	}
	
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public void print()
	{
		ListNode current = head;
		while(current != null)
		{
			System.out.print(current.val + "---> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void printReverse()
	{
		ListNode current = tail;
		while(current != null)
		{
			System.out.print(current.val + "---> ");
			current = current.prev;
		}
		System.out.println("null");
	}
	
	public void insertAtBeginning(int val)
	{
		ListNode newNode = new ListNode(val);
		if(isEmpty())
		{
			tail = newNode;
		}
		else
		{
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	public void insertAtEnd(int val)
	{
		ListNode newNode = new ListNode(val);
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.prev = tail;
		}
		
		tail = newNode;
		length++;
	}
	
	public ListNode deleteFirstNode()
	{
		if(head == null)
			throw new NoSuchElementException();
		ListNode current = head;
		if(head == tail)
			tail = null;
		else
		{
		head = head.next;
		head.prev = null;
		current.next = null;
		}
		return current;
	}
	
	ListNode deleteLastNode()
	{
		if(head == null)
			throw new NoSuchElementException();
		ListNode temp = tail;
		if(head == tail)
		{
			head = null;
		}
		else
		{
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList d = new DoublyLinkedList();
		d.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		d.tail = new ListNode(4);
		d.length = 4;
		
		d.head.next = second;
		second.next = third;
		third.next = d.tail;
		
		d.tail.prev = third;
		third.prev = second;
		second.prev = d.head;
		
		d.print();
		d.printReverse();
		
		d.insertAtBeginning(0);
		d.print();
		
		d.insertAtEnd(6);
		d.print();
		
		d.deleteFirstNode();
		d.print();
		
		d.deleteLastNode();
		d.print();
	}

}
