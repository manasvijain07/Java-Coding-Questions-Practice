import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Graph is connected when we can reach one node from every other node in the graph
// We have use DFS with adjacency lists to find this out

class Graph5
{
	int nodes;
	Stack<Integer> stack;
	boolean []visited;
	List<List<Integer>> adjacencyList;
	
	public Graph5(int n)
	{
		nodes = n;
		visited = new boolean[n];
		stack = new Stack<>();
		adjacencyList = new ArrayList<>();
		
		for(int i = 0; i < nodes; i++)
		{
			adjacencyList.add(i, new ArrayList<>());
		}
	}
	
	public void addEdge(int start, int end) {
		adjacencyList.get(start).add(end);
		adjacencyList.get(end).add(start);
	}
	
	public int getChildNode(int top)
	{
		List<Integer> childList = adjacencyList.get(top);
		
		for(int child: childList)
		{
			if(!visited[child])
			{
				return child;
			}
		}
		return -1;
	}
	
	public boolean isConnected()
	{
		stack.push(0);
		visited[0] = true;
		
		while(!stack.isEmpty())
		{
			int top = stack.peek();
			int val = getChildNode(top);
			
			if(val == -1)
			{
				stack.pop();
			}
			else
			{
				stack.push(val);
				visited[val] = true;
			}
		}
		
		for(boolean c : visited)
		{
			if(c == false)
			{
				return false;
			}
		}
		return true;
	}
	
}


public class CheckWhetherGraphIsConnected {

	public static void main(String [] a) {
		Graph5 g = new Graph5(7);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		
		System.out.println(g.isConnected());
	}
}
