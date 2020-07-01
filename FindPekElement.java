package interviewQuestions;
import java.util.*;
public class FindPekElement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}

		int index=findPeekElement(nums);
		System.out.println(index);
	}
	public static int findPeekElement(int nums[]) {
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int mid=left+(right-left)/2;
			if(nums[mid]<nums[mid+1]) {
				left=mid+1;
			}
			else {
				right=mid;
			}
		}
		return left;
	}

}
//7
//1 2 1 3 5 6 4              element should be greater than its neighbors
//5
