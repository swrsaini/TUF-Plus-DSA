class Solution {
    public int[] quickSort(int[] nums) {
        qs(nums,0,nums.length-1);
        return nums;
    }

    private void qs(int[] nums, int low, int high){
        if(low < high){
            int pIndex = partitionIndex(nums, low, high);
            qs(nums, low, pIndex - 1);
            qs(nums, pIndex + 1, high); 
        }
    }

    private int partitionIndex(int[] nums, int low, int high){
        int i = low;
        int j = high;
        int pivot = nums[low];
        while(i < j){
            while(nums[i] <= pivot && i < high){
                i++;
            };
            while(nums[j] >= pivot && j > low){
                j--;
            }
            if(i < j){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            
        }
        nums[low] = nums[j];
        nums[j] = pivot; 
        return j;
    }
}