package interviewQuestions;
import java.util.*;
public class BackSpaceStringCompare {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		String T=sc.next();
		boolean isEqual=backSpaceStringCompare(S,T);
		System.out.println(isEqual);

	}
	public static boolean backSpaceStringCompare(String s,String t) {
		Stack<Character>sstack=new Stack<>();
		Stack<Character>tstack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!='#') {
				sstack.push(c);
			}
			else if(!sstack.isEmpty()) {
				sstack.pop();
			}
		}
		for(int i=0;i<t.length();i++) {
			char c=t.charAt(i);
			if(c!='#') {
				tstack.push(c);
			}
			else if(!tstack.isEmpty()){
				tstack.pop();
			}
		}
		
//		while(!sstack.isEmpty()) {
//			char c=sstack.pop();
//			if(t.isEmpty()||tstack.pop()!=c) {
//				return false;
//			}
//		}
		return sstack.equals(tstack);
	}
}
//ab#c
//ad#c
//true


//a##c
//#a#c
//true
