class Solution {
public:
    char nextGreatestLetter(vector<char>& nums, char target) {
        int start = 0;
        int end = nums.size() - 1;
        char ans = nums[0];

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(nums[mid] > target)
            {
                ans = nums[mid];
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return ans;
    }
};