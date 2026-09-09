class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for(String s : strs){
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String key = String.valueOf(chars);
			if(!map.containsKey(key)){
				List<String> subset = new ArrayList<>();
				subset.add(s);
				map.put(key, subset);
			}else {
				List<String> existingList = map.get(key);
				existingList.add(s);
				map.put(key, existingList);
			}
		}

		return new ArrayList<>(map.values());
			
			
    }

	public boolean isAnagram(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		int[] alphabet = new int[26];
		IntStream.range(0, s1.length()).forEach(i -> {
			alphabet[s1.charAt(i)-'a']++;
			alphabet[s2.charAt(i)-'a']--;
		});
		return Arrays.stream(alphabet).allMatch(n -> n==0);

	}
}
