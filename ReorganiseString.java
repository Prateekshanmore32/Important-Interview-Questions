package interviewQuestions;
import java.util.*;
public class ReorganiseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans=reorganiseString(s);
		System.out.println(ans);
		
	}

	private static String reorganiseString(String s) {
		HashMap<Character, Integer>map=new HashMap<>();
		for(char c: s.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
			pq.addAll(map.keySet());
			String ans="";
			while(pq.size()>1) {
				char current=pq.remove();
				char next=pq.remove();
				ans+=current;
				ans+=next;
				map.put(current, map.get(current)-1);
				map.put(next,map.get(next)-1);
				if(map.get(current)>0) {
					pq.add(current);
				}
				if(map.get(next)>0) {
					pq.add(next);
				}
		}
			if(!pq.isEmpty()) {
				char last =pq.remove();
				if(map.get(last)>1)
					return "";
			}
			return ans;
	}

}
//aabb
//abab

//aaaa
//
