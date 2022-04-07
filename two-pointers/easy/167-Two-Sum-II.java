class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;
        int sum;
        
        while(a_pointer < b_pointer) {
            sum = numbers[a_pointer] + numbers[b_pointer];
            
            if(sum == target) break;
            
            if(sum < target) {
                a_pointer++;
            } else {
                b_pointer--;
            }
            
        }
        
        return new int[]{a_pointer + 1, b_pointer + 1};
    }
}
