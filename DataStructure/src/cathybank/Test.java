package cathybank;
public class Test {
	
	private  void t(){
	  
		System.out.println("t()");
	
	}
	
	public  class Test2{
		
		private  void t2() {
			t();
		}
		
	}
	
	public static void main(String[] args) {
		
		Test2 test2 =new Test().new Test2();

		test2.t2(); //correct
		//t2(); wrong
	}

	
}
