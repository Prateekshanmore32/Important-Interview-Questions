package interviewQuestions;
import java.util.*;
public class PowerOfTwo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
			long i=1;       //first power of two    2^0;
			while(i<n) {
				i*=2;
			}
			if(i==n) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
				
	}

}
//64
//true
//21
//false
