package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringBinaryCode {
    public static void main(String[] args) {
        System.out.println(hasAllCodes("00110",2));
    }

    public static boolean hasAllCodes(String s, int k) {
        List<String> binary = new ArrayList<>();
        generateBinaryCode(binary,k,"");
        for(int i = k;i < s.length(); i++) {
            binary.remove(s.substring(i-k,i));
        }
        return binary.isEmpty();
    }

    public static void generateBinaryCode(List<String> binary,int k,String currString) {
        if(currString.length() == k) {
            binary.add(currString);
            return;
        }
        generateBinaryCode(binary,k,currString+"0");
        generateBinaryCode(binary,k,currString+"1");
    }
}
