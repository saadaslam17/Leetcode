class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;

        // Handle cases where d >= n
        k = k % n;
        
        // Reverse the entire array (0 to n-1)
        reverse(arr, 0, n - 1);

        // Reverse the first part of the array (0 to n-d-1)
        reverse(arr, 0, k - 1);

        // Reverse the second part of the array (d to n-1)
        reverse(arr, k, n - 1);

    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}