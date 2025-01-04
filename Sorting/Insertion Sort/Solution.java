class Solution {
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public int[] insertionSort(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            for(int j = i; j > 0; j--){
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }
            }
        }
        return nums;
    }
}