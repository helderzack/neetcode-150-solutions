class Solution {
    public boolean isPalindrome(String s) {
        int a_pointer = 0;
        int b_pointer = s.length() - 1;
        char a, b;
        
        s = s.toLowerCase();
        
        while(a_pointer < b_pointer) {
            a = s.charAt(a_pointer);
            b = s.charAt(b_pointer);
            
            if(a < 48 || (a > 57 && a < 97) || a > 122) {
                a_pointer++;
                continue;
            }
            
            if(b < 48 || (b > 57 && b < 97) || b > 122) {
                b_pointer--;
                continue;
            }
            
            if(a != b) return false;
            a_pointer++;
            b_pointer--;
        }
        
        return true;
    }
}
