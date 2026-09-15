class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
           map.merge(nums[i], 1, Integer::sum);
        }
        return map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
        
    }
}
