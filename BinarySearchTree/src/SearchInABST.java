import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Search in a Binary Search Tree
 * 
 * You are given the root of a binary search tree (BST) and an integer val.
 * Find the node in the BST that the node's value equals val and return the subtree 
 * rooted with that node. If such a node does not exist, return null.
 * 
 * Input: root = [4,2,7,1,3], val = 2
 * Output: [2,1,3]
 *
 */

public class SearchInABST {
	
	// TC - O(N)    SC - O(N)
    public Node searchBST(Node root, int val) {
        if(root == null)
            return null;
        
        if(root.val == val)
            return root;
        else if(val < root.val)
        {
            return searchBST(root.left, val);
        }
        else
        {
            return searchBST(root.right, val);
        }
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
		
		int val = 15;
		SearchInABST s = new SearchInABST();
		Node result = s.searchBST(root, val);
		s.inorder(result);
	}

}
