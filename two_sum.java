//twosum leet code question

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr1 ={0};
        for (int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if ( nums[i] + nums[j] == target){
                    int[] arr = {i,j};
                     return arr;
                }
            }
        }
        return arr1;
    }
}
