var containsDuplicateV2 = function(nums) {
    return nums.sort().some((element,index) => element == nums[index-1]);
};

var containsDuplicate = function(nums) {
  let set = new Set(nums);
  return   (new Set(nums)).size == nums.length ? true : false;
};