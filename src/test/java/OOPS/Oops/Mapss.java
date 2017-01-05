package OOPS.Oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class Mapss {
	
	@Test
	public void mapS(){
		
		try {
			FileInputStream fs = new FileInputStream("/Users/NIS1651m/Documents/sample.txt");
			
			Map<String, Integer> count = new HashMap();
			
			Scanner sc = new Scanner(fs);
			while (sc.hasNextLine()){
				String line = sc.nextLine();
				String[] words = line.split(" ");
				
				for(String word:words){
					if (!count.containsKey(word)){
						count.put(word, 1);
					}
					
					else{
						count.put(word, count.get(word)+1);
					}
				}
				
				
				
			}
			System.out.println(count.entrySet());
			
			Set repchar = count.keySet();
			
			for(Object rep:repchar){
				if (count.get(rep)>1){
					System.out.println(rep+" "+count.get(rep));
				}
			}
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
