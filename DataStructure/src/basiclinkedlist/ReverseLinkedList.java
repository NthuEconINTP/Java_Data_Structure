package basiclinkedlist;

public class ReverseLinkedList {
	
	
	public static ListNode  reverse(ListNode head) {
		
		if(head==null||head.next==null) return head;
		
		ListNode p=head.next;
//		head.next.next=head;
		head.next=null;
		p.next = head; 
		
		return p;
		
	}
	
	public static ListNode  reverse2(ListNode head) {
		
		if(head==null||head.next==null) return head;
		ListNode p=reverse2(head.next);
		head.next.next=head;
		head.next=null;


		return p;
		
	}
	
	
	
	public static void main(String[] args) {

		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		node1.next=node2;
		node1.next.next=node3;
		
		System.out.println(node1.toString());
//		ListNode newHead=reverse(node1);
//		System.out.println(newHead);
//		
		ListNode newHead2=reverse2(node1);
		System.out.println(newHead2);
		System.out.println("Stack trace:");
	
		
	}
}
