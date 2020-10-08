class Solution {
    public int missingNumber(int[] nums) {
    	if(nums == null || nums.length == 0){
    		return 0;
    	}
    	int missingNum = nums.length;
    	for(int i = 0;i < nums.length;i++){
    		missingNum ^= nums[i] ^ i;
    	}
    	return missingNum;
    }
}
