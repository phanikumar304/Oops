package OOPS.Oops;

import java.util.Arrays;

import org.junit.Test;

public class Arrays2 {
	
	@Test
	public void array2(){
		
		String name = "mynameischaracterarray";
		char[] chars = name.toCharArray();
		System.out.println(chars);

		
		for (int i=chars.length-1;i>=0;i--){
			System.out.print(chars[i]);
		}
		
		System.out.println("\t");
		Arrays.sort(chars);
		System.out.println(Arrays.toString(chars));
	}

}
