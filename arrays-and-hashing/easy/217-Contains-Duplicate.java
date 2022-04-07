class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if(map.containsKey(key)) return true;
            map.put(key, 1);
        }
        
        return false;
    }
}
