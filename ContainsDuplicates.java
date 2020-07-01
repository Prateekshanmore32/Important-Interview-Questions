package interviewQuestions;
import java.util.*;
public class ContainsDuplicates {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		boolean containDuplicates=duplicates(nums);
		System.out.println("Contains Duplicates "+containDuplicates);
	}
	public static boolean duplicates(int nums[]) {
		HashSet<Integer>set=new HashSet<>();
		for(int i:nums){
			if(set.contains(i)) {
				return true;
			}
			else {
				set.add(i);
			}
		}
		return false;
	}

}
//5
//1 2 3 4 5
//Contains Duplicates false


//5
//1 1 2 2 3
//Contains Duplicates true
