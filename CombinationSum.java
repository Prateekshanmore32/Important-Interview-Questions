/*Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
 *  find all unique combinations in candidates where the candidate numbers sums to target.
The same repeated number may be chosen from candidates unlimited number of times.*/

package interviewQuestions;
import java.util.*;
public class CombinationSum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int candidates[]=new int[n];
		for(int i=0;i<n;i++) {
			candidates[i]=sc.nextInt();
		}
		List<List<Integer>>ans=combinationSum(candidates,target);
		System.out.println(ans);
	}

	private static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>>ans=new ArrayList<>();
		Arrays.sort(candidates);
		gerenarateCombination(0, candidates,target,new ArrayList<Integer>(),ans);
		return ans;
	}

	private static void gerenarateCombination(int index, int[] candidates, int target, List<Integer>current,
			List<List<Integer>> ans) {
		
		if(target==0) {
			ans.add(new ArrayList<>(current));
			return;
		}
		if(target<0) {
			return;
		}
		
		for(int i=index;i<candidates.length;i++) {
			if(i==index|| candidates[i]!=candidates[i-1]) {
				current.add(candidates[i]);
				gerenarateCombination(i+1, candidates, target-candidates[i], current, ans);
				current.remove(current.size()-1);
			}
		}
		
		
	}
	

}


//5
//8
//1 7 4 5 6
//[[1, 7]]
