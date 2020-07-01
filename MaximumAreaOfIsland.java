package interviewQuestions;

public class MaximumAreaOfIsland {

	public int maxAreaOfIsland(int [][]grid) {
		int max=0;
		if(grid==null || grid.length==0) {
			return 0;
		}
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]==1) {
					max=Math.max(max, dfs(i, j , grid));
				}
			}
		}
		return max;
	}

	public int dfs(int i, int j, int[][] grid) {
		if(i<0 || j<0 || grid[i][j]==0 || i>=grid.length || j>=grid[i].length) {
			return 0;
		}
		int count=1;
		grid[i][j]=0;
		count+=dfs(i+1,j,grid);
		count+=dfs(i,j+1,grid);
		count+=dfs(i-1,j,grid);
		count+=dfs(i,j-1,grid);
		return count;
	}
	
}
