class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            char[] count = new char[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }
            String key = new String(count);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
