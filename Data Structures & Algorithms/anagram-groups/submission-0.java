class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashmap = new HashMap<>();
        // WRITE A FOR LOOP WITH M SIZE
        for(String str : strs){
            int a[] = new int[26];
            char[] chars = str.toCharArray();
            for(char chr: chars){
                int index = chr-'a';
                a[index] = a[index]+1;
            }
            String hashcode = Arrays.toString(a);
            if(hashmap.get(hashcode) == null){
                List<String> value = new ArrayList<>();
                value.add(str);
            hashmap.put(hashcode, value);
            }else{
                hashmap.get(hashcode).add(str);
            }
        }
        List<List<String>> groups = new ArrayList<>();
        for(List<String> mapVal : hashmap.values()){
            groups.add(mapVal);
        }
    return groups;
}
}