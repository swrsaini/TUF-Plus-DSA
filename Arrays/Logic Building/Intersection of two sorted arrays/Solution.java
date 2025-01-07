import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List <Integer> temp = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;

        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                temp.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[temp.size()];
        int index = 0;
        for(int el : temp){
            ans[index++] = el;
        }
        return ans;
    }
}