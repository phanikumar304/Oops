package OOPS.Oops;

import java.util.Arrays;

import org.junit.Test;

public class Array1 {
	
	@Test
	public void array1(){
	int[] nos = {4,6,3,1,5,2};
	
	for (int no:nos){
		System.out.println(no);
	}
	
	for (int i=nos.length-1;i>=0;i--){
		System.out.print(nos[i]);
	}
	
	int bignum = nos[0];
	
	for (int i=1;i<=nos.length-1;i++){
		
		if (nos[i]>bignum){
			bignum = nos[i];
		}
	}
	System.out.println("\t");
	System.out.println("bignum is"+" "+bignum);
	
	Arrays.sort(nos);
	System.out.println(Arrays.toString(nos));
	
	
	String name = "PhaniKumarMallampati";
	name.charAt(2);
	System.out.println(name);
	
	StringBuffer nam = new StringBuffer(name);
	System.out.println(nam);
	nam.append("Mr");
	System.out.println(nam);
	//nam.
	}

}
