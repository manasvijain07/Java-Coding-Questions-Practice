
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
		
		Node first = new Node(8);
		Node sec = new Node(3);
		Node third = new Node(2);
		Node fourth = new Node(6);
		Node fifth = new Node(9);
		
		root = first;
		first.left = sec;
		first.right = third;
		sec.left = fourth;
		sec.right = fifth;
	}
	
	public static void main(String[] a)
	{
		Tree t = new Tree();
		t.createBinaryTree();
	}
}
