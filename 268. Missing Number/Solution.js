/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    	if(!nums){
			return 0;
		}
    const res = new Array(nums.length + 1).fill(-1);
    for(const num of nums){
        res[num] = num;
    }
    return res.indexOf(-1);
};
