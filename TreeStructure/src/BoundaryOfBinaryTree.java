import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 *  Boundary of Binary Tree
 *  
 * https://www.youtube.com/watch?v=hcFYih7-QfY
 * 
 * 
 * The boundary of a binary tree is the concatenation of the root, the left boundary, 
 * the leaves ordered from left-to-right, and the reverse order of the right boundary.
 *
 * Input: root = [1,null,2,3,4]
 * Output: [1,3,4,2]
 * Explanation:
- The left boundary is empty because the root does not have a left child.
- The right boundary follows the path starting from the root's right child 2 -> 4.
  4 is a leaf, so the right boundary is [2].
- The leaves from left to right are [3,4].
Concatenating everything results in [1] + [] + [3,4] + [2] = [1,3,4,2].

 *
 *
 *TC - O(N)	SC - O(N)
 */

public class BoundaryOfBinaryTree {
	static public Node root;
	
	public class Node
	{
		int val;
		Node left;
		Node right;
		
		Node(int val)
		{
			this.val = val;
			left = null;
			right = null;
		}
	}
	
	public void createBinaryTree()
	{
		
		Node first = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eigth = new Node(8);
		Node ninth = new Node(9);
		Node tenth = new Node(10);
		
		root = first;
		first.left = sec;
		first.right = third;
		sec.left = fourth;
		sec.right = fifth;
		third.left = sixth;
		fifth.left = seventh;
		fifth.right = eigth;
		sixth.left = ninth;
		sixth.right = tenth;
		
	}

	public List<Integer> boundaryOfBinaryTree(Node root) {
		List<Integer> result = new ArrayList<>();
		
		if(root != null)
			result.add(root.val);
		
		visitLeftBoundary(root.left, result);
		
		visitLeafNodes(root.left, result);
		visitLeafNodes(root.right, result);
		
		visitRightNodes(root.right, result);
		
		return result;
	}
	
	
	
	private void visitRightNodes(Node root, List<Integer> result) {
		if(root == null)
			return;
		
		if(root.right != null)
		{
			visitRightNodes(root.right, result);
			result.add(root.val);
		}
		else if(root.left != null)
		{
			visitRightNodes(root.left, result);
			result.add(root.val);
		}
		
	}

	private void visitLeafNodes(Node root, List<Integer> result) {
		if(root == null)
			return;
		
		visitLeafNodes(root.left, result);
		
		if(root.left == null && root.right == null)
		{
			result.add(root.val);
		}
		
		visitLeafNodes(root.right, result);
		
	}

	private void visitLeftBoundary(Node root, List<Integer> result) {
		if(root == null)
			return;
		
		if(root.left != null)
		{
			result.add(root.val);
			visitLeftBoundary(root.left, result);
		}
		else if(root.right != null)
		{
			result.add(root.val);
			visitLeftBoundary(root.right, result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoundaryOfBinaryTree b = new BoundaryOfBinaryTree();
		b.createBinaryTree();
		
		List<Integer> result = b.boundaryOfBinaryTree(root);
		
		for(int i : result)
		{
			System.out.print(i + " ");
		}
	}

}
