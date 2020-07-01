package interviewQuestions;

public class IsSubtreeOfTree {

//	public boolean isSubtree(Node t, Node s) {
//		if(t==null) {
//			return false;
//		}else if(isSameTree(t,s)) {
//			return true;
//		}
//		else {
//			return isSubtree(t.left,s)|| isSubtree(t.right,s);
//		}
//	}
//	
//	public boolean isSameTree(Node t, Node s) {
//		if(t==null || s==null) {
//			return t==null && s==null;
//		}else if(t.val==s.val) {
//			return isSameTree(t.left, s.left) && isSameTree(t.right, s.right);
//		}else {
//			return false;
//		}
//	}
}
