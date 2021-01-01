import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// We have to find number of connected components in graph - DFS

class Graph7
{
	Stack<Integer> stack;
	List<List<Integer>> adjacencyList;
	boolean visited[];
	int n;
	
	public Graph7(int n)
	{
		this.n = n;
		stack = new Stack<Integer>();
		adjacencyList = new ArrayList<List<Integer>>();
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++)
		{
			adjacencyList.add(i, new ArrayList<>());
		}
	}
	
	public void addEdges(int start, int end)
	{
		adjacencyList.get(start).add(end);
		adjacencyList.get(end).add(start);
	}
	
	public int findConnectedComponents()
	{
		int count = 0;
		for(int i = 0; i < n ; i++)
		{
			if(!visited[i])
				{
					dfs(i);
					count++;
				}
		}
		return count;
	}
	
	public int getChildNode(int top)
	{
		List<Integer> childs = adjacencyList.get(top);
		
		for(int child: childs)
		{
			if(!visited[child])
			{
				return child;
			}
		}
		return -1;
	}
	
	public void dfs(int start) {
		stack.push(start);
		visited[start] = true;
		
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
	}
}

public class FindConnectedComponentsCountInUndirectedGraph {

	public static void main(String []a)
	{
		int n = 10;
		Graph7 g = new Graph7(n);
		
		g.addEdges(0, 1);
		g.addEdges(0, 2);
		g.addEdges(1, 3);
		g.addEdges(4, 5);
		g.addEdges(5, 6);
		g.addEdges(8, 9);
		
		System.out.println(g.findConnectedComponents());
	}
}
