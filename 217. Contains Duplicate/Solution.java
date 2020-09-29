class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        if(set.size() != nums.length)
        	return true;
        return false;
    }
}