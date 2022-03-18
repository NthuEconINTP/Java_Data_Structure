package basicObjectConcept;


public class intDemoclass {
	
	static private int mynumberstatic=3;
	private int mynumber=5;

	public intDemoclass(int mynumber) {
		this.mynumber = mynumber;
	}
	
	public intDemoclass() {
		
	}

	public void printmynumberinfo() {
		System.out.println(mynumberstatic);//can directly print mynumberstatic
		intDemoclass intDemoDefault=new intDemoclass();
		System.out.println(intDemoDefault.getMynumber());
	}

	public static int getMynumberstatic() {
		return mynumberstatic;
	}

	public static void setMynumberstatic(int mynumberstatic) {
		intDemoclass.mynumberstatic = mynumberstatic;
	}

	public int getMynumber() {
		return mynumber;
	}

	public void setMynumber(int mynumber) {
		this.mynumber = mynumber;
	}

	private int addtwonumbers(int a,int b) {//private method can not be used outside the class
		return a+b;
	}
	
	public int squarethesumoftwonumbers(int a ,int b) {//public method can use private method because they are in same class
		int x=addtwonumbers( a, b);
		int result=x*x;
		return result;
	}

}
