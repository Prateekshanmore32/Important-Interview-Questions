package interviewQuestions;
import java.util.*;
public class RobotReturnToOrigin {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean origin=robotReturnToOrigin(s);
		System.out.println(origin);
	}
	public static boolean robotReturnToOrigin(String s) {
		int UD=0;
		int LR=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='U') {
				UD++;
			}else if(c=='D') {
				UD--;
			}else if(c=='L') {
				LR++;
			}else if(c=='R') {
				LR--;
			}
		}
		return UD==0 &&LR==0;
	}
}
//UD
//true


//LRLUD
//false


//LRUDDURL
//true
