package interviewQuestions;
import java.util.*;
public class RemoveVowels {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans=removeVowels(s);
		System.out.println(ans);
	}
	public static String removeVowels(String s) {
		HashSet<Character>vowels=new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		String ans="";
		for(char c:s.toCharArray()) {
			if(!vowels.contains(c)) {
				ans+=c;
			}
		}
		return ans;
	}

}


//hello
//hll


//leetcode
//ltcd


//prateeksha
//prtksh
