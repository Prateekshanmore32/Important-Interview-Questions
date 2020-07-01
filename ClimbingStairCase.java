/*Problem description: You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top*/
package interviewQuestions;
import java.util.*;
public class ClimbingStairCase {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ways=climbing(n);
		System.out.println(ways);
	}
	public static int climbing(int n) {
		int a[]=new int[n+1];
		 a[0]=1;
		 a[1]=1;
		 for(int i=2;i<=n;i++) {
			 a[i]=a[i-1]+a[i-2];
		 }
		 return a[n];
	}

}

//2
//2



//3
//3
