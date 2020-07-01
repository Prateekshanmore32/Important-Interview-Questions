package interviewQuestions;
import java.util.*;
public class LargestSumSubarray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int maxSum=largestSumSubarray(a);
		System.out.println(maxSum);
		
		int maxSum1=largestSumSubarray1(a);
		System.out.println(maxSum1);
		
		int maxSum2=largestSumSubarray2(a);
		System.out.println(maxSum2);
	}
	public static int largestSumSubarray(int a[]) {
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=a[k];
				}
				maxSum=Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}
	public static int largestSumSubarray1(int a[]) {
		int ans=Integer.MIN_VALUE;
		int sum[]=new int[a.length];
		sum[0]=a[0];
		for(int i=1;i<a.length;i++) {
			sum[i]=a[i]+sum[i-1];
		}
		
		for(int i=0;i<a.length;i++) {
			int sum1=0;
			for(int j=0;j<a.length;j++) {
				sum1=sum[j]-sum[i]+a[i];
				ans=Math.max(ans, sum1);
			}
		}
		return ans;
	}
	
	public static int largestSumSubarray2(int a[]) {
		int current=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			
			current+=a[i];
			
			if(current<0) {
				current=0;
			}
			
			maxSum=Math.max(maxSum, current);
		}
		
		
		return maxSum;
	}

}
//5
//1 -1 2 3 0
//5
