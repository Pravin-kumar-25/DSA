package org.example;

import java.util.Arrays;
import java.util.TreeMap;

public class SlidingSubarrayBeauty {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSubarrayBeauty(new int[]{-46,-34,-46}, 3, 3)));
    }

    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int n = nums.length;
        int[] res = new int[n-k+1];
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
        res[0] = getMin(map,x);

        int z = 1;
        for (int i = k; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            map.put(nums[i-k], map.get(nums[i-k])-1);
            if(map.get(nums[i-k]) == 0) {
                map.remove(nums[i-k]);
            }
            res[z++] = getMin(map,x);
        }
        return res;
    }

    public static int getMin(TreeMap<Integer,Integer> map, int x) {
        int smallest = 0;
        for (Integer key : map.keySet()) {
            if(key < 0) {
                smallest = smallest + map.get(key);
            } else {
                return 0;
            }
            if (smallest >= x) {
                return key;
            }
        }
        return 0;
    }
}
