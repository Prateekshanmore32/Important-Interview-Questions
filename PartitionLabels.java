package interviewQuestions;
import java.util.*;
public class PartitionLabels {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<Integer>ls=partitionLabels(s);
		System.out.println(ls);
	}
	public static List<Integer> partitionLabels(String s){
		List<Integer>ls=new ArrayList<>();
		if(s==null || s.length()==0) {
			return ls;
		}
		int []count=new int[26];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']=i;
		}
		
		int i=0;
		while(i<s.length()) {
			int end=count[s.charAt(i)-'a'];
			int j=i;
			while(j<end) {
				end=Math.max(end, count[s.charAt(j++)-'a']);
			}
			ls.add(j-i+1);
			i=j+1;
		}
		return ls;
	}

}
//prateeksha
//[1, 1, 8]


//aaabbbccc
//[3, 3, 3]
