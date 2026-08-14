class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int res = 0;
        Map<Character, Integer> hp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hp.containsKey(s.charAt(i))){
                l = Math.max(hp.get(s.charAt(i))+1, l);
            }
            hp.put(s.charAt(i), i);
            res = Math.max(res, i-l+1);

        }
        
        return res;
        
    }
}
