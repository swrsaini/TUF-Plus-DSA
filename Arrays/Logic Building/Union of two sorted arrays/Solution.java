import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List <Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }
            else{
                if(union.isEmpty() || union.get(union.size()-1) != nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }
        }

        while(i < n1){
            if(union.get(union.size()-1) != nums1[i]){
                    union.add(nums1[i]);
            }
            i++;
        }
        while(j < n2){
            if(union.get(union.size()-1) != nums2[j]){
                    union.add(nums2[j]);
            }
            j++;
        }

        int index = 0;
        int[] ans = new int[union.size()];
        for(int el : union){
            ans[index++] = el;
        }
        return ans;
    }
}