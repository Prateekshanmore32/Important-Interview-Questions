package interviewQuestions;

public class ValidBST {
	
	public boolean isValidBST(TreeNode root) {
		
		
		return isBST(root,null ,null);
	}
	public boolean isBST(TreeNode root, Integer max, Integer min) {
		if(root==null) {
			return true;
		}else if(max!=null && root.val>=max || min!=null && root.val<=min){
			return false;
		}else {
			return isBST(root.left, root.val,min) && isBST(root.right,max,root.val);
		}
	}

}
