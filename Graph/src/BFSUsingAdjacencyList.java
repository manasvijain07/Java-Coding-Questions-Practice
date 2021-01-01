import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Vertex3 
{
	char label;
	boolean wasVisited;
	
	public Vertex3(char label)
	{
		this.label = label;
		wasVisited = false;
	}
}

class Graph3
{ 
	Vertex3 []vertexList;
	Queue<Integer> queue;
	List<List<Integer>> adjacencyList;
	int nVerts;
	
	public Graph3(int n)
	{
		vertexList = new Vertex3[n];
		queue = new LinkedList<>();
		adjacencyList = new ArrayList<List<Integer>>();
		nVerts = 0;
		
		for(int i = 0; i < n; i++)
		{
			adjacencyList.add(i, new ArrayList<Integer>());
		}
	}
	
	public void addVertex(char c)
	{
		vertexList[nVerts++] = new Vertex3(c);
	}
	
	public void addEdges(int start, int end)
	{
		adjacencyList.get(start).add(end);
		adjacencyList.get(end).add(start);
	}
	
	public void bfs() {
		queue.add(0);
		displayVertex(0);
		vertexList[0].wasVisited = true;
		
		while(!queue.isEmpty())
		{
			int v = queue.poll();
			List<Integer> childs = adjacencyList.get(v);
			
			for(int child: childs)
			{
				if(vertexList[child].wasVisited == false)
				{
					queue.add(child);
					vertexList[child].wasVisited = true;
					displayVertex(child);
				}
			}
		}
	}
	
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label + " ");
	}
	
}

public class BFSUsingAdjacencyList {
	public static void main(String []a)
	{
		Graph3 graph = new Graph3(6);
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		
		graph.addEdges(0, 1);
		graph.addEdges(1, 2);
		graph.addEdges(0, 3);
		graph.addEdges(3, 4);
		graph.addEdges(4, 5);
		graph.addEdges(1, 3);
		
		System.out.println("Visits - ");
		graph.bfs();
	}
}
