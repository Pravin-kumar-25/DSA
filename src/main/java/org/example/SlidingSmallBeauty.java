package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class SlidingSmallBeauty {

    public int xThSmall(int[] sub, int x) {
        HashMap<Integer,Boolean> temp = new HashMap<>();
        for (int j : sub) {
            temp.put(j, true);
        }
        Set<Integer> arr = temp.keySet();
        int[] ar = new int[arr.size()];
        int i =0;
        for(Integer val : arr) {
            ar[i++] = val;
        }
        Arrays.sort(ar);
        return ar[x-1];
    }
}
