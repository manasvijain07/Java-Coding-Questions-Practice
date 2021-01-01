//For DFS - we use Stack

import java.util.Stack;

class Vertex
{
	char label;
	
	//to check for unvisited vertexes
	boolean wasVisited;
	
	public Vertex(char label)
	{
		this.label = label;
		wasVisited = false;	
	}
}

class Graph
{
	public final int MAX_VERTS = 20;
	//we need vertex
	Vertex []vertexList;
	
	//we need to store edges
	int [][] adjacencyMatrix;
	
	//Stack for dfs operation
	Stack<Integer> stack;
	
	//count for storing no of vertex
	int nVertex;
	
	public Graph()
	{
		vertexList = new Vertex[MAX_VERTS];
		stack = new Stack<Integer>();
		nVertex = 0;
		adjacencyMatrix = new int[MAX_VERTS][MAX_VERTS];
	}
	
	public void addVertex(char c)
	{
		vertexList[nVertex++] = new Vertex(c);
	}
	
	public void addEdges(int start, int end)
	{
		adjacencyMatrix[start][end] = 1;
		adjacencyMatrix[end][start] = 1;
	}
	
	public void displayVertex(int v)
	{
		System.out.println(vertexList[v].label + " ");
	}
	
	public int getAdjacentVertex(int v)
	{
		//loop through all the vertex to get the neighboring vertex
		for(int j = 0; j < nVertex ; j++)
		{
			if(vertexList[j].wasVisited == false && adjacencyMatrix[v][j] == 1)
			{
				return j;
			}
		}
		return -1;
	}
	
	public void dfs()
	{
		vertexList[0].wasVisited = true;
		stack.push(0);
		displayVertex(0);
		
		while(!stack.isEmpty())
		{
			int v = getAdjacentVertex(stack.peek());
			
			if(v == -1)
			{
				stack.pop();
			}
			else
			{
				vertexList[v].wasVisited = true;
				displayVertex(v);
				stack.push(v);
			}
		}
	}
}

public class DepthFirstSearch
{
	
	public static void main(String a[])
	{
		Graph graph = new Graph();
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