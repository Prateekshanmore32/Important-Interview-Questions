package interviewQuestions;
import java.util.*;
public class PermutationOfStrings {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		premutation(str, 0,str.length()-1);
	}	


	private static void premutation(String str, int l, int r) {
		
		if(l==r)
			System.out.print(str+" ");
		else {
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				premutation(str,l+1,r);
				str=swap(str,l,i); //backtrack
			}
		}
	}


	private static String swap(String str, int l, int i) {

		char []c=str.toCharArray();
		char temp=c[l];
		c[l]=c[i];
		c[i]=temp;
		return new String(c);
		
	}

}

//time->   O(n!)  without print
//           O(n!*n) with print
//ABC
//ABC ACB BAC BCA CBA CAB 