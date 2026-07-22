class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j = numbers.length-1;
        int[] result = new int[2];
        boolean s = true;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum > target){
                j--;
            }else if(sum < target){
                i++;
            }else if(sum == target){
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }
        }
        return result;
    }
}
