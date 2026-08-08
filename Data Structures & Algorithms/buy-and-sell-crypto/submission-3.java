class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int maxProf = 0;
        while(r < prices.length){
            int profit = prices[r]-prices[l];
            if(profit>=0){
            maxProf = Math.max(profit, maxProf);
            r++;
            }else{
                if(prices[l]>prices[r]){
                l = r;
                r++;
                }
            }
        }
        return maxProf;
    }
}
