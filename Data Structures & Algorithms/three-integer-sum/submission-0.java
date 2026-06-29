class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> combinations = new ArrayList();
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){

            if(nums[i]>0){
                break;
            }
             if (i > 0 && nums[i] == nums[i - 1]) continue;
                int l = i+1;
                int r = nums.length-1;
                while(l<r){
                    int sum = nums[i] + nums[l]+ nums[r];
                    if(sum==0){
                        List<Integer> combination = new ArrayList();
                        combination.add(nums[i]);
                        combination.add(nums[l]);
                        combination.add(nums[r]);
                        combinations.add(combination);
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    }else if(sum>0){
                        r--;
                    }else{
                        l++;
                    }

            }
        }
        return combinations;
    }
}

