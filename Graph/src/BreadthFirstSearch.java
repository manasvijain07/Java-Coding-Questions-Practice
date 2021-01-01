
import java.util.LinkedList;
import java.util.Queue;

//For BFS - we use Queue

class Vertex1
{
	char label;
	boolean wasVisited;
	
	public Vertex1(char label) {
		this.label = label;
		wasVisited = false;
	}
}

class Graph1
{
	private final int MAX_VERTS = 20; 
	
	Vertex1 []vertexList;
	Queue<Integer> queue;
	int[][] adjacencyMatrix;
	int nVerts;
	
	public Graph1()
	{
		vertexList = new Vertex1[MAX_VERTS];
		adjacencyMatrix = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		queue = new LinkedList<>();
	}
	
	public void addVertex(char v)
	{
		vertexList[nVerts++]= new Vertex1(v);
	}
	
	public void addEdges(int start, int end)
	{
		adjacencyMatrix[start][end] = 1;
		adjacencyMatrix[end][start] = 1;
	}
	
	public int getNeighbours(int v)
	{
		for(int i = 0 ; i < nVerts; i++)
		{
			if(vertexList[i].wasVisited == false && adjacencyMatrix[i][v] == 1)
			{
				return i;
			}
		}
		return -1;
	}
	
	public void bfs()
	{
		vertexList[0].wasVisited = true;
		displayVertex(0);
		queue.add(0);
		int v2;
		
		while(!queue.isEmpty())
		{
			int c = queue.remove();
			
			while((v2 = getNeighbours(c)) != -1)
			{
				vertexList[v2].wasVisited = true;
				displayVertex(v2);
				queue.add(v2);
			}	
		}
	}
	
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label + " ");
	}
	
}

public class BreadthFirstSearch {
	
	public static void main(String a[])
	{
		Graph1 graph = new Graph1();
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
