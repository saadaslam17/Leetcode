class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int i = 0; i < arr1.length; i++)
        {
            set.add(arr1[i]);
        }

        for(int j = 0; j < arr2.length; j++)
        {
            if (set.contains(arr2[j])) {
                intersection.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }
        
        int [] result  = new int[intersection.size()];
        int index = 0;
        for(int key : intersection)
        {
            result[index++] = key;
        }

        return result;
    }
}