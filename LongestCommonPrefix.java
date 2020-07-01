package interviewQuestions;
import java.util.*;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String [] strs=new String[n];
		for(int i=0;i<n;i++) {
			strs[i]=sc.next();
		}
		String longestCommonPrefix=findLongestCommonPrefix(strs);
		System.out.println(longestCommonPrefix);
	}

	private static String findLongestCommonPrefix(String[] strs) {
		String ans="";
		if(strs==null || strs.length==0)
		return ans;
		
		int index=0;
		 for(char c:strs[0].toCharArray()) {
			 for(int i=1;i<strs.length;i++) {
				 if(index>=strs[i].length() || c!=strs[i].charAt(index)) {
					 return ans;
				 }
			 }
			 ans+=c;
			 index++; 
		 }
		 return ans;
	}

}
//3
//fool fog follow
//fo



//3
//prateeksha pratiksha prateek
//prat
