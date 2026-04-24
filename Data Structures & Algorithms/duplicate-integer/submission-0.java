class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean res = false;
        if(nums == null || nums.length == 0) return res;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                res = true;
                break;
            }
            map.put(nums[i], 1);
        }
        return res;
    }
}