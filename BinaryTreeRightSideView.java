package interviewQuestions;
import java.util.*;
public class BinaryTreeRightSideView {
	
	
	public List<Integer> rightSideView(TreeNode root){
		List<Integer>visibleNode=new ArrayList<>();
		if(root==null) {
			return visibleNode;
		}
		Queue<TreeNode>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			
			int size=q.size();
			for(int i=0;i<size;i++) {
				TreeNode t=q.remove();
				if(i==size-1) {
					visibleNode.add(t.val);
				}
				if(t.left!=null) {
					q.add(t.left);
				}
				if(t.right!=null) {
					q.add(t.right);
				}
				
			}
			
		}
		return visibleNode;
	}

}


class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
}