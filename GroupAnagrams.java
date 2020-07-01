package interviewQuestions;
import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String []s=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			s[i]=sc.nextLine();
		}
		List<List<String>>ans=groupAnagrams(s);
		System.out.println(ans);
	}

	public static List<List<String>> groupAnagrams(String[] s) {
		List<List<String>>ans=new ArrayList<>();
		HashMap<String, List<String>>map=new HashMap<>();
		for(String i:s) {
			char[]c=i.toCharArray();
			Arrays.sort(c);
			String st=new String(c);
			if(!map.containsKey(st) ) {
				map.put(st, new ArrayList<>());
			}
			map.get(st).add(i);
		}
		ans.addAll(map.values());
		return ans;
	}

}
