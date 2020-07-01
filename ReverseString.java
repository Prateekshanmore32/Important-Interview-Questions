package interviewQuestions;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			String rev=reverseString(s);
			System.out.println(rev);
	}
	
	
	public static String reverseString(String s) {
		char c[]=s.toCharArray();
		int i=0;;
		int j=s.length()-1;
		while(i<j) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);
	}
}
//prateeksha
//ahskeetarp
