package basicjava;

public class SuperKeyWord {
	
	static class Country {
		
	    String name;
	    
	    void value() {
	       name = "China";
	       System.out.println("china");
	    }
	    public int getOne() {
	    	return 1;
	    }
	    
	}
	static class City extends Country {
	    String name;
	    void value() {
	    name = "Shanghai";
	    super.value();      //调用父类的方法
	    System.out.println(name);
	    System.out.println(super.name);
	}}
	public static void main(String[] args) {
		
		 City c=new City();
	     c.value();
	       
	}
	
	}
	       

