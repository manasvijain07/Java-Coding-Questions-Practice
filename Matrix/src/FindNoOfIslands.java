
public class FindNoOfIslands {
	
	public int findCount(int[][] grid)
	{
		if(grid.length == 0)
            return 0;
        
        int count = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                count += dfs(grid, i, j);
            }
        }
        return count;
    }
    
    public int dfs(int[][] grid, int i, int j)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
            return 0;
        
        grid[i][j] = '0';
        
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
        return 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {
				{0, 1, 0, 0, 1},
				{1, 1, 0, 0, 0},
				{1, 0, 0, 1, 0},
				{0, 0, 0, 0, 0},
				{1, 0, 0, 0, 1}
		};
		
		FindNoOfIslands f = new FindNoOfIslands();
		System.out.print(f.findCount(matrix));
	}

}
