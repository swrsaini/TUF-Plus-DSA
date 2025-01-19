class Solution {
    public int majorityElement(int[] nums) {
        int el = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == el){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    el = nums[i];
                    count = 1;
                }
            }
        }
        int finalCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(el == nums[i]) finalCount++;
            if(finalCount > nums.length/2){
                return el;
            }
        }
        
            
        return -1;
    }
}