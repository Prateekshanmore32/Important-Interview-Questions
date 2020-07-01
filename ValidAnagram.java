package interviewQuestions;
import java.util.*;
public class ValidAnagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		String t=sc.next();
		boolean anagram =isAnagram(s,t);
		System.out.println(anagram);
	}
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		int a[]=new int[26];   //ASCII   a==96
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)-'a']++;
			a[t.charAt(i)-'a']--;
		}
		for(int i:a) {
			if(i!=0) {
				return false;
			}
		}
		return true;
	}
}

//aab
//baa
//true


//anagram
//aaanmrg
//true


//aba
//bba
//false
