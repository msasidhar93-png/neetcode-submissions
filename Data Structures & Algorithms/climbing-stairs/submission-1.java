class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        for(int i=0; i< n-1; i++){
            int temp = second;
            second = first + second;
            first = temp;
        }
        return second;
    }
}
