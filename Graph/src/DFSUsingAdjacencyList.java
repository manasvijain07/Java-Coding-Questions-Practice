import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Vertex2
{
	char label;
	boolean wasVisited;
	
	public Vertex2(char label)
	{
		this.label = label;
		wasVisited = false;
	}
}

class Graph2
{
	private final int MAX_VERTS = 20;
	Vertex2[] vertexList;
	Stack<Integer> stack;
	int nVerts;
	List<List<Integer>> adjacencyList;
	
	public Graph2(int n)
	{
		nVerts = 0;
		stack = new Stack<>();
		vertexList = new Vertex2[n]; 
		adjacencyList = new ArrayList<>();
		
		for(int i = 0 ; i < n ; i++)
		{
			adjacencyList.add(i, new ArrayList<Integer>());
		}
		
	}
	
	public void addEdges(int start, int end)
	{
		adjacencyList.get(start).add(end);
		adjacencyList.get(end).add(start);
		
	}
	
	public void addVertex(char c)
	{
		vertexList[nVerts++] = new Vertex2(c);
	}
	
	public int getNeighbours(int v) {
		List<Integer> childs = adjacencyList.get(v);
		for(int child: childs)
		{
			if(vertexList[child].wasVisited == false)
			{
				return child;
			}
		}
		return -1;
	}
	
	public void dfs()
	{
		vertexList[0].wasVisited = true;
		stack.add(0);
		displayVertex(0);
		
		while(!stack.isEmpty())
		{
			int v = getNeighbours(stack.peek());
			
			if(v == -1)
			{
				stack.pop();
			}
			else
			{
				stack.add(v);
				vertexList[v].wasVisited = true;
				displayVertex(v);
			}
		}
	}
	
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label + " ");
	}
	
}

public class DFSUsingAdjacencyList {
	public static void main(String [] a)
	{
		Graph2 graph = new Graph2(6);
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
		graph.dfs();
	}
}
