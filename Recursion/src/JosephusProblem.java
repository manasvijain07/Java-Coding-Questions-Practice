
/**
 * 
 * Josephus Problem
 * https://www.youtube.com/watch?v=46zD5d9y9b4&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=9
 * 
 * TC - O(n)
 * 
 * There are n people standing in a circle waiting to be executed. 
 * The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. 
 * In each step, a certain number of people are skipped and the next person is executed. 
 * The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), 
 * until only the last person remains, who is given freedom. Given the total number of persons n and a number k which 
 * indicates that k-1 persons are skipped and kth person is killed in circle. The task is to choose the place in the 
 * initial circle so that you are the last one remaining and so survive.
 * 
 * 
 * For example, if n = 5 and k = 2, then the safe position is 3. Firstly, the person at position 2 is killed, 
 * then person at position 4 is killed, then person at position 1 is killed. Finally, the person at position 5 is killed. 
 * So the person at position 3 survives. 
 * 
 * If n = 7 and k = 3, then the safe position is 4. The persons at positions 3, 6, 2, 7, 5, 1 are killed in order, 
 * and person at position 4 survives.
 *
 */
public class JosephusProblem {
	
	public int getWinningPositionHelper(int n, int k)
	{
		if(n == 1)
			return 0;	// if there is only one person his index is 0 
		
		return (getWinningPositionHelper(n - 1, k) + k) % n;	
	}
	
	public int getWinningPosition(int n, int k)
	{
		return 1 + getWinningPositionHelper(n, k);	//adding 1 to change indexing 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14, k = 2;
		System.out.print(new JosephusProblem().getWinningPosition(n, k));
		
	}

}
