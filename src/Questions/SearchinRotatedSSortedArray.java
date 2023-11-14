package Questions;
//33.https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchinRotatedSSortedArray {
    class Solution {
        public int search(int[] nums, int target) {
            int ans= -1;
            for(int i=0;i<nums.length;i++){
                if(target == nums[i]){
                    ans= i;
                }

            }
            return ans;
        }
    }
}
