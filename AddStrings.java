package interviewQuestions;
import java.util.*;
public class AddStrings {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String num1=sc.next();
		String num2=sc.next();
		String ans=addString(num1 , num2);
		System.out.println(ans);
	}

	public static String addString(String num1, String num2) {
		StringBuilder ans=new StringBuilder();
		int i=num1.length()-1;
		int j=num2.length()-1;
		int carry=0;
		while(i>=0 || j>=0) {
			int sum=carry;
			if(i>=0) {
				sum+=num1.charAt(i)-'0';
			}
			
			if(j>=0) {
				sum+=num2.charAt(j)-'0';
			}
			ans.append(sum%10);
			carry=sum/10;
			i--;
			j--;
		}
		if(carry!=0) {
			ans.append(carry);
		}
		return ans.reverse().toString();
	}
}


//11
//22
//33


//123
//321
//444


//69
//96
//165
