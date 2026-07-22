class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        HashSet<Integer> hsh = new HashSet<>();
        HashSet<Integer> firstNumbers = new HashSet<>();
        int longest =0;
        for(int i=0; i<nums.length; i++){
            hsh.add(nums[i]);
        }

        for(int hs : hsh){
            if(!hsh.contains(hs-1)){
                int length = 1;
            while(hsh.contains(hs+length)){
                length++;
            }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
