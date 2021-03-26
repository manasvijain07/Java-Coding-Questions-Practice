/** 
 * Construct Binary Tree from Inorder and Postorder Traversal
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.
 * 
 * Example - 
 * Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
 * Output: [3,9,20,null,null,15,7]
 * 
*/


class TreeNode2 {
      int val;
      TreeNode3 left;
      TreeNode3 right;
      TreeNode2() {}
      TreeNode2(int val) { this.val = val; }
      TreeNode2(int val, TreeNode3 left, TreeNode3 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

// TC - O(N)
public class ConstructTreeFromInorderAndPostorder {
	
	int postIndex;
	public TreeNode3 buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0)
        	return null;
        
        postIndex = postorder.length - 1;
        return buildTreeRecursive(inorder, postorder, 0, inorder.length-1);
	}
	
	public TreeNode3 buildTreeRecursive(int[] inorder, int[] postorder, int start, int end)
	{
		if(start > end)
			return null;
		
		TreeNode3 root = new TreeNode3(postorder[postIndex--]);
		
		if(start == end)
			return root;
		
		int index = getIndex(inorder, root.val, start, end);
		
		root.right = buildTreeRecursive(inorder, postorder, index + 1, end);
		root.left = buildTreeRecursive(inorder, postorder, start, index - 1);
		
		return root;
	}
	
	public int getIndex(int[] inorder, int val, int start, int end)
	{
		for(int i = start; i <= end; i++)
		{
			if(inorder[i] == val)
				return i;
		}
		return -1;
	}
	
	public void preOrder(TreeNode3 node)
	{
		if(node == null)
			return;
		
		System.out.print(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructTreeFromInorderAndPostorder c = new ConstructTreeFromInorderAndPostorder();
		int[] inorder = {9,3,15,20,7};
		int[] postorder = {9,15,7,20,3};
		
		TreeNode3 root = c.buildTree(inorder, postorder);
		c.preOrder(root);
	}

}
