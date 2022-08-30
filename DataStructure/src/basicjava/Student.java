package basicjava;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	
	int id;

	public Student(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		
		Student mike =new Student(5);
		Student mike2 =new Student(5);
		System.out.println(mike.equals(mike2)      ); //true if we override equals , if not override equals false
		
		Map<Student, String> map =new HashMap<>();
		
		map.put(mike, "mike");
		
		map.put(mike2, "mike2");
		System.out.println(  map.get(mike)  ); //null 
	

		Map<String, String> stringMap =new HashMap<>();
		
		 stringMap.put("mike", "sandy");
		 String s = "mike";
		 System.out.println(stringMap.get(s));
		
	}
	
	
}
