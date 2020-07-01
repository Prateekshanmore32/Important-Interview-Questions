package interviewQuestions;
import java.util.*;
public class SingleNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		HashSet<Integer>set=new HashSet<>();
		for(int i:a) {
			if(set.contains(i)) {
				set.remove(i);
			}
			else {
				set.add(i);
			}
		}
		for(int i:set) {
			System.out.println(i);
		}
	}

}
//5
//1 2 2 1 3
//3


//1
//1
//1
