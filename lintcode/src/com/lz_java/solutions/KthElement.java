package com.lz_java.solutions;

//在数组中找到第k大的元素
//给出数组 [9,3,2,4,8]，第三大的元素是 4
//给出数组 [1,2,3,4,5]，第一大的元素是 5，第二大的元素是 4，第三大的元素是 3，以此类推
//要求时间复杂度为O(n)，空间复杂度为O(1)
public class KthElement {
    public static void main(String args[]) {
        int n = 4;
        int[] nums = {9,3,2,4,8};
        int res = quickSelect(nums, 0, nums.length-1, n-1);
        System.out.println(res);
    }

    public static int quickSelect(int[] nums, int start, int end, int k) {
        int pri = nums[(start+end)/2];
        int left = start;
        int right = end;
        while(left <= right) {
            while(left <= right && nums[left] > pri) left ++;
            while(left <= right && nums[right] < pri) right--;

            if (left <= right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                right --;
                left ++;
            }
        }
        if (k >= start && k<= right) {
            return quickSelect(nums, start, right, k);
        } else if(k >= left && k <= end) {
            return quickSelect(nums, left, end, k);
        }
        return nums[right+1];
    }
}
