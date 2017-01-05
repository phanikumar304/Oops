package OOPS.Oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ArrayLists {
	
	@Test
	public void lists(){
		
		List names = new ArrayList();
		names.add("phani");
		names.add("phaniB");
		names.add("bharat");
		names.add("kavya");
		
		
		System.out.println(Arrays.asList(names));
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
		
		
		for (Object name:names){
			System.out.print(name);
		}
		
		Iterator it = names.iterator();
		while(it.hasNext()){
		//it.next();
		System.out.println(it.next());
		}
	}

}
