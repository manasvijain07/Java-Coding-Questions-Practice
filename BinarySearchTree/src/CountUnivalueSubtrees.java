
/**
 * Count Univalue Subtrees
 * Given the root of a binary tree, return the number of uni-value subtrees.
 * A uni-value subtree means all nodes of the subtree have the same value.
 * 
 * Example -:
 * Input: root = [5,1,5,5,5,null,5]
 * Output: 4
 * 
 * https://www.youtube.com/watch?v=7HgsS8bRvjo
 */


class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
	
public class CountUnivalueSubtrees {
	
	// TC - O(N)
    public int countUnivalSubtrees(TreeNode1 root) {
        if(root == null)
			return 0;
		
        return (isUnival(root) ? 1 : 0) + (countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right));
    }
    
    public boolean isUnival(TreeNode1 root)
    {
        if(root == null)
            return true;
        if(root.left != null && root.val != root.left.val)
            return false;
        if(root.right != null && root.val != root.right.val)
            return false;
        if(isUnival(root.left) && isUnival(root.right))
            return true;
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountUnivalueSubtrees c = new CountUnivalueSubtrees();
		TreeNode1 root = new TreeNode1(1);
		TreeNode1 sec = new TreeNode1(1);
		TreeNode1 third = new TreeNode1(1);
		TreeNode1 forth = new TreeNode1(5);
		TreeNode1 fifth = new TreeNode1(5);
		TreeNode1 sixth = new TreeNode1(5);
		
		root.left = sec;
		root.right = third;
		sec.left = forth;
		sec.right = fifth;
		third.right = sixth;
		
		System.out.print(c.countUnivalSubtrees(root));
		
	}

}
