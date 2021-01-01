import java.util.Stack;

public class TreeOperations {
	private TreeNode root;
	
	static class TreeNode
	{
		private int val;
		private TreeNode left;
		private TreeNode right;
		
		TreeNode(int val)
		{
			this.val = val;
		}
	}
	
	public void createBinaryTree()
	{
		
		TreeNode first = new TreeNode(8);
		TreeNode sec = new TreeNode(3);
		TreeNode third = new TreeNode(2);
		TreeNode fourth = new TreeNode(6);
		TreeNode fifth = new TreeNode(9);
		
		root = first;
		first.left = sec;
		first.right = third;
		sec.left = fourth;
		sec.right = fifth;
	}
	
	public void preOrderRecursiveTraversal(TreeNode root)
	{
		if(root == null) return;
		
		System.out.print(root.val + " ");
		preOrderRecursiveTraversal(root.left);
		preOrderRecursiveTraversal(root.right);
		
	}
	
	public void preOrderIterativeTraversal()
	{
		if(root == null) return;
		
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		while(!s.isEmpty())
		{
			TreeNode temp = s.pop();
			System.out.print(temp.val + " ");
			
			if(temp.right != null)
				s.push(temp.right);
			
			if(temp.left != null)
				s.push(temp.left);
		}
	}
	
	public void inOrderRecursion(TreeNode root)
	{
		if(root == null) return;
		
		inOrderRecursion(root.left);
		System.out.print(root.val + " ");
		inOrderRecursion(root.right);
		
	}
	
	public void inOrderIterative()
	{
		if(root == null) return;
		
		Stack<TreeNode> s = new Stack<>();
		TreeNode temp = root;
		while(!s.isEmpty() || temp!= null)
		{
			if(temp != null)
			{
				s.push(temp);
				temp = temp.left;
			}
			else
			{
				temp = s.pop();
				System.out.print(temp.val + " ");
				temp = temp.right;
			}
		}
	}
	
	public void postOrderIterative()
	{
		if(root == null) return;
		
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		s1.push(root);
		
		while(!s1.isEmpty())
		{
			root = s1.pop();
			s2.push(root);
			if(root.left != null)
				s1.push(root.left);
			if(root.right != null)
				s1.push(root.right);
		}
		
		while(!s2.isEmpty())
		{
			root = s2.pop();
			System.out.print(root.val + " ");
		}
	}
	
	public void postOrderRecursion(TreeNode root)
	{
		if(root == null) return;
		
		postOrderRecursion(root.left);
		postOrderRecursion(root.right);
		System.out.print(root.val + " ");
	}
	
	public static void main(String [] a) {
		TreeOperations t = new TreeOperations();
		t.createBinaryTree();
		
		System.out.println("PreOrder traversal Recursion - ");
		t.preOrderRecursiveTraversal(t.root);
		
		System.out.println("\n\nPreOrder traversal Iterative - ");
		t.preOrderIterativeTraversal();
		
		System.out.println("\n\nInOrder traversal Recursion - ");
		t.inOrderRecursion(t.root);
		
		System.out.println("\n\nInOrder traversal Iterative - ");
		t.inOrderIterative();
		
		System.out.println("\n\nPostOrder traversal Recursive - ");
		t.postOrderRecursion(t.root);
		
		System.out.println("\n\nPostOrder traversal Iterative - ");
		t.postOrderIterative();
	}
}
