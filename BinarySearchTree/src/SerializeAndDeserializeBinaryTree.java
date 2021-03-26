import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
	
	String res = "";
    public String serialize(TreeNode1 root) {
    		if(root == null)
    			res += "null, ";
    		else
    		{
    			res += String.valueOf(root.val) + ",";
    			res = serialize(root.left);
    			res = serialize(root.right);
    		}
    		return res;	
    }
    
    // Decodes your encoded data to tree.
    public TreeNode1 deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<>(Arrays.asList(data_array));
        return rdeserialize(data_list);
    }
    
    public TreeNode1 rdeserialize(List<String> data)
    {
        if(data.get(0).equals("null"))
        {
            data.remove(0);
            return null;
        }
        
        TreeNode1 root = new TreeNode1(Integer.valueOf(data.get(0)));
        data.remove(0);
        root.left = rdeserialize(data);
        root.right = rdeserialize(data);
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializeAndDeserializeBinaryTree p = new SerializeAndDeserializeBinaryTree();
		TreeNode1 root = new TreeNode1(1);
		TreeNode1 sec = new TreeNode1(2);
		TreeNode1 third = new TreeNode1(3);
		TreeNode1 forth = new TreeNode1(4);
		TreeNode1 fifth = new TreeNode1(5);
		
		root.left = sec;
		root.right = third;
		third.left = forth;
		third.right = fifth;
		
		String result = p.serialize(root);
		System.out.print(result);
	}

}
