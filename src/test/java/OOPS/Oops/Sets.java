package OOPS.Oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class Sets {
	
	@Test
	public void setS(){
		
		List names = new ArrayList();
		names.add("phani");
		names.add("phaniB");
		names.add("bharat");
		names.add("kavya");
		names.add("kavya");
		
		
		Set employees = new HashSet();
		employees.addAll(names);
		System.out.println(employees);
		
		Set employees1 = new TreeSet();
		employees1.addAll(names);
		System.out.println(employees1);
		
		Set employees2 = new LinkedHashSet();
		employees2.addAll(names);
		System.out.println(employees2);
	}

}
