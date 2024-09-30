package org.example;

import java.util.*;

public class FindAllAnagram {
    public List<Integer> findAnagrams(String s, String p) {
        int k = p.length();
        int n = s.length();
        Map<Character,Integer> pMap = new HashMap<>();
        Map<Character,Integer> sMap = new HashMap<>();
        for(int i = 0;i < k; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i),0)+1);
        }

        List<Integer> result = new ArrayList<>();
        boolean flag = true;
        for(Character ch : sMap.keySet()) {
            if(!Objects.equals(pMap.get(ch), sMap.get(ch))) {
                flag = false;
                break;
            }
        }
        if(flag) {
            result.add(0);
        }
        for(int i = k; i<n; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
            sMap.put(s.charAt(i-k), sMap.getOrDefault(s.charAt(i-k),0)-1);
            if(sMap.get(s.charAt(i-k))==0) {
                sMap.remove(s.charAt(i-k));
            }
            anagramCheck(result,i-k+1,sMap,pMap);
        }
        return result;
    }

    public void anagramCheck(List<Integer> result, int index, Map<Character, Integer> sMap,Map<Character,Integer> pMap) {
        boolean flag = true;
        for(Character ch : sMap.keySet()) {
            if(!Objects.equals(pMap.get(ch), sMap.get(ch))) {
                flag = false;
                break;
            }
        }
        if(flag) {
            result.add(index);
        }
    }
}
