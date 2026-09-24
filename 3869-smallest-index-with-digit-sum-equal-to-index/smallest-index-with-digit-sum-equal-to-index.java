class Solution {

    // Helper function to find digit sum of a number
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = digitSum(nums[i]);
            if (sum == i) {
                return i;   // found the answer
            }
        }
        return -1;  // no index matched
    }
}
