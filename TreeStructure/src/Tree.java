
public class Tree {

	Node root;
	
	static class Node
	{
		int val;
		Node left;
		Node right;
		
		Node(int val)
		{
			this.val = val;
			left = null;
			right = null;
		}
	}
	
	public void createBinaryTree()
	{
		
		Node first = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eigth = new Node(8);
		Node ninth = new Node(9);
		Node tenth = new Node(10);
		
		root = first;
		first.left = sec;
		first.right = third;
		sec.left = fourth;
		sec.right = fifth;
		third.left = sixth;
		fifth.left = seventh;
		fifth.right = eigth;
		sixth.left = ninth;
		sixth.right = tenth;
	}
	
	public static void main(String[] a)
	{
		Tree t = new Tree();
		t.createBinaryTree();
	}
}
