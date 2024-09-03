//leetcode daily question sept 3
package com.questions;

public class Solution {
    public static void main(String[] args) {
        String s = "dbvmfhnttvr";
        int k = 5;

        long value = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            long pos = ch - 'a' + 1;
            value = value + (pos * (long) (Math.pow(10, s.length() - i)));
        }
        //to sum k number of times
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            long num = value;
            while (num > 0) {
                long rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            value = sum;
        }
        System.out.println(value);
    }
}
