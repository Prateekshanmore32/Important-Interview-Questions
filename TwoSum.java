package interviewQuestions;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int []result=twoSum(a,sum);
		for(int i:result) {
			System.out.println(i);
		}
	}
	public static int[]twoSum(int a[],int sum){
		HashMap<Integer,Integer>map=new HashMap<>();
		int result[]=new int[2];
		for(int i=0;i<a.length;i++) {
			int diff=sum-a[i];
			if(map.containsKey(diff)) {
				result[0]=i;
				result[1]=map.get(diff);
				return result;
			}
				map.put(a[i], i);
		}
		return result;
	}

}
//4
//9
//2 7 11 15
//{s1 0}
