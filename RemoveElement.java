package interviewQuestions;
import java.util.*;
public class RemoveElement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int index=removeElement(a,x);
		System.out.println(index);
	}
	public static int removeElement(int a[],int x) {
			int index=0;
			for(int i: a) {
				if(i!=x) {
					a[index++]=i;
				}
			}
			return index;
	}

}
//5
//1 2 2 3 4 
//2
//3
