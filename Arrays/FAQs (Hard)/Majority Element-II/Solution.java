import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(count1 > 0 && el1 == nums[i]){
                count1++;
            }
            else if(count2 > 0 && el2 == nums[i]){
                count2++;
            }
            else if(count1 == 0){
                el1 = nums[i];
                count1++;
            }
            else if(count2 == 0){
                el2 = nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        int finalCount1 = 0;
        int finalCount2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(el1 == nums[i]) finalCount1++;
            if(el2 == nums[i]) finalCount2++;
        }
        if(finalCount1 > nums.length/3){
            temp.add(el1);
        }
        if(finalCount2 > nums.length/3){
            temp.add(el2);
        }
        return temp;
    }
}