package interviewQuestions;

public class TreeSymmetricOrMirror {

	public boolean symmetricOrNot(Node1 head) {
		if(head==null) {
			return true;
		}
		return isSymmetric(head.left, head.right);
	}
	
	public boolean isSymmetric(Node1 left, Node1 right) {
		if(left==null || right==null) {
			return left==right;
		}else if(left.val!=right.val) {
			return false;
		}else {
			return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		}
		
	} 
}


class Node1{
	int val;
	Node1 left;
	Node1 right;
}