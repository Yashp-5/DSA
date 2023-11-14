package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]nums= {2,3,1,6,34};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void insertion(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j >0  ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                } else{
                    break;
                }
            }
        }
    }
}
