package general;

import java.util.Comparator;

public class ComparatorEmp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getDateOfjoing().compareTo(o2.getDateOfjoing());
	}

	
}
