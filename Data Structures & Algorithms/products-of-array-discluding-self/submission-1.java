
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];

        int mul = 1;
        int mulr = 1;

        // Calculate left products
        for (int i = 0; i < n; i++) {
            left[i] = mul;
            mul = mul * nums[i];
        }

        // Calculate right products
        for (int i = n - 1; i >= 0; i--) {
            right[i] = mulr;
            mulr = mulr * nums[i];
        }

        // Multiply left and right products
        for (int i = 0; i < n; i++) {
            nums[i] = left[i] * right[i];
        }

        return nums;
    }
}
