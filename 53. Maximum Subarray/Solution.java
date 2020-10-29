class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return 0;
        }
    	return subArray(nums,0,nums.length - 1);
    }
    
    public int subArray(int[] A,int left, int right) {
    	if(left == right)return A[left];
    	int mid = left + (right - left) / 2 ;
    	int leftSum = subArray(A, left, mid);
    	int rightSum = subArray(A, mid+1, right);
    	int midSum = midSum(A, mid, left, right);
    	
    	if(leftSum >= rightSum && leftSum >= midSum) {
    		return leftSum;
    	}
    	if(rightSum >= leftSum && rightSum >= midSum) {
    		return rightSum;
    	}
    	return midSum;
    }
    
    public int midSum(int[] A,int mid,int left,int right) {
    	int leftSum = Integer.MIN_VALUE;
    	int rightSum = Integer.MIN_VALUE;
    	int sum = 0;
    	for(int i = mid;i >= left;i--) {
    		sum += A[i];
    		if(sum > leftSum) {
    			leftSum = sum;
    		}
    	}
    	
        sum = 0;
	    for (int j = mid + 1; j <= right; j++){
	        sum += A[j];
	        if (rightSum < sum){
	            rightSum = sum;
	        }
	    }
    	
    	return leftSum + rightSum;
    }
}