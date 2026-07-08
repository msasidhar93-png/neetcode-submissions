class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap();
        List<Integer>[] bucket = new List[nums.length+1];
        int[] result = new int[k];
        int idx=0;
        for(int i=0; i<bucket.length; i++){
            bucket[i] = new ArrayList<>();
        }
        for(int num: nums){
            if(!freqMap.containsKey(num)){
            freqMap.put(num, 1);
            }else{
                freqMap.computeIfPresent(num, (key, value) -> value + 1);
            }
        }
        int i=0;
        for (Integer key : freqMap.keySet()) {
            bucket[freqMap.get(key)].add(key); 
            i++;
        }
        for(int j= bucket.length-1; j>=0; j--){
            for(int num : bucket[j]){
                if(idx == k)
                break;
                result[idx++] = num;
            }
        }
        return result;
    }
}
