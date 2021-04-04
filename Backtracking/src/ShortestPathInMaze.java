
public class ShortestPathInMaze {
	
	public static int getShortestPath(int[][] a, int[] start, int[] destination)
	{
		int rows = a.length;
		int cols = a[0].length;
		
		boolean[][] visited = new boolean[rows][cols]; 
		return getPath(a, start[0], start[1], destination[0], destination[1], visited);
	}
	
	public static boolean isValid(int[][] a, int i, int j, boolean[][] visited)
	{
		return (i >=0 && j >= 0 && i < a.length && j < a[0].length && a[i][j] == 1 && !visited[i][j]);
	}
	
	public static int getPath(int[][] a, int i, int j, int x, int y, boolean[][] visited)
	{
		if(!isValid(a, i, j, visited))
			return 100000;
		
		if(i == x && j == y)
		{
			return 0;
		}
		
		visited[i][j] = true;
		int left = getPath(a, i, j - 1 , x, y, visited) + 1;
		int right = getPath(a, i, j + 1, x, y, visited) + 1;
		int top = getPath(a, i + 1, j, x, y, visited) + 1;
		int down = getPath(a, i - 1, j, x, y, visited) + 1;
		
		visited[i][j] = false;
		return Math.min(Math.min(left, right), Math.min(top, down)); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[][] = {
					{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
					{0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
					{0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
					{1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
					{0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
					{1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
					{0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
					{0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
					{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
					{0, 0, 1, 0, 0, 1, 1, 0, 0, 1}
					};
			
			int[] start = {0,0}, destination = {8,0};
			
			System.out.print(getShortestPath(a, start, destination));
			
	}

}
