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
            if(it.second == 1)
            {
                nums[index] = it.first;
                index++;
            }

            else if(it.second >= 2)
            {
                nums[index] = it.first;
                nums[index + 1] = it.first;
                index = index + 2;
            }
        }
        return index;
    }
};