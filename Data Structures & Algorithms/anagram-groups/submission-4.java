class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapRes = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        

        for(String str: strs){
            int[] uniqueK = new int[26];
            for(int i=0; i< str.length(); i++){
                int index = str.charAt(i)-'a';
                uniqueK[index] = uniqueK[index] + 1;
            }
            String uniqueKey = Arrays.toString(uniqueK);
            if(mapRes.containsKey(uniqueKey)){    
                mapRes.get(uniqueKey).add(str);
            }else{
                List<String> anagrams = new ArrayList();
                anagrams.add(str);
                mapRes.put(uniqueKey, anagrams);
            }
        }
        for(List<String> res : mapRes.values())
        {
            result.add(res);
        }
        return result;
    }
}
