class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int[] ans = new int[arr.length + 2]; // Extra space for leading and trailing zeros

        ans[0] = 0; // First element is 0
        ans[ans.length - 1] = 0; // Last element is 0

        // Copy elements from arr to ans (shifting index by 1)
        for (int i = 0; i < arr.length; i++) {
            ans[i + 1] = arr[i];
        }

        int count = 0;

        // Check for consecutive \000\
        for (int i = 1; i < ans.length - 1; i++) { // Fix: Avoid index out of bounds
            if (ans[i - 1] == 0 && ans[i] == 0 && ans[i + 1] == 0) {
                count++;
                ans[i] = 1;
            }
        }
        if(count > n)
        {
            return true;
        }
        return count == n;
    }
}