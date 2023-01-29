package thread;

public class StringTest {
	
	
	public static void main(String[] args) {
		
//		String a = "a";
//		long time1 = System.currentTimeMillis();
//		for(int i=0;i<100000;i++) {
//			
//			a=a+"T";
//		}
//		long time2 = System.currentTimeMillis();
//		System.out.println(time2-time1);
//		
//		StringBuilder s = new StringBuilder("a");
//		long time3 = System.currentTimeMillis();
//		for(int i=0;i<100000;i++) {
//			s.append("T");
//			
//		}
//		long time4 = System.currentTimeMillis();
//		System.out.println(time4-time3);
		
		long time5 = System.currentTimeMillis();
		String b="1"+"asdf"+"asdfafd";
		long time6 = System.currentTimeMillis();
		System.out.println(time6-time5);
		
		long time7 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("1");
		sb.append("asdf").append("asdfafd");
		long time8 = System.currentTimeMillis();
		System.out.println(time8-time7);
		
		
	}
	
}
