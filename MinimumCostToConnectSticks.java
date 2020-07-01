package interviewQuestions;
import java.util.*;
public class MinimumCostToConnectSticks {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int minCost=findMinimumCostToConnectSticks(a);
		System.out.println(minCost);
	}
	public static int findMinimumCostToConnectSticks(int a[]) {
		int cost=0;
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i:a) {
			pq.add(i);
		}
		while(pq.size()>1) {
			
			int	sum=pq.remove() +pq.remove();
			cost+=sum;
			pq.add(sum);
		}
		return cost;
	}

}
//
//3
//2 4 3
//14


//4
//1 8 3 5
//30
