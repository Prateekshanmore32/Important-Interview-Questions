package interviewQuestions;
import java.util.*;
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n]; 
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int maxAmt=BTTBAS(a);
		System.out.println(maxAmt);
	}
	public static int BTTBAS(int a[]) {
		int min=Integer.MAX_VALUE;
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			else
			{
				max=Math.max(max, a[i]-min);
			}
		}
		return max;
	}
	 

}
//6
//7 1 5 3 6 4
//5


//5
//7 6 4 3 1
//0
