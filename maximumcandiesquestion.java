package com.questions;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> list = new ArrayList<Boolean>();
        int sum=0;
        for(int i =0 ; i < candies.length;i++){
            if(candies[i] > sum){
                sum = candies[i];
            }
        }
        for(int i =0 ; i < candies.length;i++){
            int maximum = (candies[i] + extraCandies);
            if( maximum > sum ){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        System.out.println("ArrayList : " + list.toString());
    }
}
