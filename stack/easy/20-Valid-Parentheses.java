class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int stackIndex = -1;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stackIndex++;
                stack[stackIndex] = ')';
                continue;
            }
            
            if(c == '[') {
                stackIndex++;
                stack[stackIndex] = ']';
                continue;
            };
            
            if(c == '{') {
                stackIndex++;
                stack[stackIndex] = '}';
                continue;
            };
            
            if(stackIndex >= 0 && c == stack[stackIndex]) {
                stackIndex--;
            } else {
                return false;
            }
        }
        
        return stackIndex < 0 ? true : false;
    }
}
