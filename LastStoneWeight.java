package interviewQuestions;
import java.util.*;
public class LastStoneWeight {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int lsw=findLastStoneWeight(a);
		System.out.println(lsw);

	}
	public static int findLastStoneWeight(int a[]) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i:a) {
			pq.add(-i);
		}
		while(pq.size()>1) {
			int stone1=-pq.remove();
			int stone2=-pq.remove();
			if(stone1!=stone2) {
				pq.add(-(stone1-stone2));
			}
		}
		return  pq.size()==0?0:-pq.remove();
	}

}


//6
//2 7 4 1 8 1 
//1


//2
//1 1
//0
