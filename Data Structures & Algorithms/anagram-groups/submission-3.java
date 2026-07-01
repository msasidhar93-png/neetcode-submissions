class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            int[] hashKey = new int[26]; 
            for(int i = 0; i<str.length(); i++){
                    int index = str.charAt(i)-'a';
                    hashKey[index] = hashKey[index]+1;
            }
            String uniqueKey = Arrays.toString(hashKey);
            if(!map.containsKey(uniqueKey)){
            List<String> mapValues = new ArrayList<>();
            mapValues.add(str);
            map.put(uniqueKey, mapValues);
            }else{
                map.get(uniqueKey).add(str);
            }
        }
        List<List<String>> endresult = new ArrayList(map.values());
        return endresult; 
    }
}
