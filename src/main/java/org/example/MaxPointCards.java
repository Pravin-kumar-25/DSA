package org.example;

public class MaxPointCards {
    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{1,79,80,1,1,1,200,1},3));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int result = 0;
        int total = 0;
        int n = cardPoints.length;
        for(int v : cardPoints) {
            total += v;
        }
        int subTotal = 0;
        for(int i = 0; i < n-k ;i++) {
            subTotal += cardPoints[i];
        }
        result = total - subTotal;
        for(int i = n-k; i < n ; i++) {
            subTotal = subTotal + cardPoints[i] - cardPoints[i-n+k];
            result = Math.max(result, total-subTotal);
        }
        return result;
    }
}
