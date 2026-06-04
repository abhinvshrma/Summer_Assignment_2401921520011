package Week_1.Day_4;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0 ; 
        int right = cols -1;
        int top = 0 ;
        int bottom = rows -1;

        List<Integer> ans = new ArrayList<>();

        while(top <= bottom && left <= right){
            for(int i = left ; i <= right ;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i= top ; i <= bottom ; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                    ans.add(matrix[bottom][i]);
                }
            bottom--;
            }
            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    ans.add(matrix[i][left]);
                }
                left++;

            }

        }


        return ans;
    }
}
