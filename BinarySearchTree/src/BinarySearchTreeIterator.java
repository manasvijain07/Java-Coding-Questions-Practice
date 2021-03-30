import java.util.ArrayList;
import java.util.List;


/**
 * Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):

 * BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
 * boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
 * int next() Moves the pointer to the right, then returns the number at the pointer.
 * Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.
 *
 * You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.
 * 
 *
 */

public class BinarySearchTreeIterator {
	
	// TC - O(N)	SC - O(N)
	List<Integer> nodeList = new ArrayList<>();
    int i = 0;
    public BinarySearchTreeIterator(Node root) {
        inorder(root);
    }
    
    public void inorder(Node root)
    {
        if(root == null)
            return;
        inorder(root.left);
        nodeList.add(root.val);
        inorder(root.right);
    }
    
    public int next() {
        return nodeList.get(i++);
    }
    
    public boolean hasNext() {
        return i < nodeList.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(7);
		Node sec = new Node(3);
		Node third = new Node(15);
		Node forth = new Node(9);
		Node fifth = new Node(20);
		
		root.left = sec;
		root.right = third;
		third.left = forth;
		third.right = fifth;
		
		BinarySearchTreeIterator bSTIterator = new BinarySearchTreeIterator(root);
		System.out.println(bSTIterator.next());    // return 3
		System.out.println(bSTIterator.next());    // return 7
		System.out.println(bSTIterator.hasNext()); // return True
		System.out.println(bSTIterator.next());    // return 9
		System.out.println(bSTIterator.hasNext()); // return True
		System.out.println(bSTIterator.next());    // return 15
		System.out.println(bSTIterator.hasNext()); // return True
		System.out.println(bSTIterator.next());    // return 20
		System.out.println(bSTIterator.hasNext());	// return False
	}

}
