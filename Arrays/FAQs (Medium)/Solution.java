import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[nums.length-1]);
        int max = nums[nums.length-1];
        for(int i = nums.length-2; i >=0; i--){
            if(nums[i] > max){
                max = nums[i];
                arr.add(nums[i]);
            }
        }
        Collections.reverse(arr);
        return arr;
    }
}