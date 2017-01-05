package OOPS.Oops;

import org.junit.Test;

public class Equilib {
	
	@Test
	public void equilB(){
		
		int[] nums = {1,2,3,0,3,1,1,1};
		
		int sum =0;
		int leftsum =0;
		for (int i=0;i<=nums.length-1;i++){
			 sum += nums[i];
			 System.out.print(sum);
			 System.out.print("\t");
		}
		System.out.println("\t");
		for (int j = 0; j <=nums.length-1; j++) {
			sum = sum - nums[j];

			if (leftsum == sum) {
				 System.out.println(nums[j]);
				 break;
			} 
			else {
				leftsum += nums[j];
				System.out.print(leftsum);
				System.out.print("\t");
			}
		}
	}

}
