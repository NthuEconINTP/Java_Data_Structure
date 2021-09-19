package stack;

public class StackUsingArray {
	
	int arr[]=null;
	int capacity=5;
	int top=-1;
	
	public StackUsingArray( int capacity) {
		this.arr = new int [capacity ];
	}
	public StackUsingArray( ) {
		this.arr = new int [capacity ];
	}
	
	
	public void push(int data) {
		top=top+1;
		arr[top]=data;
		System.out.println(data+ "has been pushed");
	}
	
	public int peek() {
		
		return arr[top];
	}
	
	public void pop() {
		System.out.println("嚙緩嚙篇嚙瞇嚙踝蕭嚙�"+arr[top]+"嚙踝蕭X嚙篁");
		top=top-1;
	}
	
	public boolean isFull() {
		return false;
		
	}
	public static void main(String[] args) {
		
		StackUsingArray mystack=new StackUsingArray(5);
		mystack.push(23);
		System.out.println("嚙緹嚙箭嚙緻嚙踝蕭stack嚙踝蕭嚙踝蕭嚙豎是"+mystack.peek());
		mystack.push(30);
		System.out.println("嚙緹嚙箭嚙緻嚙踝蕭stack嚙踝蕭嚙踝蕭嚙豎是"+mystack.peek());
		mystack.pop();
		System.out.println("123");
	
	}
}
