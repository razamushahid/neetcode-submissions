class Solution {
    public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>(26);
		for(int i=0; i<s.length(); i++){
			Character ch = s.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}else map.put(ch, 1);
		}
		for(int i=0; i<t.length(); i++){
			Character ch  = t.charAt(i);
			if(map.containsKey(ch)){
				if(map.get(ch) >= 1)
				 map.put(ch, map.get(ch)-1);
			}
		}

        for(Map.Entry<Character, Integer> e: map.entrySet()){
            if(e.getValue() != 0){
                return false;
            }
        }

		return true;
    }
}
