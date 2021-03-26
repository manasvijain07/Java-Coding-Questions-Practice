/** 
 * Construct Binary Tree from Inorder and Postorder Traversal
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.
 * 
 * Example - 
 * Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
 * Output: [3,9,20,null,null,15,7]
 * 
*/


class TreeNode3 {
      int val;
      TreeNode3 left;
      TreeNode3 right;
      TreeNode3() {}
      TreeNode3(int val) { this.val = val; }
      TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

// TC - O(N)
public class ConstructTreeFromInorderAndPreorder {
	
	int preIndex;
	public TreeNode3 buildTree(int[] preorder, int[] inorder) {
		return buildTreeRecursive(preorder, inorder, 0, inorder.length - 1);
	}
	
	public TreeNode3 buildTreeRecursive(int[] preorder, int[] inorder, int start, int end)
	{
		if(start > end)
		{
			return null;
		}
		
		TreeNode3 root = new TreeNode3(preorder[preIndex++]);
		if(start == end)
			return root;
		
		int index = getIndex(root.val, start, end, inorder);
		
		root.left = buildTreeRecursive(preorder, inorder, start, index - 1);
		root.right  = buildTreeRecursive(preorder, inorder, index + 1, end);
		return root;
	}
	
	public int getIndex(int val, int start, int end, int[] inorder)
	{
		for(int i = 0; i <= end; i++)
		{
			if(inorder[i] == val)
			{
				return i;
			}
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
		ConstructTreeFromInorderAndPreorder c = new ConstructTreeFromInorderAndPreorder();
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		
		TreeNode3 root = c.buildTree(preorder, inorder);
		c.preOrder(root);
	}

}
