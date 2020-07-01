package interviewQuestions;

public class MaximumDepthOrHeight {

	public int maximumDepth(Node1 head) {
		if(head==null) {
			return 0;
		}
		int left=maximumDepth(head.left);
		int right=maximumDepth(head.right);
		 return Math.max(left, right)+1;
	}
	
}
