class Solution {
    public int[] bubbleSort(int[] nums) {
        for(int i = nums.length-1; i >= 0; i--){
            int didSwap = 0;
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
        return nums;
    }
}