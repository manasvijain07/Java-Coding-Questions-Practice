import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// we have to check if source is connected to destination int an undirected graph - DFS

class Graph9
{
	int n;
	Stack<Integer> stack;
	List<List<Integer>> adjacencyList;
	boolean[] visited;
	
	public Graph9(int n)
	{
		this.n = n;
		stack = new Stack<>();
		adjacencyList = new ArrayList<List<Integer>>();
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++)
		{
			adjacencyList.add(i, new ArrayList<Integer>());
		}
	}
	
	public void addEdges(int start, int end)
	{
		adjacencyList.get(start).add(end);
	}
	
	public boolean findReachability(int start, int end)
	{
		dfs(start);
		return visited[end];
	}
	
	public int getChilds(int val)
	{
		List<Integer> childs = adjacencyList.get(val);
		
		for(int child: childs)
		{
			if(!visited[child])
				return child;
		}
		return -1;
	}
	
	public void dfs(int start)
	{
		stack.push(start);
		visited[start] = true;
		
		while(!stack.isEmpty())
		{
			int val = getChilds(stack.peek());
			
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
}

public class CheckIfSourceConnectedToDestinationDirectedGraph {
	public static void main(String []a)
	{
		int n = 10;
		Graph9 g = new Graph9(n);
		
		g.addEdges(0, 1);
		g.addEdges(0, 2);
		g.addEdges(1, 3);
		g.addEdges(4, 5);
		g.addEdges(5, 6);
		g.addEdges(8, 9);
		
		System.out.println(g.findReachability(0, 9));
	}
}
