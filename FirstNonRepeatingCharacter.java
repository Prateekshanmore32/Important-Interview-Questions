package interviewQuestions;
import java.util.*;
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char nonReapeatingCharacter=firstNonRepeatingCharacter(str);
		System.out.println(nonReapeatingCharacter);
		
		
		char nonReapeatingCharacter1=firstNonRepeatingCharacter1(str);
		System.out.println(nonReapeatingCharacter1);
	}
	public static char firstNonRepeatingCharacter(String str) {     //-->O(n^2)
		
		for(int i=0;i<str.length();i++) {
			boolean isSame=false;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					isSame=true;
				}
			}
			if(!isSame) {
				return str.charAt(i);
			}
		}
		return '_';
	}

	
	public static char firstNonRepeatingCharacter1(String str) {      //-->  O(n)
		HashMap<Character, Integer>map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(map.containsKey(c) && map.get(c)==1) {
				return c;
			}
		}
		return '_';
	}

}


//aaabcdcee
//b
//b


//aabbccdd
//_
//_
