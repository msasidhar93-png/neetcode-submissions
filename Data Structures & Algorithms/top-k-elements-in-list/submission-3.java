class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMatch = new HashMap<>();

       int[] result = new int[k];
        for(int num: nums){
            if(countMatch.get(num) == null){
                countMatch.put(num, 1);
            }else{
                countMatch.put(num, countMatch.get(num)+1);
            }
        }

        List<Integer> keys = new ArrayList<>(countMatch.keySet());
        keys.sort((a, b) -> countMatch.get(b) - countMatch.get(a));

        for(int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

       return result; 
    }
}

