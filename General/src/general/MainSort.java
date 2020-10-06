package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MainSort {

	public static void main(String[] args) {
		
		
		List<Employee> list= new ArrayList<Employee>();
		
		list.add(new Employee("nik",new Date(),234));
		
		Collections.sort(list,new ComparatorEmp());

}
}
