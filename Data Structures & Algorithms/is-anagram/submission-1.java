class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        for(char schar : schars){
            if(map.size()>0 && map.containsKey(schar)){
               map.computeIfPresent(schar, (key, val) -> val + 1);
            }else{
                map.put(schar, 1);
            }
        }
        
        for(char tchar : tchars){
            if(map.containsKey(tchar)){
                map.computeIfPresent(tchar, (key, val) -> val - 1);
            }else {
                return false;
            }
            if (map.get(tchar) == 0) {
                map.remove(tchar);
        }
        }
        
        return map.isEmpty();
    }
     
}
