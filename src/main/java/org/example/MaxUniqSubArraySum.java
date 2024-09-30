package org.example;

import java.util.HashMap;
import java.util.Map;

public class MaxUniqSubArraySum {
    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{1,5,4,2,9,9,9},3));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        int maxSum = 0;
        int total = 0;
        Map<Integer,Integer> temp = new HashMap<>();
        for (int i = 0; i < k; i++) {
            total += nums[i];
            temp.put(nums[i], temp.getOrDefault(nums[i], 0) + 1);
        }
        if (temp.size() == k && total > maxSum) {
            maxSum = total;
        }

        for (int i = k; i < nums.length; i++) {
            temp.put(nums[i-k], temp.get(nums[i-k]) - 1);
            total -= nums[i-k];
            if(temp.get(nums[i-k]) == 0) {
                temp.remove(nums[i-k]);
            }

            total += nums[i];
            temp.put(nums[i], temp.getOrDefault(nums[i], 0) + 1);

            if (temp.size() == k && total > maxSum) {
                maxSum = total;
            }
        }
        return maxSum;
    }
}
