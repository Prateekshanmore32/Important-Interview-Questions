package interviewQuestions;
import java.util.*;
public class MergeKSortedLinkedList {

	public Node mergeKLists(Node []list) {
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(Node head: list) {
			while(head!=null) {
				pq.add(head.val);
				head=head.next;
			}
		}
		
		Node dummy=new Node(-1);
		Node head=dummy;
		while(!pq.isEmpty()) {
			head.next=new Node(pq.remove());
			head=head.next;
		}
		
		
		return dummy.next;
	}
	
}
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}