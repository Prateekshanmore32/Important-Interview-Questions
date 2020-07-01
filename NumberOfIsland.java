package interviewQuestions;
import java.util.*;
public class NumberOfIsland {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
	 int grid[][]=new int[r][c];
	 for(int i=0;i<r;i++) {
		 for(int j=0;j<c;j++) {
			 grid[i][j]=sc.nextInt();
		 }
	 }
	 if(grid==null||grid.length==0) {
		 System.out.println(0);
	 }
	 int numberOfIsland=0;
	 
	 for(int i=0;i<grid.length;i++) {
		 for(int j=0;j<grid[i].length;j++) {
			 if(grid[i][j]=='1') {
				 numberOfIsland+=dfs(grid,i,j);
			 }
		 }
	 }
	 System.out.println(numberOfIsland);
	 
	}
	public static int dfs(int grid[][],int i,int j) {
		if(i<0||i>=grid.length||j<0||j>grid[i].length||grid[i][j]==0)
			return 0;
		dfs(grid,i+1,j);
		dfs(grid,i-1,j);
		dfs(grid,i,j+1);
		dfs(grid,i,j-1);
		return 1;
	}

}
