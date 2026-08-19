class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        Map<Integer, Integer> hp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int val = target - nums[i];
            if(hp.containsKey(val)){
                res[0] = hp.get(val);
                res[1] = i;
                break;
            }else{
                hp.put(nums[i], i);
            }
        }
        return res;
    }
}
