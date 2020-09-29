class Solution {
    public int titleToNumber(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
         int ans = 0;
         int carry = 26;
         for(int i = 0;i < s.length();i++){
             carry = (int) Math.pow(26,i);
             ans += carry * (s.charAt(s.length() - 1 - i) - 'A' + 1);
         }
         return ans;
    }
}