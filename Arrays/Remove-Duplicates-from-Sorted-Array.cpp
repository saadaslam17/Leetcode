class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        map<int,int> freq;

        for(auto it : nums)
        {
            freq[it]++;
        }

        int index = 0;

        for(auto it : freq)
        {
            nums[index] = it.first;
            index++;
        }
        return index;
    }
};