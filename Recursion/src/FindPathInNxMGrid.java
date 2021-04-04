
public class FindPathInNxMGrid {
	
	public int getNumberOfPath(int m, int n)
	{
		if(m == 1 || n == 1)
			return 1;
		
		return getNumberOfPath(m-1, n) + getNumberOfPath(m, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindPathInNxMGrid f = new FindPathInNxMGrid();
		System.out.print(f.getNumberOfPath(4, 4));
	}

}
