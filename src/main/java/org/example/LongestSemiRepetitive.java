package org.example;

public class LongestSemiRepetitive {
    public static void main(String[] args) {
        System.out.println(longestSemiRepetitiveSubstring("52233"));
    }

    public static int longestSemiRepetitiveSubstring(String s) {
        int i = 0;
        int j = 1;
        boolean flag = false;
        int ind = 0;
        int n = s.length();
        int max = 0;
        while(j < n) {
            if(s.charAt(j-1) == s.charAt(j)) {
                if(flag) {
                    flag = false;
                    i = ind;
                } else {
                    max = Math.max(j-i+1,max);
                    ind = j;
                    flag = true;
                    j++;
                }
            } else {
                max = Math.max(j-i+1,max);
                j++;
            }
        }
        return Math.max(max,n-i);
    }
}
