import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no 
 * two queens attack each other.
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * Each solution contains a distinct board configuration of the n-queens' placement, where 
 * 'Q' and '.' both indicate a queen and an empty space, respectively.
 * 
 *
 * Input: n = 4
 * Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
 */
public class NQueens {
	
	public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for(int i = 0; i < board.length; i++)
        {
        	for(int j = 0; j < board[0].length; j++)
        	{
        		board[i][j] = '.';
        	}
        }
        
        placeQueens(board, 0, 0, 0, 4, result);
        return result;
    }
	
	public List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
	
	public void placeQueens(char[][] board, int row, int col, int queen_placed_so_far, int total_queens, List<List<String>> result)
	{
		if(queen_placed_so_far == total_queens)
		{
			result.add(construct(board));
			return;
		}
		
		if(col == board[0].length)
		{
			row++;
			col = 0;
		}
		
		if(row == board.length)
		{
			return;
		}
		
		if(isItSafeToPlaceQueen(board, row, col))
		{
			// do
			board[row][col] = 'Q';
			
			// recur
			placeQueens(board, row, col + 1, queen_placed_so_far + 1, total_queens, result);
			
			// undo
			board[row][col] = '.';
		}
		
		// if we are not able to place queen, we check for next col
		placeQueens(board, row, col + 1, queen_placed_so_far, total_queens, result);
		
	}

	private boolean isItSafeToPlaceQueen(char[][] board, int row, int col) {
		
		// check vertically up for any queen placed
		int r = row - 1;
		int c = col;
		
		while(r >= 0)
		{
			if(board[r][c] =='Q')
			{
				return false;
			}
			r--;
		}
		
		// check horizontally left
		r = row;
		c = col - 1;
		
		while(c >= 0)
		{
			if(board[r][c] =='Q')
			{
				return false;
			}
			c--;
		}
		
		// check diagonally left
		r = row - 1;
		c = col - 1;
		
		while(r >= 0 && c >= 0)
		{
			if(board[r][c] =='Q')
			{
				return false;
			}
			r--;
			c--;
		}
		
		
		// check diagonally right
		r = row - 1;
		c = col + 1;
		
		
		while(r >= 0 && c < board[0].length)
		{
			if(board[r][c] =='Q')
			{
				return false;
			}
			r--;
			c++;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[][] board = new String[4][4];
		
		NQueens n = new NQueens();
		List<List<String>> result = n.solveNQueens(1);
		
		for(List<String> res : result)
		{
			System.out.println(res);
		}
		

	}

}
