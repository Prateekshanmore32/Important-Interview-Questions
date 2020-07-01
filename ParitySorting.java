package interviewQuestions;
import java.util.*;
public class ParitySorting {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int ans[]=paritySort(a);
		for(int i:ans) {
			System.out.print(i+" ");
		}

	}
	public static int[] paritySort(int a[]) {
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				int temp=a[index];
				a[index++]=a[i];
				a[i]=temp;
			}
		}
		
		return a;
	}

}

//5
//1 2 3 4 5
//2 4 3 1 5 