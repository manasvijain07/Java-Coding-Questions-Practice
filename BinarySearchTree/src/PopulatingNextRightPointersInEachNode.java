import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Populating Next Right Pointers in Each Node
 * 
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. 
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.
 * 
 * Input: root = [1,2,3,4,5,6,7]
 * Output: [1,#,2,3,#,4,5,6,7,#]
 * Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
 *
 */

class TreeNode4 {
      int val;
      TreeNode4 left;
      TreeNode4 right;
      TreeNode4 next;
      TreeNode4() {}
      TreeNode4(int val) { this.val = val; }
      TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
          this.val = val;
          this.left = left;
          this.right = right;
          this.next = null;
      }
}
public class PopulatingNextRightPointersInEachNode {
	
	// TC - O(n)   SC - O(1)
	public TreeNode4 connectWithPreviouslyEstablishedNextPointers(TreeNode4 root)
	{
		if(root == null)
            return root;
        
        TreeNode4 leftNode = root;
        
        while(leftNode != null && leftNode.left != null)
        {
            populateNextLevel(leftNode);
            leftNode = leftNode.left;
        }
        return root;
    }
    
    public void populateNextLevel(TreeNode4 node)
    {
        TreeNode4 itr = node;
        
        while(itr != null)
        {
            itr.left.next = itr.right;
            if(itr.next != null)
            {
                itr.right.next = itr.next.left;
            }
            itr = itr.next;
        }
    }
	
    // TC - O(n)   SC - O(N)
	public TreeNode4 connectWithBreadthFirstSearch(TreeNode4 root)
	{
		if(root == null)
            return root;
        
        Queue<TreeNode4> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode4 temp = queue.poll();
                if(i < size - 1)
                {
                    temp.next = queue.peek();
                }
            
            
                if(temp.left != null)
                {
                    queue.add(temp.left);
                }

                if(temp.right != null)
                {
                    queue.add(temp.right);
                }
            }
        }
        return root;
	}
	
	public void preOrder(TreeNode4 node)
	{
		if(node == null)
			return;
		
		System.out.print(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PopulatingNextRightPointersInEachNode p = new PopulatingNextRightPointersInEachNode();
		TreeNode4 root = new TreeNode4(1);
		TreeNode4 sec = new TreeNode4(2);
		TreeNode4 third = new TreeNode4(3);
		TreeNode4 forth = new TreeNode4(4);
		TreeNode4 fifth = new TreeNode4(5);
		TreeNode4 sixth = new TreeNode4(6);
		TreeNode4 seventh = new TreeNode4(7);
		
		root.left = sec;
		root.right = third;
		sec.left = forth;
		sec.right = fifth;
		third.right = seventh;
		
		TreeNode4 result1 = p.connectWithBreadthFirstSearch(root);
		TreeNode4 result2 = p.connectWithPreviouslyEstablishedNextPointers(root);
		
	}

}
