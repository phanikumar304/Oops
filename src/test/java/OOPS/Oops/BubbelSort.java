package OOPS.Oops;

import java.util.Arrays;

import org.junit.Test;

public class BubbelSort {
	
	@Test
	public void bubbSort(){
		
		int[] nums = {4,3,5,1,2,9,0};
		
		for (int i=0;i<nums.length;i++){
			
			for (int j=1;j<nums.length;j++){
				
				if (nums[j-1]>nums[j]){
					
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}

}
