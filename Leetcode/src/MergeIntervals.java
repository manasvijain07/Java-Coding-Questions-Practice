
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        
        int[][] res = new int[intervals.length][2];
        int k = 0;
        for(int i = 0; i < intervals.length-1; i++)
        {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(intervals[i+1][0] < end)
            {
                res[k][0] =  start;
                res[k][1] = intervals[i+1][1];
            }
            else
            {
                res[k][0] =  start;
                res[k][1] = end;
            }
        }
        
        public static void main(String a[])
        {
        	int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};;
        	
        	MergeIntervals m = new MergeIntervals();
        	int[][] res = m.merge(intervals);
        	
        	for(int[] i : res)
        	{
        		System.out.print(i[0] +", "+ i[1]);
        		
        	}
        	
        }
}
