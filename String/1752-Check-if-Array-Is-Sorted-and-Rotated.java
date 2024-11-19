class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Count dips in the array
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        // Check if last element forms a dip with the first element
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        // Valid if at most one dip
        return count <= 1;
    }
}
