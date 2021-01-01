import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//using DFS Recursion

class Graph10
{
	int n;
	Stack<Integer> stack;
	List<List<Integer>> adjacencyList;
	boolean[] visited;
	
	public Graph10(int n)
	{
		this.n = n;
		adjacencyList = new ArrayList<>();
		stack = new Stack<>();
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
	
	public boolean checkForCycles()
	{
		for(int i = 0; i < n; i++)
		{
			if(!visited[i])
			{
				if(ifCyclePresent(i, -1))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	
	//using DFS with recursion
	public boolean ifCyclePresent(int start, int parent)
	{
		visited[start] = true;
		
		List<Integer> children = adjacencyList.get(start);
		
		for(int child: children)
		{
			if(!visited[child])
			{
				ifCyclePresent(child, start);
			}
			else if(child != parent)
			{
				return true;
			}
		}
		return false;
	}
}


public class CheckForCycleInUndirectedGraph {

	public static void main(String a[])
	{
		Graph10 graph = new Graph10(3);
		
		graph.addEdges(0, 1);
		graph.addEdges(1, 2);
		graph.addEdges(2, 0);
		
		System.out.println(graph.checkForCycles());
	}
}
