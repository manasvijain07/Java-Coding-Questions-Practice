
/**
 * Insert into a Binary Search Tree
 * 
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them
 * 
 *
 */

public class InsertIntoBST {
	
	// TC - O(H), where H is a tree height. That results in O(logN) in the average case, and O(N) in the worst case.
	// SC - O(H) to keep the recursion stack, i.e. O(logN) in the average case, and O(N) in the worst case.
	  public Node insertIntoBST(Node root, int val) {
	        if(root == null)
	            return new Node(val);
	        if(val < root.val)
	        {
	            root.left = insertIntoBST(root.left, val);
	        }
	        else
	        {    
	            root.right = insertIntoBST(root.right, val);
	        }
	        return root;
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
		
		int val = 10;
		
		InsertIntoBST i = new InsertIntoBST();
		i.insertIntoBST(root, val);
	}

}
