class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        int max = 0;
        int index = 0;

        // Finding row with max 1s
        for (int i = 0; i < row; i++) {
            int count = 0; // Reset count for each row
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                index = i; // Store the index of row with max 1s
            }
        }

        // If no row has 1s, return 0 (assuming 1-based index)
        return new int[]{index,max};
    }
}