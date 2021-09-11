package basicObjectConcept;

public class Main {
	public static int add2(int a,int b) {

		return 0;
	}

	public class abc{
		int a;
		int b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intDemoclass intDemoDefault=new intDemoclass(200);
		System.out.println("intDemoDefault.printmynumberinfo()");
		intDemoDefault.printmynumberinfo(); //print defalut value 3
		intDemoclass intDemobyValue=new intDemoclass(100);
		System.out.println("intDemobyValue.getMynumber()");
		System.out.println(intDemobyValue.getMynumber());//print 100
		
		
		System.out.println("intDemoclass.getMynumberstatic()");
		System.out.println(intDemoclass.getMynumberstatic());//because getMynumberstatic is an static method,so
		//we can use it by className.method
		System.out.println("intDemoDefault.squarethesumoftwonumbers(5, 3)=");
		System.out.println(intDemoDefault.squarethesumoftwonumbers(5, 3));
	
		
	}
	public static int add(int a,int b) {
		return 0;
	}
}
