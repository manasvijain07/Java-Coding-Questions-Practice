import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

//using BDS/ In degree

class Graph12
{
	int n;
	int count;
	List<List<Integer>> adjacencyList;
	Queue<Integer> queue;
	HashMap<Integer, Integer> inDegreeMap;
	
	public Graph12(int n)
	{
		this.n = n;
		adjacencyList = new ArrayList<List<Integer>>();
		queue = new LinkedList<Integer>();
		inDegreeMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n ; i++)
		{
			adjacencyList.add(i, new ArrayList<Integer>());
			inDegreeMap.put(i, 0);
		}
	}
	
	void addEdges(int start, int end)
	{
		adjacencyList.get(start).add(end);
		inDegreeMap.put(end, inDegreeMap.get(end) +1);
	}
	
	void getQueue()
	{
		int val = queue.remove();
		count++;
		List<Integer> children = adjacencyList.get(val);
		
		for(int child: children)
		{
			inDegreeMap.put(child, inDegreeMap.get(child)-1);
			if(inDegreeMap.get(child) == 0)
			{
				queue.add(child);
			}
		}
	}
	
	boolean checkForCycles()
	{
		for(Map.Entry<Integer, Integer> keySet: inDegreeMap.entrySet())
		{
			if(keySet.getValue() == 0)
			{
				queue.add(keySet.getKey());
			}
		}

		while(!queue.isEmpty())
		{
			getQueue();
		}
		return count != n;
	}
}

public class CheckForCycleInDirectedGraphUsingBFS {


	public static void main(String [] a)
	{
		Graph12 g = new Graph12(3);
		
		g.addEdges(0, 1);
		g.addEdges(1, 2);
//		g.addEdges(2, 0);
		
		System.out.println(g.checkForCycles());
	}
}
