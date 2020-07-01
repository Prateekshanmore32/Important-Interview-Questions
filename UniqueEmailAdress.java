package interviewQuestions;
import java.util.*;
public class UniqueEmailAdress {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String emails[]=new String[n];
		for(int i=0;i<n;i++) {
			emails[i]=sc.nextLine();
		}
		int count=numberUniqueEmails(emails);
		System.out.println(count);
	}
	public static  int numberUniqueEmails(String [] emails) {
		Set<StringBuilder>set=new HashSet<>();
		if(emails==null || emails.length==0) {
			return 0;
		}
		for(String email: emails) {
			
			StringBuilder newEmail=new StringBuilder();
			for(int i=0;i<email.length();i++) {
				char c=email.charAt(i);
				if(c=='.') {
					continue;
				}else if(c=='+') {
					while(email.charAt(i)!='@') {
						i++;
					}
					newEmail.append(email.substring(i+1));
				}
				newEmail.append(c);
			}
			set.add(newEmail);
		}
		System.out.println(set);
		return  set.size();	
	}

}
