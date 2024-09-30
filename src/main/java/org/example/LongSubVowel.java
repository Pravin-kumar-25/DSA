package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongSubVowel {
    public static void main(String[] args) {
        System.out.println(findTheLongestSubstring("id"));
    }

    public static int findTheLongestSubstring(String s) {
        int len = 0;
        if(isValid(s.substring(s.length()-1))) {
            len =1;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i,j);
                System.out.println(sub);
                if(isValid(sub)) {
                    System.out.println("Valid for : "+ sub);
                    if(len < sub.length()) {
                        len = sub.length();
                    }
                }
            }
        }
        return len;
    }

    public static boolean isValid(String s) {
        Map<Character,Integer> vowels = new HashMap<>();

        vowels.put('a',0);
        vowels.put('e',0);
        vowels.put('i',0);
        vowels.put('o',0);
        vowels.put('u',0);
        char[] temp = s.toCharArray();
        for (char c : temp) {
            if (vowels.containsKey(c)) {
                vowels.put(c, vowels.get(c) + 1);
            }
        }
        for(Map.Entry<Character,Integer> vows : vowels.entrySet()) {
            if(vows.getValue()%2 != 0) {
                return false;
            }
        }
        return true;
    }
}
