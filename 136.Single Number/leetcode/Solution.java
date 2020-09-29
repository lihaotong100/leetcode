package leetcode;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) {
        	return false;
        }
    	int[] countArr = new int[52];
        for(int i = 0;i < t.length() || i < s.length();i++) {
        	if(i < t.length()) {
        		countArr[t.charAt(i) - 'a']++;
        	}
        	if(i < s.length()) {
        		countArr[s.charAt(i) - 'a' + 27]++;
        	}
        }
        for(int i = 0;i < 26;i++) {
        	if(countArr[i] != countArr[i+26]){
        		return false;
        	}
        }
        return true;
    }
}