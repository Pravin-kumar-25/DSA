package org.example;

import java.util.ArrayList;
import java.util.List;

public class CanArrange {
    public static void main(String[] args) {
        canArrange(new int[]{1,2,3,4,5,10,6,7,8,9}, 5);
    }

    public static boolean canArrange(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int val : arr) {
            list.add(val);
        }
        while(list.size() > 1) {
            boolean temp = false;
            for(int i = 1; i < list.size(); i++) {
                if((list.get(0) + list.get(i)) % k == 0) {
                    temp = true;
                    list.remove(i);
                    break;
                }
            }
            list.remove(0);
            if(!temp) {
                return false;
            }
        }
        return true;
    }
}
