class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(mp.containsKey(nums[i]))
            {
                int t = mp.get(nums[i]);

                mp.put(nums[i],t+1);
            }
            else
            {
                mp.put(nums[i],1);
            }
        }

        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(mp.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}
