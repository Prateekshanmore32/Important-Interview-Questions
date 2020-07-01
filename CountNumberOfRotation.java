package interviewQuestions;
import java.util.*;
public class CountNumberOfRotation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int count=countNumberOfRotation(a,n);
		System.out.println(count);
	}

	public static int countNumberOfRotation(int a[],int n) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			if(a[low]<a[high]) {
				return low;
			}
			int mid=(low+high)/2;
			int next=(mid+1)%n;
			int prev=(mid+n-1)%n;
			if(a[mid]<=a[next] && a[mid]<=a[prev]) {
				return mid;
			}
			if(a[mid]<=a[high]) {
				high=mid+1;
			}
			if(a[mid]>=a[low]) {
				low=mid-1;
			}
		}
		return -1;
	}
}
