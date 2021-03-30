import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST. If the given node has no in-order successor in the tree, return null.
 * The successor of a node p is the node with the smallest key greater than p.val
 *
 * Input: root = [2,1,3], p = 1
 * Output: 2
 * Explanation: 1's in-order successor node is 2. Note that both p and the return value is of TreeNode type.
 *
 */
public class InorderSuccessorInBST {
	
	// TC - O(n)	SC - O(N)
	public Node getSuccessor(Node root, Node p)
	{
		inorder(root);
		for(int i = 0; i < inorderList.size(); i++)
		{
			if(inorderList.get(i).val == p.val && i < inorderList.size() -1)
			{
				return inorderList.get(i+1);
			}
		}
		return null;
	}
	
	
	List<Node> inorderList = new ArrayList<>(); 
	public void inorder(Node root)
	{
		if(root == null)
			return;
		
		inorder(root.left);
		inorderList.add(root);
		inorder(root.right);
	}
	
	// TC - O(N)	SC- O(1)
	public Node getSuccessorOptimized(Node root, Node p)
	{
		Node successor = null;
		
		while(root != null)
		{
			if(root.val <= p.val)
			{
				root = root.right;
			}
			else
			{
				successor = root;
				root = root.left;
			}
		}
		return successor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InorderSuccessorInBST b = new InorderSuccessorInBST();
		Node root = new Node(2);
		Node sec = new Node(1);
		Node third = new Node(3);
		
		root.left = sec;
		root.right = third;
		
		Node p = new Node(1);
		Node result = b.getSuccessorOptimized(root, p);
		if(result != null)
			System.out.print(result.val);
		else
			System.out.print("null");
	}

}
