import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> pascalRow(int n){
        
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int temp = 1;
        for(int i = 1; i < n; i++){
            
             temp = temp * (n-i);
            temp = temp / (i);
            row.add(temp);
        }
        
        return row;
    }
    public List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            list.add(pascalRow(i));
        }
        return list;
    }
}