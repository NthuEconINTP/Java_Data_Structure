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
		System.out.println("�w�g�N���"+arr[top]+"��X�h");
		top=top-1;
	}
	
	public boolean isFull() {
		return false;
		
	}
	public static void main(String[] args) {
		
		StackUsingArray mystack=new StackUsingArray(5);
		mystack.push(23);
		System.out.println("�{�b�o��stack�����ݬO"+mystack.peek());
		mystack.push(30);
		System.out.println("�{�b�o��stack�����ݬO"+mystack.peek());
		mystack.pop();
		System.out.println("�{�b�o��stack�����ݬO"+mystack.peek());
		System.out.println("hello");
		System.out.println(" 123");
		System.out.println("�o�O�ڦbDATASTRUCTURE�̭��s�W��");
		System.out.println("這是我在workspace2裡面新增的");
	}
}
