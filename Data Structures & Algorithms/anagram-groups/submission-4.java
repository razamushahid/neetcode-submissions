class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		// for(String s : strs){
		// 	char[] chars = s.toCharArray();
		// 	Arrays.sort(chars);
		// 	String key = String.valueOf(chars);
		// 	map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

		// 	// if(!map.containsKey(key)){
		// 	// 	map.put(key, new ArrayList<>(Arrays.asList(s)));
		// 	// }else {
		// 	// 	map.get(key).add(s);
		// 	// }
		// }
		for(String s : strs){
			int[] freq = new int[26];
			for(char ch : s.toCharArray()){
				freq[ch-'a']++;
			}

			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < freq.length; i++){
				sb.append(freq[i]);
				sb.append("#");
			}

			String key = sb.toString();
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

		}
		// System.out.println(Arrays.toString(freq));

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
