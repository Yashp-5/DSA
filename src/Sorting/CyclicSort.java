package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums= {1,2,5,6,3,4};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclic(int[] nums){
        int i=0;
        while(i< nums.length){
            int correct= nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp= nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
    }
}
