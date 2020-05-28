class Solution {
    public boolean isLongPressedName(String name, String typed) {
       int i = 0,j = 0;
        char c1 = name.charAt(0),c2 = typed.charAt(0);
        while(i < name.length() || j < typed.length()) {
            if( i < name.length() ){
                 c1 = name.charAt(i);
            }
            if( j < typed.length() ){
                 c2 = typed.charAt(j);
            }
            if(c1 != c2) {
                return false;
            }
            
            int count1 = 0;
            while(i < name.length() && name.charAt(i) == c1 ) {
                count1++;
                i++;
            }
            
            int count2 = 0;
            while( j < typed.length() && typed.charAt(j) == c1) {
                count2++;
                j++;
            }
            
            if(count1 > count2) {
                return false;
            }
            
        }
        
        return i == name.length() && j == typed.length();     
    }
}
