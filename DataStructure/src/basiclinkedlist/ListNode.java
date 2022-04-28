package basiclinkedlist;

public class ListNode {
	
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { 
		
		this.val = val; 
		
	}
	
	ListNode(int val, ListNode next) { 
		
		this.val = val; 
		this.next = next; 
	
	}
	
	
	public static void printLinkedList(ListNode head) {
		
		ListNode currentNode=head;
		
		while(  currentNode!=null   ) { // finish condition 
			
			System.out.println(currentNode.val ); // print currentNode
		    currentNode=currentNode.next; // update currentNode
			
		}
		
	}
	
	public static ListNode middleNode(ListNode head) {
		
		// 1. get length of LinkedList
		ListNode currentNode=head;
		int size=0;
		while(  currentNode!=null   ) { 
			size=size+1;
		    currentNode=currentNode.next; 
		}
		int middleIndex=(size/2)+1;
		System.out.println("size: "+size);
		System.out.println("middleIndex: "+middleIndex);
		// now we get the middleIndex in the 
		ListNode middleNode = head; // Initialize middle node as head
		int count=0;
		// 2.when you have middleIndex you can get the middle node
		while(  middleNode != null) { 
			
			count=count+1;
			
			if(count==middleIndex) {// when count equals middleIndex this middleNode is answer
				return middleNode;
			
			}
			middleNode=middleNode.next; // update the middleNode if the if condition not achieve
			
		}
		
		return middleNode;
		
	}
	
	public static ListNode reverseLinkedList(ListNode head) {
		
		
		return head;
		
	}
	
	
	public static void main(String[] args) {
		
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(6);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
//		node5.next=node6;
//		printLinkedList(node1);
//		int a=7/2;
//		System.out.println(a); //3
		
		ListNode answer=middleNode(node1);
		System.out.println(   answer.val   );
		
	}
	
	
}
