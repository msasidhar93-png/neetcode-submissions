class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultSet = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i+1;
            int k= nums.length-1;
            while(j<k){
                int sum = nums[i] +nums[j]+nums[k];
                if(sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }else{
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(nums[i]);
                    result.add(nums[j]);
                    result.add(nums[k]);
                    j++;
                    k--;
                    resultSet.add(result);
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }
            
        }
        return resultSet;
    }
}
