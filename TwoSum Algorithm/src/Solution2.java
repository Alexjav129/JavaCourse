import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}


    /*
    Case
    {5, 2, 4}
    6

    HashMap
    A Map is just a collection of key value pairs.
    K -> V
    1 -> 0
    4 -> 1
    {2, 1}
    And the time that the HashMap do that look up is super fast (constant time)

    If we start with the five, the HashMap says what we need to add the 5 in order to
    get our target 6? In this case is 1, and it's known as the complement.
     */



// In this solution we only need to loop on our array one time.
// So we can get rid of our nested for loop.

// It's faster but it takes a little bit more memory