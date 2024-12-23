class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < min)
            min = nums[i];
            if(nums[i] > max)
            {
                max = nums[i];
            }
        }
        return GCD(min,max);
        
    }

    int GCD(int min, int max)
    {
        if(min == 0)
        {
            return max;
        }

        return GCD(max % min, min);
    }
}