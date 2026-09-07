class Solution {
    public boolean hasDuplicate(int[] nums) {
        // boolean res = false;
        // if(nums == null || nums.length == 0) return res;

        // Set<Integer> seen = new HashSet<>();
        // return Arrays.stream(nums).anyMatch(e -> !seen.add(e));

        Set<Integer> map = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
        }
        return false;
    }
}