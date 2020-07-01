package interviewQuestions;
import java.util.*;
public class Subset {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		List<List<Integer>>ans=subSet(a);
		System.out.println(ans);

	}

	public static List<List<Integer>> subSet(int a[]){
		List<List<Integer>>subset=new ArrayList<>();
		generateSubset(0,a,new ArrayList<>(),subset);
		return subset;
	}
	
	public static void generateSubset(int index, int[] a, ArrayList<Integer> current, List<List<Integer>> subset) {
		subset.add(new ArrayList<>(current));
		for(int i=index;i<a.length;i++ ) {
			current.add(a[i]);
			generateSubset(i+1, a, current, subset);
			current.remove(current.size()-1);
		}
		
	}

}

//4
//1 2 3 4
//[[], [1], [1, 2], [1, 2, 3], [1, 2, 3, 4], [1, 2, 4], [1, 3], [1, 3, 4], [1, 4], [2], [2, 3], [2, 3, 4], [2, 4], [3], [3, 4], [4]]



//3
//1 2 3
//[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
