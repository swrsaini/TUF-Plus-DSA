class Solution {
    public int[] selectionSort(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            int smallest = i;
            for(int j = i; j < nums.length; j++){
                if(nums[j] < nums[smallest]){
                    smallest = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
        }
        return  nums;
    }
}