//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//class TreeNode
//{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	
//	TreeNode(int val)
//	{
//		this.val = val;
//		this.left = null;
//		this.right = null;
//	}
//}
//
//
//public class MorrisTraversalInorder {
//	
//	public void inorderTraversal(TreeNode root)
//	{
//		TreeNode current, next;
//		current = root;
//		
//		while(current != null)
//		{
//			if(current.left == null)
//			{
//				System.out.print(current.val + " ");
//				current = current.right;
//			}
//			else
//			{
//				next = current.left;
//				
//				while(next.right != null && next.right != current)
//				{
//					next = next.right;
//				}
//				
//				if(next.right == null)
//				{
//					next.right = current;
//					current = current.left;
//				}
//				else
//				{
//					next.right = null;
//					System.out.print(current.val + " ");
//					current = current.right;
//					
//				}
//			}
//		}
//	}
//	
//	public void preorderTraversal(TreeNode root)
//	{
//		TreeNode current, next;
//		current = root;
//		
//		while(current != null)
//		{
//			if(current.left == null)
//			{
//				System.out.print(current.val + " ");
//				current = current.right;
//			}
//			else
//			{
//				next = current.left;
//				
//				while(next.right != null && next.right != current)
//				{
//					next = next.right;
//				}
//				
//				if(next.right == null)
//				{
//					System.out.print(current.val + " ");
//					next.right = current;
//					current = current.left;
//				}
//				else
//				{
//					next.right = null;
//					current = current.right;
//					
//				}
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		TreeNode root = new TreeNode(50);
//		TreeNode node1 = new TreeNode(30);
//		TreeNode node2 = new TreeNode(70);
//		TreeNode node3 = new TreeNode(20);
//		TreeNode node4 = new TreeNode(45);
//		TreeNode node5 = new TreeNode(65);
//		TreeNode node6 = new TreeNode(90);
//		TreeNode node7 = new TreeNode(10);
//		TreeNode node8 = new TreeNode(22);
//		
//		root.left = node1;
//		root.right = node2;
//		
//		node1.left = node3;
//		node1.right = node4;
//		
//		node2.left = node5;
//		node2.right = node6;
//		
//		node3.left = node7;
//		node3.right = node8;
//		
//		MorrisTraversalInorder m = new MorrisTraversalInorder();
//		System.out.println("Inorder traversal - ");
//		m.inorderTraversal(root);
//		System.out.println("\n\nPreorder traversal - ");
//		m.preorderTraversal(root);
//		
//	}
//}
