class Solution {
    public int largestElement(int[] nums) {
        int largestElement = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > largestElement){
                largestElement = nums[i];
            }
        }
        return largestElement;
    }
}