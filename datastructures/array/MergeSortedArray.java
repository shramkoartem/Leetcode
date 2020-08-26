/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            int j = 0;
            while(nums2[i]>nums1[j] && j<m){
                j++;
            }
            if(j != m){
                for(int k=nums1.length-2; k>=j; k--){
                    nums1[k+1] = nums1[k];
                    }
                } 
            
            nums1[j] = nums2[i];
            m++;
        }
    }
}
