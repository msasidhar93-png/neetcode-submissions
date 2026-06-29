class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> hash = new HashMap<>();  

        //for grouping the strings with length
        for(int i=0; i<strings.length; i++){
            String hashKey = getHash(strings[i]);
            if(hash.get(hashKey) == null){
            hash.put(hashKey, new ArrayList<>());
            }
            hash.get(hashKey).add(strings[i]);
        }
        List<List<String>> groups = new ArrayList<>();
        
        for(List<String> group : hash.values()){
            groups.add(group);
        }
        return groups;
    }

    public String getHash(String str){
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i < chars.length; i++){
            sb.append((char)(((chars[i]-chars[i-1]+26)%26)+'a'));
        }
        return sb.toString();
    }


}
