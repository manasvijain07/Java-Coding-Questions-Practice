
/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * A valid BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * 
 * Example -
 * Input: root = [2,1,3]
 * Output: true
 *
 */
public class ValidBST {
	
	// TC - O(N)	SC - O(N)
	public boolean isValidBST(Node root) {
        if(root == null || (root.left == null && root.right == null))
            return true;
        
        return areValidNodes(root, null, null);
    }
    
    public boolean areValidNodes(Node root, Integer min, Integer max)
    {
        if(root == null)
            return true;
        if(min != null && root.val <= min || max != null && root.val >= max)
        {
            return false;
        }
        else
        {
            return areValidNodes(root.left, min, root.val) && areValidNodes(root.right, root.val, max);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidBST b = new ValidBST();
		Node root = new Node(2);
		Node sec = new Node(1);
		Node third = new Node(3);
		
		root.left = sec;
		root.right = third;
		
		System.out.print(b.isValidBST(root));
	}

}
