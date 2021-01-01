// we use dfs + a new boolean array - recursive. 

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Graph11
{
	int n;
	Stack<Integer> stack;
	boolean[] visited;
	boolean[] recursive;
	List<List<Integer>> adjacencyList;
	
	public Graph11(int n)
	{
		this.n = n;
		adjacencyList = new ArrayList<>();
		recursive = new boolean[n];
		visited = new boolean[n];
		stack = new Stack<>();
		
		for(int i = 0; i < n; i++)
		{
			adjacencyList.add(i, new ArrayList<>());
		}
	}
	
	public void addEdges(int start, int end)
	{
		adjacencyList.get(start).add(end);
	}
	
	public boolean isCyclePresent(int start)
	{
		if(recursive[start])
			return true;
		
		if(visited[start])
			return false;
		
		visited[start] = true;
		recursive[start] = true;
		
		List<Integer> children = adjacencyList.get(start);
		
		for(int child : children)
		{
			if(isCyclePresent(child))
			{
				return true;
			}
		}
		
		recursive[start] = false;
		return false;
	}
	
	public boolean checkForCycles()
	{
		for(int i = 0; i < n; i++)
		{
			if(isCyclePresent(i))
				return true;
		}
		return false;
	}
}

public class CheckForCycleInDirectedGraphUsingDFS {

	public static void main(String [] a)
	{
		Graph11 g = new Graph11(3);
		
		g.addEdges(0, 1);
		g.addEdges(1, 2);
//		g.addEdges(2, 0);
		
		System.out.println(g.checkForCycles());
	}
}
