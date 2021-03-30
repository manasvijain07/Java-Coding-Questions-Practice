import java.util.Stack;

/**
 * 
 * Deletion in a BST
 * 
 * 
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
 * 
 * Basically, the deletion can be divided into two stages:
 * 
 * 1. Search for a node to remove.
 * 2. If the node is found, delete the node.
 * 
 * The time complexity and space complexity will be O(logN) in the best case but O(N) in the worse case.
 *
 */

public class DeleteNodeInBST {
	
	public Node deleteNode(Node root, int key) {
		 // return null if root is null
        	if(root == null)
        		return root;
        	
        	// delete current node if root is the target node
        	if(root.val == key)
        	{
        		// replace root with root->right if root->left is null
        		if(root.left == null)
        		{
        			return root.right;
        		}
        		
        		// replace root with root->left if root->right is null
        		if(root.right == null)
        		{
        			return root.left;
        		}
        		
        		 // replace root with its successor if root has two children
        		Node p = findSuccessor(root);
        		root.val = p.val;
        		root.right = deleteNode(root.right, p.val);
        		return root;
        	}
        	if(key < root.val)
        	{
        		 // find target in left subtree if key < root.val
        		root.left = deleteNode(root.left, key);
        	}
        	else
        	{
        		// find target in right subtree if key > root.val
        		root.right = deleteNode(root.right, key);
        	}
        
        	return root;
    }
    
	public Node findSuccessor(Node root)
	{
		Node cur = root.right;
		while(cur != null && cur.left != null)
		{
			cur = cur.left;
		}
		return cur;
	}
	
	public void inorder(Node root)
	{
		if(root == null)
			return;
		
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(7);
		Node sec = new Node(3);
		Node third = new Node(15);
		Node forth = new Node(9);
		Node fifth = new Node(20);
		
		root.left = sec;
		root.right = third;
		third.left = forth;
		third.right = fifth;
		
		DeleteNodeInBST d = new DeleteNodeInBST();
		int key = 9;
		System.out.println("Before deletion - ");
		d.inorder(root);
		Node result = d.deleteNode(root, key);
		System.out.println("\n\nAfter deletion - ");
		d.inorder(root);
		
	}

}
