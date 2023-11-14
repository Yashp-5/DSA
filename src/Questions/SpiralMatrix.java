package Questions;

import java.util.ArrayList;
import java.util.List;

//54. https://leetcode.com/problems/spiral-matrix/description/
public class SpiralMatrix {

        public List<Integer> spiralOrder(int[][] matrix) {
            ArrayList<Integer> list= new ArrayList<>();
            int m = matrix.length;
            int n = matrix[m-1].length;
            int rowstart=0;
            int rowend=m-1;
            int colstart=0;
            int colend= n-1;
            if(m==0)
                return list;

            while(rowstart <= rowend && colstart <= colend){
                for(int i=colstart; i<=colend;i++){
                    list.add(matrix[rowstart][i]);
                } rowstart++;
                for(int j=rowstart; j<=rowend;j++){
                    list.add(matrix[j][colend]);
                } colend--;
                if(rowstart<=rowend){
                    for(int i=colend; i>=colstart;i--){
                        list.add(matrix[rowend][i]);
                    } rowend--;
                    if(colend>=colstart){
                        for(int i=rowend; i>=rowstart;i--){
                            list.add(matrix[i][colstart]);
                        } colstart++;
                    }
                }
            }
            return list;
        }
    }

