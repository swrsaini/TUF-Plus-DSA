import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> temp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int secNum = target - nums[i];
            if(temp.containsKey(secNum)){
                return new int[]{i,temp.get(secNum)};
            }
            temp.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}