
public class Sudoku {
	
	public boolean sudokuAutomation(int[][] board)
	{
		return true;
	}
	
	public void display(int[][] board)
	{
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[0].length; j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] board = {
					{0, 2, 3, 0},
					{0, 0, 0, 1},
					{0, 1, 0, 0},
					{2, 4, 10, 0}
			};
			
			Sudoku s = new Sudoku();
			if(s.sudokuAutomation(board))
			{
				s.display(board);
			}
			else
			{
				System.out.print("No such solution exists");
			}
			
	}

}
