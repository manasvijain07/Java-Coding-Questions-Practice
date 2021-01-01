import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph14
{
	List<List<Integer>> adjacencyList;
	int n;
	Queue<Integer> queue;
	boolean[] visited;
	
	public Graph14(int n)
	{
		this.n = n;
		queue = new LinkedList<Integer>();
		adjacencyList = new ArrayList<List<Integer>>();
		visited = new boolean[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			adjacencyList.add(i, new ArrayList<Integer>());
		}
	}
	
	public void addEdges(int start, int end)
	{
		adjacencyList.get(start).add(end);
	}
	
	public int getMinDistance(int start, int end)
	{
		if(start == end)
			return 0;
		
		int distance = 0;
		
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty())
		{
			int size = queue.size();
			
			while(size > 0)
			{
				int val = queue.poll();
				
				List<Integer> children = adjacencyList.get(val);
	
				for(int child: children)
				{
					if(child == end)
						return ++distance;
					if(!visited[child])
					{
						queue.add(child);
						visited[child] = true;
					}
				}
				
				size--;
			}
			distance++;
		}
		
		return -1;
	}
}

public class MinDistanceSourceAndDestinationUndirectedGraph {

	public static void main(String []a)
	{
		Graph14 g = new Graph14(6);
	
		g.addEdges(0, 1);
		g.addEdges(1, 2);
		g.addEdges(2, 3);
		g.addEdges(3, 5);
		g.addEdges(0, 4);
		g.addEdges(4, 5);
		
		System.out.println(g.getMinDistance(0, 5));
		
	}
	
}
