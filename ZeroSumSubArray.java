package interviewQuestions;
import java.util.*;
public class ZeroSumSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean sumZero=zeroSumSubarray(a);
		System.out.println(sumZero);
		}
	public static boolean zeroSumSubarray(int a[]) {
		
		HashSet<Integer>set=new HashSet<>();
		int sum=0;
		for(int i:a) {
			set.add(sum);
			sum+=i;
			if(set.contains(sum)) {
				return true;
			}
		}
		return false;
	}

}


//5
//1 -1 2 3 5
//true


//5
//1 2 3 4 5
//false
