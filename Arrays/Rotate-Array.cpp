class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k % n; // handle cases where k > n

        reverse(nums.begin(), nums.end() - k);     // reverse first part
        reverse(nums.end() - k, nums.end());       // reverse second part
        reverse(nums.begin(), nums.end());         // reverse whole array
    }
};
