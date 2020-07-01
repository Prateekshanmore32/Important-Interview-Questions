package interviewQuestions;
import java.util.*;
public class MoveZeros {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int index=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0) {
				nums[index++]=nums[i];
			}
		}
		for(int i=index;i<nums.length;i++) {
			nums[i]=0;
		}
		for(int i:nums) {
			System.out.print(i+" ");
		}
	}

}
//5
//0
//1
//0
//2
//0
//1 2 0 0 0 