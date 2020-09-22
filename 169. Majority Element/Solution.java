class Solution {
    //多数跳票算法
    public int method1(int[] nums) {
        int count = 0;
        int m = 0;
        for(int x : nums){
            if(count == 0){
                m = x;
                count = 1;
            }else if(m == x){
                count++;
            }else{
                count--;
            }
        }
    return m;    
    }
    
  //中间数
  public int method2(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length>>1];
  }
}
