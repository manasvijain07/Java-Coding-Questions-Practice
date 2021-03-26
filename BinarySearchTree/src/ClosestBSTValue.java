
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
	
public class ClosestBSTValue {
	
	double min = Double.MAX_VALUE;
    int min_node = 0;
	public int closestValue(TreeNode1 root, double target) {
        if(root.val == target)
        	return root.val;
        double val = Math.abs(root.val - target);
        if(val < min)
        {
            min = val;
            min_node = root.val;
            if(root.val > target && root.left != null)
            {
            	min_node = closestValue(root.left, target);
            }
            else if(root.val < target && root.right != null)
            {
            	min_node = closestValue(root.right, target);
            }
        }
        return min_node;
    }
	
	
	public void preOrder(TreeNode1 node)
	{
		if(node == null)
			return;
		
		System.out.print(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClosestBSTValue c = new ClosestBSTValue();
		TreeNode1 root = new TreeNode1(8);
		TreeNode1 sec = new TreeNode1(1);
//		TreeNode third = new TreeNode(5);
//		TreeNode forth = new TreeNode(1);
//		TreeNode fifth = new TreeNode(3);
		
		root.left = sec;
//		root.right = third;
//		sec.left = forth;
//		sec.right = fifth;
		
		c.preOrder(root);
		
		System.out.print("\n" + c.closestValue(root, 6.0));
		
	}

}
