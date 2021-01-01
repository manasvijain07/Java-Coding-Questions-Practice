import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// using DFS with ajacency list

class Graph6
{
	Stack<Integer> stack;
	List<List<Integer>> adjacencyList;
	boolean [] visited;
	int nodes;
 	
	public Graph6(int n)
	{
		nodes = n;
		stack = new Stack<>();
		adjacencyList = new ArrayList<List<Integer>>();
		visited = new boolean[nodes];
		
		for(int i = 0; i < nodes; i++)
		{
			adjacencyList.add(i, new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int start, int end)
	{
		adjacencyList.get(start).add(end);
	}
	
	public int getChilds(int top)
	{
		List<Integer> childs = adjacencyList.get(top);
		
		for(int child : childs)
		{
			if(!visited[child])
			{
				return child;
			}
		}
		return -1;
	}
	
	public void dfs()
	{
		stack.push(0);
		visited[0] = true;
		
		while(!stack.isEmpty())
		{
			int top = stack.peek();
			int val = getChilds(top);
			
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
	}
	
	public boolean isConnected(int n, boolean usingRecursion) {
		for(int i = 0; i < n; i++)
		{
			if(usingRecursion)
				dfsRecursive(0);
			else
				dfs();
			for(boolean j : visited)
			{
				if(!j)
				{
					return false;
				}	
			}
			Arrays.fill(visited, false);
		}
		return true;
	}
	
	public void dfsRecursive(int start)
	{
		visited[start] = true;
		List<Integer> childs = adjacencyList.get(start);
		
		for(int child: childs)
		{
			if(!visited[child])
			{
				dfsRecursive(child);
			}
		}
	}
}


public class CheckDirectedGraphIsStronglyConnected {

	public static void main(String []a)
	{
		int n = 8;
		Graph6 g = new Graph6(n);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		
		//Iterative method
		System.out.println(g.isConnected(n, false));
		
		//Recursive method
		System.out.println("\nRecursive approach - ");
		System.out.println(g.isConnected(n, true));
		
		
	}
}
