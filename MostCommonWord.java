package interviewQuestions;
import java.util.*;
public class MostCommonWord {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String para=sc.next();
		String []banned= {};
		String ans=mostCommonWord(para,banned);
		System.out.println(ans);
	}
	public static String mostCommonWord(String para, String []banned) {
		HashSet<String>set=new HashSet<>();
		for(String i:banned) {
			set.add(i);
		}
		HashMap<String, Integer>map=new HashMap<>();
		for(String word:para.toLowerCase().split(" ")) {
			if(!set.contains(word)) {
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		String result="";
		for(String i:map.keySet()) {
			if(result.equals("")||map.get(i)>map.get(result)) {
				result=i;
			}
		}
		return result;
	}

}
