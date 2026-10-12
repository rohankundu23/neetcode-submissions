class Solution {
 public int longestConsecutive(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();

        int count2 = 0;
        for (int num : nums) {
                temp.add(num);
        }
        for (int b : temp) {
    if (!temp.contains(b - 1)) {

                int count = 1;
                int current = b;

                while (temp.contains(current + 1)) {
                    current++;
                    count++;
                }

                count2 = Math.max(count2, count);
            }
        }
        return count2;
    }
}

