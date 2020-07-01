package interviewQuestions;
import java.util.*;
public class JewelsAndStones {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String J=sc.next();
		String S=sc.next();
		int ans=jewelsAndStones(J,S);
		System.out.println(ans);
	}
	public static int jewelsAndStones(String J, String S) {
		HashSet<Character>set=new HashSet<>();
		for(char i: J.toCharArray()) {
			set.add(i);
		}
		int ans=0;
		for(char i:S.toCharArray()) {
			if(set.contains(i)) {
				ans++;
			}
		}
		return ans;
	}

}

//aA
//aAAAbb
//4

//z
//ZZ
//0
