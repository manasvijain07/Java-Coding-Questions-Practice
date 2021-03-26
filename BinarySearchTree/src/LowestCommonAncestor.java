import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between 
 * two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow 
 * a node to be a descendant of itself).”
 * 
 *
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * Output: 3 
 * Explanation: The LCA of nodes 5 and 1 is 3.

 * https://www.youtube.com/watch?v=13m9ZCB8gjw
 * https://www.youtube.com/watch?v=k7NF6rNOs4Y
 */

public class LowestCommonAncestor {
	
	// TC - O(N)    SC - O(1)
    public TreeNode1 lowestCommonAncestor(TreeNode1 root, TreeNode1 p, TreeNode1 q) {
        if(root == null)
            return root;
        
        if(root == p || root == q)
            return root;
        
        TreeNode1 left = lowestCommonAncestor(root.left, p, q);
        TreeNode1 right = lowestCommonAncestor(root.right, p, q);
        
        if(left != null && right != null)
            return root;
        if(left == null && right == null)
            return null;
        return left != null ? left: right;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowestCommonAncestor p = new LowestCommonAncestor();
		TreeNode1 root = new TreeNode1(3);
		TreeNode1 sec = new TreeNode1(5);
		TreeNode1 third = new TreeNode1(1);
		TreeNode1 forth = new TreeNode1(6);
		TreeNode1 fifth = new TreeNode1(2);
		TreeNode1 sixth = new TreeNode1(0);
		TreeNode1 seventh = new TreeNode1(8);
		TreeNode1 eight = new TreeNode1(7);
		TreeNode1 ninth = new TreeNode1(4);
		
		root.left = sec;
		root.right = third;
		sec.left = forth;
		sec.right = fifth;
		third.left = sixth;
		third.right = seventh;
		fifth.left = eight;
		fifth.right = ninth;
		
		TreeNode1 result = p.lowestCommonAncestor(root, sixth, forth);
		System.out.print(result.val);
	}
}
