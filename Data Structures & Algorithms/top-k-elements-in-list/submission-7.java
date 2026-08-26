class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        for (int i = 0; i < freq.length; i++) {
    freq[i] = new ArrayList<>();
}
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int index =0;
        for(int j=freq.length-1; j>0 && index<k; j--){
            for(int n : freq[j]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
