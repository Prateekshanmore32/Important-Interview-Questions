package interviewQuestions;
import java.util.*;
public class KthClosest {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int points[][]=new int[5][5];
		int k=sc.nextInt();
		int ans[][]=kClosest(points,k);
	}

	public static int[][] kClosest(int[][] points, int k) {
		PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
		for(int i[]:points) {
			pq.add(i);
			if(pq.size()>k) {
				pq.remove();
			}
		}
		int result[][]=new int[k][2];
		while(k-->0) {
			result[k]=pq.remove();
		}
		return result;
	}

}
