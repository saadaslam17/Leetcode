class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int [] ans = new int[m+n];
        int index = 0;
        int i = 0;
        int j = 0;
        
        while(i != m && j != n)
        {
            if(nums1[i] <= nums2[j])
            {
                ans[index] = nums1[i];
                i++;
                index++;
            }
            else{
                ans[index] = nums2[j];
                j++;
                index++;
            }
        }

        while(i < m){
            ans[index++] = nums1[i++];
        }
        while(j < n){
            ans[index++] = nums2[j++];
        }

        for(i = 0; i < ans.length; i++)
        {
            nums1[i] = ans[i];
        }

    }
}