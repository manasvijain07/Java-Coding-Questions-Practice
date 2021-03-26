class Node
{
	int val;
	Node left;
	Node right;
}
public class BSTOperations {
	
	public Node createNewNode(Node node, int val)
	{
		Node a = new Node();
		a.val = val;
		a.left = null;
		a.right = null;
		return a;
	}

	public Node insert(Node node, int val)
	{
		if(node == null)
		{
			return createNewNode(node, val);
		}
		if(val < node.val)
		{
			node.left = insert(node.left, val);
		}
		else if(val > node.val)
		{
			node.right = insert(node.right, val);
		}
		return node;
	}
	
	public Node getSuccessor(Node node)
	{
		if(node == null)
			return null;
		
		Node temp = node.right;
		
		while(temp.left != null)
		{
			temp = temp.left;
		}
		return temp;
	}
	
	public Node delete(Node node, int val)
	{
		if(node == null)
			return null;
		
		if(val < node.val)
		{
			node.left = delete(node.left, val);
		}
		else if(val > node.val)
		{
			node.right = delete(node.right, val);
		}
		else
		{
			if(node.left == null || node.right == null)
			{
				Node temp = node.left == null ? node.right: node.left;
				if(temp == null)
					return null;
				else
					return temp;
			}
			else
			{
				Node successor = getSuccessor(node);
				node.val = successor.val;
				node.right = delete(node.right, successor.val);
				return node;
			}
		}
		return node;
	}
	
	public void inorder(Node node)
	{
		if(node == null)
			return;
		inorder(node.left);
		System.out.print(node.val + " ");
		inorder(node.right);
	}
	
	public void preOrder(Node node)
	{
		if(node == null)
			return;
		
		System.out.print(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void postOrder(Node node)
	{
		if(node == null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val + " ");
	}
	
	public boolean search(Node node, int val)
	{
		if(node == null)
			return false;
		
		while(node != null)
		{
			if(val < node.val)
				node = node.left;
			else if(val > node.val)
				node = node.right;
			else
				return true;
		}
		return false;
		
	}
	
	public Node getParentNode(Node root, int val)
	{
		if(root == null)
			return null;
		Node prev = null;
		
		while(root != null)
		{
			if(val < root.val)
			{
				prev = root;
				root = root.left;
			}
			if(val > root.val)
			{
				prev = root;
				root = root.right;
			}
			else
			{
				return prev;
			}
		}
		return null;
	}
	
	public Node getSibling(Node node, int val)
	{
		if(node == null || node.val == val)
			return null;
		
		Node prev = null;
		while(node != null)
		{
			if(val < node.val)
			{
				prev = node;
				node = node.left;
			}
			else if(val > node.val)
			{
				prev = node;
				node = node.right;
			}
			else
			{
				break;
			}
		}
		if(prev.left != null && val == prev.left.val)
			return prev.right;
		if(prev.right != null && val == prev.right.val)
			return prev.left;
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		BSTOperations b = new BSTOperations();
		root = b.insert(root, 8);
		root = b.insert(root, 3);
		root = b.insert(root, 10);
		root = b.insert(root, 1);
		root = b.insert(root, 6);
		root = b.insert(root, 4);
		root = b.insert(root, 7);
		root = b.insert(root, 14);
		root = b.insert(root, 13);
		
//		root = b.delete(root, 1);
//		root = b.delete(root, 14);
//		root = b.delete(root, 3);
		
		System.out.println("Inorder order - ");
		b.inorder(root);
		System.out.println("Preorder order - ");
		b.preOrder(root);
		System.out.println("Postorder order - ");
		b.postOrder(root);
		
		System.out.println(" Node present - " + b.search(root, 30));
		
		Node n = b.getParentNode(root, 8);
		if(n != null)
			System.out.println(n.val);
		else
			System.out.println("Parent not found");
		
		Node t = b.getSibling(root, 8);
		if(t != null)
			System.out.println(t.val);
		else
			System.out.println("Sibling not found");
	}

}
