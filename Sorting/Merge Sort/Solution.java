class Solution {
    public int[] mergeSort(int[] nums) {
        int n  = nums.length;
        ms(nums, 0, n-1);
        return nums;
    }

    public void ms(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        ms(arr, low, mid);
        ms(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    public void merge(int[] arr, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        List <Integer> temp = new ArrayList<>();
        
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }

        while(j <= high){
            temp.add(arr[j]);
            j++;
        }

        for(int k = low; k <= high; k++){
            arr[k] = temp.get(k-low);
        }

    }
}