class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int high = 0;

        for(int i = 1 ; i < prices.length ; i++)
        {
            if(prices[i] < low)
            {
                low = prices[i];
                continue;
            }

            else if (prices[i] > low)
            {
                int temp = prices[i] - low;

                if(high < temp)
                {
                    high = temp;
                }
            }
        }
        return high;

    }
}
