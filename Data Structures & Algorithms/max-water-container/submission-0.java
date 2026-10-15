class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;

        int temp = 0;
        int max = 0;
        while(i < j)
        {

            temp = (j - i) * Math.min(heights[i], heights[j]);

            if(temp > max)
            {
                max = temp;
            }
            if(heights[i] < heights[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return max;


    }
}













