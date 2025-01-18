class Solution {
    private void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortZeroOneTwo(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else{
                mid++;
            }
        }
        
    }
}