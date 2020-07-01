package interviewQuestions;
import java.util.*;
public class PlusOne {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int ans[]=plusOne(a);
		for(int i:ans) {
			System.out.print(i+" ");
		}
		
	}
	public static int [] plusOne(int n[]) {
		for(int i=n.length-1;i>=0;i--) {
			if(n[i]<9) {
				n[i]++;
				return n;
			}
			n[i]=0;
		}
		int result[]=new int[n.length+1];
		result[0]=1;
		return result;
	}
}
//5
//9
//9
//9
//9
//9
//1 0 0 0 0 0 

//3
//1
//2
//3
//1 2 4 