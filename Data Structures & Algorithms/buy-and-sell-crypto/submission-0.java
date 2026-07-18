class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=left+1;
        int max_num=0;
        int sum=0;

        while(right<prices.length){
            if(prices[left]<prices[right]){
            sum=prices[right]-prices[left];
            max_num=Math.max(max_num,sum);
            }
            
 
        
        else left=right;
        right++;
        }
        return max_num;
    }
}
