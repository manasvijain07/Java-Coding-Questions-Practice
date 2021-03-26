import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		int index = 2;
		int val = 5;
		 MyLinkedList obj = new MyLinkedList();
		 obj.addAtHead(8);
		 obj.addAtTail(9);
		 obj.addAtIndex(1,5);
		 int param_1 = obj.get(index);
		 obj.deleteAtIndex(2);
	}
	
}

class Node {
    int val;
    Node next;
    void Node(int d)
    {
        val = d;
        next = null;
    }
}

class MyLinkedList {

    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node head = null;
		Node current = head;
        int count = 0;
        
        while(current != null)
        {
            if(count == index)
                return current.val;
            count++;
            current = current.next;
        }
        return 0;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node current;
        Node head = null;
        current = head;
        head = current;
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node current = null;
        Node head = null;

        current.next = null;
        Node last = head;
        
        while(last.next != null)
        {
            last = last.next;
        }
        
        last.next = current;
        return;
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node current = null;
        current.val = val;
        Node head = null;
		Node point = head;
		int count = 0;
        while(point != null)
        {
            if(count == index)
            {
                point.next = current;
            }
            count++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
    }
}
