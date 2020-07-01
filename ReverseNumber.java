package interviewQuestions;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=reverseNumber(n);
		System.out.println(rev);
	}
	public static int reverseNumber(int n) {
		long ans=0;
		boolean neg=false;
		if(n<0) {
			neg=true;
			n=n*-1;
		}
		while(n>0) {
			ans=(ans*10)+(n%10);
			n=n/10;
		}
		if(ans>Integer.MAX_VALUE)
			return 0;
		
		return neg?(int)(-1*ans):(int)ans;
	}
}
//564
//465


//-6969
//-9696
