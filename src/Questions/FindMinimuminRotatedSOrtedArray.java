package Questions;
//153. https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class FindMinimuminRotatedSOrtedArray {
    class Solution {
        public int findMin(int[] nums) {
            int peak= findPeak(nums);
            return nums[peak+1];
        }


        static int findPeak(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // 4 cases over here
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid-1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }
}
