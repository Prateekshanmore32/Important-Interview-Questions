package interviewQuestions;

import java.util.*;

public class ValidParentheses {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		Stack<Character>stack=new Stack<>();
		for(char c:s.toCharArray()) {
			if(c=='{'||c=='['||c=='(') {
				stack.push(c);
			}
			else if(c==')'&& !stack.isEmpty()&&stack.peek()=='(') {
				stack.pop();
			}
			else if(c=='}'&& !stack.isEmpty()&&stack.peek()=='{') {
				stack.pop();
			}
			else if(c==']'&& !stack.isEmpty()&&stack.peek()=='[') {
				stack.pop();
			}
			else {
				System.out.println(false);
				break;
			}
		}
		if(stack.isEmpty()) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		

	}

}
//{{}}
//true
//{{()
//false
