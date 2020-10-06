package Lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList( new Person("Nik", "Reddy",1),
				new Person("Naveen","Reddy",2));
		
		Collections.sort( people,(p1,p2)-> p1.getFirstNm().compareTo( p2.getFirstNm()));
		
		
		
		
	}
	
	public static void printConditionally(Person  p, Condition c) {
		
	}

}
