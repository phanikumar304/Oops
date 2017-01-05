package OOPS.Oops;

import org.junit.Test;

public class Binar {
	
	@Test
	public void binarSe(){
		int[] nums = {1,2,3,4,5,6,8,9};
		
		int input = 6;
		int start =0;
		int high = nums.length-1;
		
		while (start <=high){
		
		int middle = start+high/2;
				
		if (input == nums[middle]){
			System.out.println("The input is"+input);
			break;
		}
		
		else if(input < nums[middle]){
			high = middle-1;
		}
		
		else {
			start = middle+1;
		}
	}

}
}
