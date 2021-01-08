class Solution {
    public void moveZeroes(int[] nums) {
		 int index = 0;
		 for(int i = 0;i < nums.length;i++){
			if(nums[i] != 0){
				nums[index] = nums[i];
				//如果非0数与0发生了交换，将交换后的非0数变为0
				if(index != i){
					nums[i] = 0;
				}
				index++;
			}
		 }       
    }
}
