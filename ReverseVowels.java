package interviewQuestions;
import java.util.*;
public class ReverseVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans=reverseVowels(s);
		System.out.println(ans);
	}

	private static String reverseVowels(String s) {
		HashSet<Character>set=new HashSet<>();
		set.add('a');
		set.add('A');
		set.add('e');
		set.add('E');
		set.add('i');
		set.add('I');
		set.add('o');
		set.add('O');
		set.add('u');
		set.add('U');
		int i=0;
		int j=s.length()-1;
		char []ans=s.toCharArray();
		while(i<j) {
			
			while(i<j && !set.contains(ans[i])) {
				i++;
			}
			
			while(i<j && !set.contains(ans[j])) {
				j--;
			}
			char ch=ans[i];
			ans[i]=ans[j];
			ans[j]=ch;
			i++;
			j--;
		}
		return new String(ans);
	}

}

//hello
//holle


//leetcode
//leotcede
