package interviewQuestions;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int m1 =missingNumberMeth1(nums);
		int m2=missingNumberMeth2(nums);
		System.out.println(m1);
		System.out.println(m2);
	}
	public static int missingNumberMeth1(int a[]) {
		HashSet<Integer>set=new HashSet<>();
		for(int i:a) {
			set.add(i);
		}
		for(int i=0;i<=a.length;i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return -1;
	}
	public static int missingNumberMeth2(int a[]) {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		int n=a.length+1;
		
		return (n*(n-1))/2 - sum;
	}
}
//9
//9 6 4 2 3 5 7 0 1
//8
//8
