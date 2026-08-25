class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultSet = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            int j = i+1;
            int k= nums.length-1;
            while(j<k && j!=k){
                ArrayList<Integer> result = new ArrayList<>();
                int sum = nums[i] +nums[j]+nums[k];
                if(sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }else{
                    result.add(nums[i]);
                    result.add(nums[j]);
                    result.add(nums[k]);
                    if(!resultSet.contains(result)){
                        resultSet.add(result);
                    }
                    j++;
                    k--;
                }
            }
            
        }
        return resultSet;
    }
}
