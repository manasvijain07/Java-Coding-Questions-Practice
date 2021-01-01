import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Graph13
{
	int n;
	List<List<Integer>> adjacencyList;
	HashMap<Integer, Integer> inDegreeMap;
	Queue<Integer> sourceQueue;
	List<Integer> result;
	
	public Graph13(int n)
	{
		this.n = n;
		adjacencyList = new ArrayList<List<Integer>>();
		inDegreeMap = new HashMap<Integer, Integer>();
		sourceQueue = new LinkedList<Integer>();
		result = new ArrayList<Integer>();
		
		for(int i = 0; i < n ;i ++)
		{
			adjacencyList.add(i, new ArrayList<Integer>());
			inDegreeMap.put(i, 0);
		}
	}
	
	public void addEdges(int start, int end)
	{
		adjacencyList.get(start).add(end);
		inDegreeMap.put(end, inDegreeMap.get(end) + 1);
	}
	
	public List<Integer> getTopologicalSort()
	{
		for(Map.Entry<Integer, Integer> ketSet: inDegreeMap.entrySet())
		{
			if(ketSet.getValue() == 0)
				sourceQueue.add(ketSet.getKey());
		}
		
		while(!sourceQueue.isEmpty())
		{
			int val = sourceQueue.remove();
			result.add(val);
			
			List<Integer> children = adjacencyList.get(val);
			
			for(int child : children)
			{
				inDegreeMap.put(child, inDegreeMap.get(child)-1);
				
				if(inDegreeMap.get(child) == 0)
				{
					sourceQueue.add(child);
				}
			}
		}
		
		if(result.size() == n)
		{
			return result;
		}
		else
		{
			System.out.println("Cycle in graph");
			return new ArrayList<>();
		}
	}
}

public class TopologicalSortUsingAdjacencyList {

	public static void main(String [] a)
	{
		Graph13 g = new Graph13(3);
		
		g.addEdges(0, 1);
		g.addEdges(1, 2);
		g.addEdges(2, 0);
		
		for(int i : g.getTopologicalSort())
			System.out.println(i);
	}
}
