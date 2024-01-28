class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++ ){

            for ( int j = i + 1;  j < nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }

    /*
    {5, 2, 4}
    6
     */
}


// Because it's a double for loop it's kind of slow