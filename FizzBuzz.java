package interviewQuestions;
import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String>list=new LinkedList<>();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				list.add("FizzBuzz");
			}
			else if(i%3==0) {
				list.add("Fizz");
			}
			else if(i%5==0) {
				list.add("Buzz");
			}
			else {
				list.add(Integer.toString(i));
			}
				
		}
		System.out.println(list);
	}

}
//15
//[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
