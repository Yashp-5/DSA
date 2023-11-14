package Questions;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    class Solution {
        int[] arr={12,34,5,12,4};
        int target=48;
        int[] ans=twoSum(arr,target);
        public int[] twoSum(int[] nums, int target) {
            int[] ans= new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        ans= new int[]{i, j};
                    }
                }
            }
            System.out.println(Arrays.toString(ans));
            return ans;
        }
    }
}
