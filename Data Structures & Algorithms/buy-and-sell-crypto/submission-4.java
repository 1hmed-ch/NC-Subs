class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int maxDiff = 0;
        int right = 1;
        int minElem = Math.min(prices[0], prices[right]);
        // for(int i = 0; i < prices.length - 1; i++){
        //     for(int j = i+1; j < prices.length; j++){
        //         maxDiff = Math.max(maxDiff, prices[j] - prices[i]);
        //     }
        // }
        while(right < prices.length){
            minElem = Math.min(minElem, prices[right]);
            maxDiff = Math.max(maxDiff, prices[right] - minElem);
            right++;
        }
        return maxDiff;
    }
}
