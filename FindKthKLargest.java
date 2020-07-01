package interviewQuestions;
import java.util.*;
public class FindKthKLargest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int ans=findKthLargest(a,k);
		System.out.println(ans);
	}

	public static int findKthLargest(int[] a, int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();  //min heap;
		for(int i:a) {
			pq.add(i);
			if(pq.size()>k) {
				pq.remove();
			}
		}
		return pq.remove();
	}
	

}
//5
//1 2 3 4 5 
//3
//3


//5
//6 5 8 9 1
//2
//8
