package interviewQuestions;
import java.util.*;
public class WallsAndGates {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int rooms[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				rooms[i][j]=sc.nextInt();
			}
		}
		int ans[][]=wallsAndGates(rooms);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(rooms[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] wallsAndGates(int [][]rooms){
		
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				if(rooms[i][j]==0) {
					dfs(i,j,0,rooms);
				}
			}
		}
		return rooms;
	}
	public static void dfs(int i,int j, int count, int [][]rooms) {
		
		if(i<0 || i>=rooms.length || j<0 || j>=rooms[i].length || count>rooms[i][j]) {
			return;
		}
		rooms[i][j]=count;
		dfs(i+1,j,count+1,rooms);
		dfs(i,j+1,count+1,rooms);
		dfs(i-1,j,count+1,rooms);
		dfs(i,j-1,count+1,rooms);
	}

}
