package grind75;

public class Field {
	
	static int s=5;
	
	int a=5;
	
	public static void main(String[] args) {
		
		 System.out.println(s);
		 change(7);
		 System.out.println(s);
		 Field field=new Field();
		 field.getA();
		 
		 field.change2(field.getA());
		 System.out.println(field.getA());
	}
	
	public static void change(int i) {
		s=7;
	}
	
	public void change2(int c) {
		c=8;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
