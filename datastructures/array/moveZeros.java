
/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
*/


class Solution {
    public void moveZeroes(int[] nums) {
        int write = 0;
        
        for(int read = 0; read < nums.length; read++){
            if(nums[read] != 0){
                nums[write] = nums[read];
                write++;
            }
        }
        for(int i = write; i<nums.length; i++){
            nums[i] = 0;
        }
        
    }
}
