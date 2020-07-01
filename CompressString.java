/*Given an array of characters, compress it in-place.
The length after compression must always be smaller than or equal to the original array.
Every element of the array should be a character (not int) of length 1.
After you are done modifying the input array in-place, return the new length of the array.
  
Follow up:
Could you solve it using only O(1) extra space?
  
Example 1:
Input:
["a","a","b","b","c","c","c"]

Output:
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]*/


package interviewQuestions;
import java.util.*;
public class CompressString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char []c=new char[n];
		for(int i=0;i<n;i++) {
			c[i]=sc.next().charAt(0);
		}
		int length=compressString(c);
		System.out.println(length);
	}
	public static int compressString(char c[]) {
		int index=0;
		int i=0;
		while(i<c.length) {
			int j=i;
			while(j<c.length && c[i]==c[j]) {
				j++;
			}
			c[index++]=c[i];
			if(j-i>1) {
				String count=j-i+"";
				for(char ch:count.toCharArray()) {
					c[index++]=ch;
				}
			}
			i=j;
		}
		return index;
	}

}


//13
//a b b b b b b b b b b b b    -> a,1,b,12
//4


//1
//a       
//1
