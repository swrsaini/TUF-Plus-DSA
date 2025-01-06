class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] != largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}