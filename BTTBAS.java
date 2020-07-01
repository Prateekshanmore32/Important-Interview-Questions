package interviewQuestions;
import java.util.*;
public class BTTBAS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int ans=buyAndSell(a);
		System.out.println(ans);
	}
	public static int buyAndSell(int a[]) {
			if(a==null||a.length==0) {
				return 0;
			}
			int profit=0;
			for(int i=0;i<a.length-1;i++) {
				if(a[i+1]>a[i]) {
					profit+=a[i+1]-a[i];
				}
			}
			return profit;
	}

}
//6
//7 1 5 3 6 4
//7


//5
//5 4 3 2 1
//0
