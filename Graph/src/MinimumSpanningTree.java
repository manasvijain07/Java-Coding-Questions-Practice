//For MST - we will use DFS

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Vertex4
{
	char label;
	boolean wasVisited;
	
	public Vertex4(char label)
	{
		this.label = label;
		wasVisited = false;
	}
}

class Graph4
{
	private final int MAX_VERTS = 20;
	Vertex4[] vertexList;
	Stack<Integer> stack;
	int nVerts;
	List<List<Integer>> adjacencyList;
	
	public Graph4(int n)
	{
		nVerts = 0;
		stack = new Stack<>();
		vertexList = new Vertex4[n]; 
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
		vertexList[nVerts++] = new Vertex4(c);
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
	
	public void mst()
	{
		vertexList[0].wasVisited = true;
		stack.add(0);
		
		while(!stack.isEmpty())
		{
			int current = stack.peek();
			int v = getNeighbours(current);
			
			if(v == -1)
			{
				stack.pop();
			}
			else
			{
				stack.add(v);
				displayVertex(current);
				displayVertex(v);
				System.out.print(" ");
				vertexList[v].wasVisited = true;
			}
		}
	}
	
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label);
	}
	
}

public class MinimumSpanningTree {
	public static void main(String [] a)
	{
		Graph4 graph = new Graph4(6);
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		
		graph.addEdges(0, 1);
		graph.addEdges(0, 2);
		graph.addEdges(0, 3);
		graph.addEdges(0, 4);
		graph.addEdges(1, 2);
		graph.addEdges(1, 3);
		graph.addEdges(1, 4);
		graph.addEdges(2, 3);
		graph.addEdges(2, 4);
		graph.addEdges(3, 4);
		
		System.out.println("Minimum Spanning Tree - ");
		graph.mst();
	}
}
